package com.example.app.module.system;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class systemcontroller {
        @RequestMapping("/demo")
        public String sample(Model model){

            return "index";

        }


}
