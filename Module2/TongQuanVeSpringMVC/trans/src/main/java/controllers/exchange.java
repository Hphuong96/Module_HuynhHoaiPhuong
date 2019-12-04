package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class exchange {
   @GetMapping("/index")
       public String exchange1(){
           return "index";
   }
   @PostMapping("/index")
    public String exchange2(@RequestParam double rate, @RequestParam double usd , Model model){
       double vnd = rate*usd;

       model.addAttribute("vnd", String.format("%.3f",vnd));
       model.addAttribute("usd", String.format("%.3f",usd));
       model.addAttribute("rate",rate);
       return "index";
   }
}