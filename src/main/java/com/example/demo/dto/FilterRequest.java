package com.example.demo.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FilterRequest {

    private Map<String, ColumnFilter> filterModel;

    public FilterRequest() {
    }


}
