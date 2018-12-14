package com.xj.expend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
    @RequestMapping("/getName")
    public String getByName(String name){
        System.out.println("122");
        return "hi welcome to "+name;
    }
}
