package controllers;

import dao.UserDao;
import model.login;
import model.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserControllers {
    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home", "login", new login());
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") login login) {
        user user = UserDao.checkLogin(login);
        if (user == null) {
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("user");
            modelAndView.addObject("user", user);
            return modelAndView;
        }
    }
}
