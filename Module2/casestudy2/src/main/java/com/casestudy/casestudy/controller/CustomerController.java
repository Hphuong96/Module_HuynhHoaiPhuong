package com.casestudy.casestudy.controller;

import com.casestudy.casestudy.entity.FuramaCustomer;
import com.casestudy.casestudy.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.Period;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("customerRegister")
    public ModelAndView getRegister() {
        return new ModelAndView("home/register", "customer", new FuramaCustomer());
    }

    @PostMapping("register")
    public ModelAndView saveCustomer(@Valid @ModelAttribute("customer") FuramaCustomer furamaCustomer, BindingResult bindingResult) {
        LocalDate currentDate = LocalDate.now();
        if (furamaCustomer.getBirthday() != null) {
            if (Period.between(furamaCustomer.getBirthday().toLocalDate(), currentDate).getYears() < 18) {
                bindingResult.addError(new FieldError("customer", "birthday",
                        "chua du tuoi"));
            }
        }
            if (bindingResult.hasErrors()) {
                return new ModelAndView("home/register");
            } else {
                furamaCustomer.setIdCustomerType((long) 1);
                customerService.saveCustomer(furamaCustomer);
                return new ModelAndView("home/registerSuccess");
            }
        }
    }

