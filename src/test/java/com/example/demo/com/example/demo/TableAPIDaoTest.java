package com.example.demo.com.example.demo;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.demo.dao.TableAPIDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo.dto.EnterpriseGetRowsRequest;
import com.example.demo.dto.EnterpriseGetRowsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;


@RunWith(SpringJUnit4ClassRunner.class)
public class TableAPIDaoTest {

    @InjectMocks
    private TableAPIDao tableAPIDao;

    @Mock
    JdbcTemplate jdbcTemplate;


    @Before public void setUp(){
        EnterpriseGetRowsRequest request = new EnterpriseGetRowsRequest();
    }

    @Test
    public void geDataFromEnterpriseGetRowsResponse() {

        /*
         * EnterpriseGetRowsRequest request = new EnterpriseGetRowsRequest();
         *
         * ColumnVO colmnVo= new ColumnVO();
         *
         * List<ColumnVO> colomnVoList= new ArrayList<>();
         *
         * colomnVoList.add(colmnVo);
         */
        String json="{\"startRow\":0,\"endRow\":100,\"rowGroupCols\":[{\"id\":\"PRODUCT\",\"displayName\":\"Product\",\"field\":\"PRODUCT\"},{\"id\":\"PORTFOLIO\",\"displayName\":\"Portfolio\",\"field\":\"PORTFOLIO\"},{\"id\":\"BOOK\",\"displayName\":\"Book\",\"field\":\"BOOK\"}],\"valueCols\":[{\"id\":\"CURRENTVALUE\",\"aggFunc\":\"sum\",\"displayName\":\"Current\",\"field\":\"CURRENTVALUE\"},{\"id\":\"PREVIOUSVALUE\",\"aggFunc\":\"sum\",\"displayName\":\"Previous\",\"field\":\"PREVIOUSVALUE\"},{\"id\":\"PL1\",\"aggFunc\":\"sum\",\"displayName\":\"PL 1\",\"field\":\"PL1\"},{\"id\":\"PL2\",\"aggFunc\":\"sum\",\"displayName\":\"PL 2\",\"field\":\"PL2\"},{\"id\":\"GAINDX\",\"aggFunc\":\"sum\",\"displayName\":\"Gain-DX\",\"field\":\"GAINDX\"},{\"id\":\"SXPX\",\"aggFunc\":\"sum\",\"displayName\":\"SX / PX\",\"field\":\"SXPX\"},{\"id\":\"X99OUT\",\"aggFunc\":\"sum\",\"displayName\":\"99 Out\",\"field\":\"X99OUT\"}],\"pivotCols\":[],\"pivotMode\":false,\"groupKeys\":[],\"filterModel\":{},\"sortModel\":[]}";


        ObjectMapper m = new ObjectMapper();
        EnterpriseGetRowsRequest request = null;
        try {
            request = m.readValue(json, EnterpriseGetRowsRequest.class);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(request);


        List<Map<String, Object>> response = new ArrayList<Map<String, Object>>();

        when(jdbcTemplate.queryForList(Mockito.anyString())).thenReturn(response);
        EnterpriseGetRowsResponse expectedResponse = tableAPIDao.getData(request);

        assertNotNull(expectedResponse);

    }

}
