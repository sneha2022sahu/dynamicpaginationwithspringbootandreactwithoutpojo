package com.example.demo.dto;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnterpriseGetRowsResponse {
    private List<Map<String, Object>> data;
    private int lastRow;
    private List<String> secondaryColumnFields;

}