package com.example.demo.request;

import java.util.Map;

import com.example.demo.filter.ColumnFilter;

public class FilterRequest {

    private Map<String, ColumnFilter> filterModel;

    public FilterRequest() {}

    public FilterRequest(Map<String, ColumnFilter> filterModel) {
        this.filterModel = filterModel;
    }

    public Map<String, ColumnFilter> getFilterModel() {
        return filterModel;
    }

    public void setFilterModel(Map<String, ColumnFilter> filterModel) {
        this.filterModel = filterModel;
    }

    @Override
    public String toString() {
        return "FilterRequest{" +
                "filterModel=" + filterModel +
                '}';
    }
}
