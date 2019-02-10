package com.config.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author li
 * 2019/1/19 21:19
 * version 1.0
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "hello1asfff";
    }
    
}
