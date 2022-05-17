package com.example.demo.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SetColumnFilter extends ColumnFilter {
    private List<String> values;


}
