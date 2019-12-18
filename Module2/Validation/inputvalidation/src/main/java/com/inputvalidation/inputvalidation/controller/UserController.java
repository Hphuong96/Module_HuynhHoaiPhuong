package com.inputvalidation.inputvalidation.controller;


import com.inputvalidation.inputvalidation.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/")
    public ModelAndView inputForm(){
        return new ModelAndView("index","user",new User());
    }
    @PostMapping("/validator")
    public ModelAndView result(@Validated @ModelAttribute("user") User user, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return new ModelAndView("index");
        } else {
            return new ModelAndView("result");
        }
    }
}
