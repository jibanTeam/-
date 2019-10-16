package com.example.app.admin.position.controller;

import com.example.app.admin.position.sever.positionSortSever;
import com.example.app.currency.ResultData;
import com.example.app.module.index.entity.SystemTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class positionSortController {

    @Resource
    private positionSortSever positionSever;
    @RequestMapping(value = "/in",method= RequestMethod.GET)
    public void index(){

        positionSever.ins();

    }
}
