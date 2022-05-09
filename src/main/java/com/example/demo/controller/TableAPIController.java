package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TableAPIDao;
import com.example.demo.request.EnterpriseGetRowsRequest;
import com.example.demo.response.EnterpriseGetRowsResponse;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TableAPIController {

    private TableAPIDao tradeDao;

    @Autowired
    public TableAPIController(@Qualifier("tradeDao") TableAPIDao tradeDao) {
        this.tradeDao = tradeDao;
    }

    @PostMapping( value = "/getRows")
    //@ResponseBody
    public EnterpriseGetRowsResponse getRows(@RequestBody EnterpriseGetRowsRequest request) {
        return tradeDao.getData(request);
    }
}