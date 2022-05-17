package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public @Data class ColumnVO implements Serializable {
    private String id;
    private String displayName;
    private String field;
    private String aggFunc;
}