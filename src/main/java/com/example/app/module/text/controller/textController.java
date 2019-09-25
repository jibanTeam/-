package com.example.app.module.text.controller;

import com.example.app.module.text.entity.TextVo;
import com.example.app.module.text.server.TextServer;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "text模块操作接口", consumes = "application/json", produces = "application/json", protocols = "http, https, ws, wss")
@RequestMapping("/jiFei")
@RestController
public class textController {

    @Resource
    private TextServer textServer;

    @RequestMapping(value = "/123", method = RequestMethod.GET)
    public List<TextVo> indexTest() {
        return textServer.test();

    }
}
