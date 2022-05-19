package com.example.demo.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnterpriseGetRowsRequest implements Serializable {
    @NonNull
    private int startRow, endRow;

    // row group columns
    @NonNull
    private List<ColumnVO> rowGroupCols;

    // value columns
    @NonNull
    private List<ColumnVO> valueCols;

    // pivot columns
    @NonNull
    private List<ColumnVO> pivotCols;

    // true if pivot mode is one, otherwise false
    @NonNull
    private boolean pivotMode;

    // what groups the user is viewing
    @NonNull
    private List<String> groupKeys;

    // if filtering, what the filter model is
    @NonNull
    private Map<String, ColumnFilter> filterModel;

    // if sorting, what the sort model is
    @NonNull
    private List<SortModel> sortModel;

}