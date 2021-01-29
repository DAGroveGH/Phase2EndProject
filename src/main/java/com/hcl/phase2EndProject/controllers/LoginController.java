package com.hcl.phase2EndProject.controllers;

import com.hcl.phase2EndProject.models.User;
import com.hcl.phase2EndProject.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model) {
        return "login";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String login(Model model, @ModelAttribute("user") User user) {
        if(user != null && user.getUsername() != "" && user.getPassword() != "") {
            if(loginService.login(user)) {
                return "welcome";
            }
        }
        model.addAttribute("error", "Invalid Credentials");
        return "login";
    }

}
