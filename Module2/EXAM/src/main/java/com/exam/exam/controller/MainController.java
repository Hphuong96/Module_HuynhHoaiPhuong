package com.exam.exam.controller;

import com.exam.exam.entity.Customer;
import com.exam.exam.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

@Controller
public class MainController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/")
    public String getHomePage(Model model,@PageableDefault(size = 3) Pageable pageable ,@RequestParam(defaultValue ="0" ) int page) {
        model.addAttribute("listCustomer",customerService.getAllCustomer(PageRequest.of(page,5)));
        model.addAttribute("currentPage",page);
        return "index";
//        return new ModelAndView("index", "listCustomer", customerService.getAllCustomer(PageRequest.of(page,5)));
    }
    @GetMapping("customerRegister")
    public ModelAndView getRegister() {
        return new ModelAndView("add", "customer", new Customer());
    }

    @PostMapping("save")
    public ModelAndView saveCustomer(@Valid @ModelAttribute("customer") Customer Customer, BindingResult bindingResult) {
        LocalDate currentDate = LocalDate.now();
        if (Customer.getBirthday() != null ) {
            if (Period.between(Customer.getBirthday().toLocalDate(), currentDate).getYears() < 18) {
                bindingResult.addError(new FieldError("customer", "birthday",
                        "chua du tuoi"));
            }
            if (Customer.getBirthday().toString().contains("m")){
                bindingResult.addError(new FieldError("customer", "birthday",
                        "trong"));
            }
        }
        if (bindingResult.hasErrors()) {
            return new ModelAndView("add");
        } else {
            customerService.saveCustomer(Customer);
            return new ModelAndView("addSuccess");
        }
    }
    @GetMapping("/edit/{id}")
    public String editEmployee(@PathVariable long id, Model model) {
        model.addAttribute("customer", customerService.getCustomer(id));
        return "edit";
    }

    @PostMapping("edit")
    public String saveCustomerEdit(@Validated @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "edit";
        }
        customerService.saveCustomer(customer);
        return "redirect:/";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable long id){
        customerService.deleteCustomer(id);
        return "redirect:/";
    }
}

