package com.example.demo.dto;

import java.util.List;

import lombok.Data;

@Data
public class SetColumnFilter extends ColumnFilter {
	private List<String> values;

	public SetColumnFilter() {
	}

}
