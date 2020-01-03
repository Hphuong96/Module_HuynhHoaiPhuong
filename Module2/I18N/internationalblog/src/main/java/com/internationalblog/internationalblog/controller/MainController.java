package com.internationalblog.internationalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value = {"/","/login"})
    public String statisResourcer(Model model){
        return "login";
    }
}
