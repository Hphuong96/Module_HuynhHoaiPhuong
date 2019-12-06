package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class translator {
    @RequestMapping("/index")
    public String hello(){
        Map<String, String> dic = new HashMap<>();
        dic.put("hello", "Xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Quyển vở");
        dic.put("computer", "Máy tính");
        return "index";
    }
    @PostMapping("/index")
    public String trans(@RequestParam String english, Model model){
        Map<String, String> dic = new HashMap<>();
        dic.put("hello", "Xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Quyển vở");
        dic.put("computer", "Máy tính");
        String result = dic.get(english);
        String status = "Not Found";
        if (result != null) {
            model.addAttribute("english", english);
            model.addAttribute("vnd", result);
        } else {
            model.addAttribute("status",status);
        }
        return "index";
    }
}
