package com.ahmetersin.usermanagement.controller;


import com.ahmetersin.usermanagement.model.User;
import com.ahmetersin.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("user", userService.getAllUsers());
        return "index";
    }

    @RequestMapping(value= "/createuser" , method = RequestMethod.POST)
    public String createUser(@ModelAttribute User user) {

        userService.createUser(user);
        return "redirect:/";
    }

}