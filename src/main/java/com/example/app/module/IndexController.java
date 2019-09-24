package com.example.app.module;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @RequestMapping("/index")
    public Object index(){

        Map map=new HashMap<>();
        map.put("status","true");
        return map;

    }


}
