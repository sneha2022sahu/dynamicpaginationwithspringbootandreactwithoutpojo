package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.TableAPIDao;
import com.example.demo.dto.EnterpriseGetRowsRequest;
import com.example.demo.dto.EnterpriseGetRowsResponse;

import javax.validation.Valid;
import java.sql.SQLException;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TableAPIController {

    private TableAPIDao tableAPIDao;

    @Autowired
    public TableAPIController(@Qualifier("tableAPIDao") TableAPIDao tableAPIDao) {
        this.tableAPIDao = tableAPIDao;
    }

    @PostMapping(value = "/getRows")
    //@ResponseBody
    public EnterpriseGetRowsResponse getRows(@RequestBody @Valid EnterpriseGetRowsRequest request) {
        return tableAPIDao.getData(request);
    }
}