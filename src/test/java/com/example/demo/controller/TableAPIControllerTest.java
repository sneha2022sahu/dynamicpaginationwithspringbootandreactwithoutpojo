package com.example.demo.controller;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.TableAPIDao;
import com.example.demo.dto.EnterpriseGetRowsRequest;
import com.example.demo.dto.EnterpriseGetRowsResponse;

@RunWith(SpringRunner.class)

public class TableAPIControllerTest {

	@InjectMocks
	private TableAPIController tableAPIController;

	@Mock
	private TableAPIDao tableAPIDao;

	@Test
	public void getRowsFromEnterpriseGetRowsResponse() {

		EnterpriseGetRowsRequest request = new EnterpriseGetRowsRequest();
		EnterpriseGetRowsResponse response = new EnterpriseGetRowsResponse();
		when(tableAPIDao.getData(request)).thenReturn(response);
		EnterpriseGetRowsResponse expectedResponse = tableAPIController.getRows(request);

		assertNotNull(expectedResponse);

	}

}
