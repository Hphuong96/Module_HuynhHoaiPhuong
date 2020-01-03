package com.example.counter.counter.controller;

import com.example.counter.counter.model.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("mycounter")
public class MainController {
    @ModelAttribute("mycounter")
    public Counter setUpCounter(){
        return new Counter();
    }
    @GetMapping("/")
    public String get(@ModelAttribute("mycounter") Counter counter){
        counter.increment();
        return "index";
    }
}
