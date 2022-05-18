package com.example.demo.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor

public @Data class ColumnVO implements Serializable {
    private String id;
    private String displayName;
    private String field;
    private String aggFunc;
}