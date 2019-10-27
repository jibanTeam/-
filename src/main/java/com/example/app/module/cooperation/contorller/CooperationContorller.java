package com.example.app.module.cooperation.contorller;


import com.example.app.currency.ResultData;
import com.example.app.module.cooperation.entity.CooperationEntity;
import com.example.app.module.cooperation.sever.CooperationSever;
import com.example.app.module.index.entity.SystemTest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags="合作模块接口",consumes="application/json", produces="application/json", protocols="http, https, ws, wss")
@RequestMapping("/explain")
@RestController
public class CooperationContorller {

    @Resource
    private CooperationSever cooperationSever;

    @ApiOperation(value = "合作功能接口",httpMethod = "POST",notes = "合作功能接口")
    @RequestMapping(value = "/index",method= RequestMethod.GET)
    public ResultData index(CooperationEntity e){

        return cooperationSever.index(e);

    }
}
