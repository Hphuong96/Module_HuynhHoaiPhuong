package com.start.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hello {
    @GetMapping("/")
    public String test(){
        return "hello";
    }
}
