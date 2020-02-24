package com.casestudy.casestudy.controller;

import com.casestudy.casestudy.entity.FuramaContact;
import com.casestudy.casestudy.services.ContactService;
import com.casestudy.casestudy.services.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;

@Controller
public class BookingController {
    @Autowired
    ContactService contactService;
    @Autowired
    ServicesService servicesService;

    @GetMapping("booking/{id}")
    public ModelAndView getbooking(@PathVariable(value = "id") Long id) {
        return new ModelAndView("home/booking", "service", servicesService.getService(id));
    }

    @PostMapping("booking")
    public ModelAndView saveBooking(@RequestParam(value = "id") Long id, @RequestParam(value = "startDay") Date startDay, @RequestParam(value = "endDay") Date endDay
            , HttpServletRequest request, HttpServletResponse response) {
        FuramaContact furamaContact = new FuramaContact();
        furamaContact.setIdContact(id);
        furamaContact.setContactBeginDay(startDay);
        furamaContact.setContactEndDay(endDay);
        furamaContact.setIdService(id);
        furamaContact.setIdCustomer((long) 1);
        furamaContact.setIdEmployee((long) 1);
        contactService.saveContact(furamaContact);

        Iterable<FuramaContact> listContact = contactService.findAllByIdCustomer((long) 1);
        for (FuramaContact contact : listContact){
            String cookieValue = contact.getIdContact() + "_" + contact.getIdService() + "_" + contact.getContactBeginDay()+ "_" + contact.getContactEndDay();
            Cookie cookie = new Cookie("contact" + contact.getIdContact(),cookieValue);
            cookie.setMaxAge(60*60);
            cookie.setPath("history");
            response.addCookie(cookie);
        }
        return new ModelAndView("home/bookingSuccess");
    }
}
