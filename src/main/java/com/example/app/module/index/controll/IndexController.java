package com.example.app.module.index.controll;


import com.example.app.module.index.server.SystemTestServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @Resource
    private SystemTestServer systemTestServer;

    @RequestMapping("/indexDemo")
    public Object index(){

        return systemTestServer.getTask();

    }


}
