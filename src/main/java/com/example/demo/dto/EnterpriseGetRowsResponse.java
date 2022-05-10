package com.example.demo.dto;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class EnterpriseGetRowsResponse {
	private List<Map<String, Object>> data;
	private int lastRow;
	private List<String> secondaryColumnFields;

	public EnterpriseGetRowsResponse() {
	}

	public EnterpriseGetRowsResponse(List<Map<String, Object>> data, int lastRow, List<String> secondaryColumnFields) {
		this.data = data;
		this.lastRow = lastRow;
		this.secondaryColumnFields = secondaryColumnFields;
	}
}