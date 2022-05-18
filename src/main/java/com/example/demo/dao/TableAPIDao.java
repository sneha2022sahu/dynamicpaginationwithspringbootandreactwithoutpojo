package com.example.demo.dao;

import static com.example.demo.builder.EnterpriseResponseBuilder.createResponse;
import static java.lang.String.format;
import static java.util.stream.Collectors.toMap;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.builder.OracleSqlQueryBuilder;
import com.example.demo.dto.ColumnVO;
import com.example.demo.dto.EnterpriseGetRowsRequest;
import com.example.demo.dto.EnterpriseGetRowsResponse;

@Repository("tableAPIDao")
public class TableAPIDao {

    private JdbcTemplate template;
    private OracleSqlQueryBuilder queryBuilder;

    @Value("${TABLENAME}")
    private String tableName;

    @Autowired
    public TableAPIDao(JdbcTemplate template) {
        this.template = template;
        queryBuilder = new OracleSqlQueryBuilder();
    }

    public EnterpriseGetRowsResponse getData(EnterpriseGetRowsRequest request) {
        // String tableName = "trade"; // could be supplied in request as a lookup key?

        // first obtain the pivot values from the DB for the requested pivot columns
        Map<String, List<String>> pivotValues = getPivotValues(request.getPivotCols());
        System.out.println("TABLENAME............." + tableName);

        // generate sql
        String sql = queryBuilder.createSql(request, tableName, pivotValues);

        // query db for rows
        List<Map<String, Object>> rows = template.queryForList(sql);

        // create response with our results
        return createResponse(request, rows, pivotValues);
    }

    private Map<String, List<String>> getPivotValues(List<ColumnVO> pivotCols) {
        return pivotCols.stream().map(ColumnVO::getField)
                .collect(toMap(pivotCol -> pivotCol, this::getPivotValues, (a, b) -> a, LinkedHashMap::new));
    }

    private List<String> getPivotValues(String pivotColumn) {
        String sql = "SELECT DISTINCT %s FROM" + tableName;
        return template.queryForList(format(sql, pivotColumn), String.class);
    }
}