package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class SortModel implements Serializable {

	private String colId;
	private String sort;

	public SortModel() {
	}

}
