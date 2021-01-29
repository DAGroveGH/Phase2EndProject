package com.hcl.phase2EndProject.controllers;

import com.hcl.phase2EndProject.models.User;
import com.hcl.phase2EndProject.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @RequestMapping(value="/register", method= RequestMethod.GET)
    public String showRegisterPage(Model model) {
        return "register";
    }

    @RequestMapping(value="/register", method = RequestMethod.POST)
    public String register(Model model, @ModelAttribute("user") User user) {
        if(user != null && user.getUsername() != "" && user.getPassword() != "") {
            if(registerService.createAccount(user)) {
                return "welcome";
            }else {
                model.addAttribute("error", "Username already in use!");
                return "register";
            }
        }else {
            model.addAttribute("error", "Please fill in all fields");
            return "register";
        }
    }
}
