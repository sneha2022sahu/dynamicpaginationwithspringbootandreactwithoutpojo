package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SortModel implements Serializable {

    private String colId;
    private String sort;


}
