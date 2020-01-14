package com.casestudy.casestudy.controller;

import com.casestudy.casestudy.entity.FuramaContact;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Controller
public class History {
    @GetMapping("history")
    public ModelAndView getHistory(HttpServletRequest request, HttpServletResponse response){
        Cookie[] cookie = request.getCookies();
        List<FuramaContact> list = new ArrayList<>();
        for (int i= 0;i<cookie.length;i++){
            if (cookie[i].getName().contains("contact")){
                FuramaContact furamaContact = new FuramaContact();
                String[] cookieValue = cookie[i].getValue().split("_");
                furamaContact.setIdContact(Long.parseLong(cookieValue[0]));
                furamaContact.setIdService(Long.parseLong(cookieValue[1]));
                furamaContact.setContactBeginDay(Date.valueOf(cookieValue[2]));
                furamaContact.setContactEndDay(Date.valueOf(cookieValue[3]));
                list.add(furamaContact);
            }
        }
        return new ModelAndView("history","cookie",list);
    }
}
