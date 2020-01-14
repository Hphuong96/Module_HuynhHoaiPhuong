package com.casestudy.casestudy.controller;

import com.casestudy.casestudy.services.ServicesService;
import com.casestudy.casestudy.services.serviceImpl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @Autowired
    ServicesService servicesService;

    @GetMapping("/")
    public ModelAndView getHomePage(@RequestParam(value = "toPrice", required = false) Integer toPrice, @RequestParam(value = "fromPrice", required = false) Integer fromPrice) {
        if (toPrice == null || fromPrice == null) {
            return new ModelAndView("home/home", "listService", servicesService.getAllService());
        } else {
            return new ModelAndView("home/home", "listService", servicesService.findAllByRentCostBetween(fromPrice, toPrice));
        }
    }

    @GetMapping("/service/{id}")
    public ModelAndView getServiceDetail(@PathVariable Long id) {
        return new ModelAndView("home/detail", "detailService", servicesService.getService(id));
    }

}
