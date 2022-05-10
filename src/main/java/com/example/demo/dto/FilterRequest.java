package com.example.demo.dto;

import java.util.Map;

import lombok.Data;

@Data
public class FilterRequest {

	private Map<String, ColumnFilter> filterModel;

	public FilterRequest() {
	}

	public FilterRequest(Map<String, ColumnFilter> filterModel) {
		this.filterModel = filterModel;
	}

}
