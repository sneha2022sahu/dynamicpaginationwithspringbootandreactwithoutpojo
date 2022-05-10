package com.example.demo.dto;

import lombok.Data;

@Data
public class NumberColumnFilter extends ColumnFilter {
	private String type;
	private Integer filter;
	private Integer filterTo;

	public NumberColumnFilter() {
	}

}
