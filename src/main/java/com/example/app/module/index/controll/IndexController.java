package com.example.app.module.index.controll;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @RequestMapping("/indexDemo")
    public Object index(){

        Map<Object, Object> map=new HashMap<>();
        map.put("status","true");
        return map;

    }


}
