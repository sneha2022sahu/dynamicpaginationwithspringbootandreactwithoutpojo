package com.example.demo.builder;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo.dto.EnterpriseGetRowsRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
public class OracleSqlQueryBuilderTest {

    @InjectMocks
    private OracleSqlQueryBuilder oracleSqlQueryBuilder;

    @Test
    public void createSql() {


        String json = "{\"startRow\":0,\"endRow\":100,\"rowGroupCols\":[{\"id\":\"PRODUCT\",\"displayName\":\"Product\",\"field\":\"PRODUCT\"},{\"id\":\"PORTFOLIO\",\"displayName\":\"Portfolio\",\"field\":\"PORTFOLIO\"},{\"id\":\"BOOK\",\"displayName\":\"Book\",\"field\":\"BOOK\"}],\"valueCols\":[{\"id\":\"CURRENTVALUE\",\"aggFunc\":\"sum\",\"displayName\":\"Current\",\"field\":\"CURRENTVALUE\"},{\"id\":\"PREVIOUSVALUE\",\"aggFunc\":\"sum\",\"displayName\":\"Previous\",\"field\":\"PREVIOUSVALUE\"},{\"id\":\"PL1\",\"aggFunc\":\"sum\",\"displayName\":\"PL 1\",\"field\":\"PL1\"},{\"id\":\"PL2\",\"aggFunc\":\"sum\",\"displayName\":\"PL 2\",\"field\":\"PL2\"},{\"id\":\"GAINDX\",\"aggFunc\":\"sum\",\"displayName\":\"Gain-DX\",\"field\":\"GAINDX\"},{\"id\":\"SXPX\",\"aggFunc\":\"sum\",\"displayName\":\"SX / PX\",\"field\":\"SXPX\"},{\"id\":\"X99OUT\",\"aggFunc\":\"sum\",\"displayName\":\"99 Out\",\"field\":\"X99OUT\"}],\"pivotCols\":[],\"pivotMode\":false,\"groupKeys\":[],\"filterModel\":{},\"sortModel\":[]}";

        ObjectMapper m = new ObjectMapper();
        EnterpriseGetRowsRequest request = null;
        try {
            request = m.readValue(json, EnterpriseGetRowsRequest.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, List<String>> pivotValues = new HashMap<String, List<String>>();


        List<Map<String, Object>> response = new ArrayList<Map<String, Object>>();

        String expectedResponse = oracleSqlQueryBuilder.createSql(request, Mockito.anyString(), pivotValues);

        assertNotNull(expectedResponse);
    }

}