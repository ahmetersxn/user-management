package com.ahmetersin.usermanagement.controller;

import com.ahmetersin.usermanagement.model.User;
import com.ahmetersin.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;


@RestController
@RequestMapping(value= "/api")
public class RestUserController {

    @Autowired
    UserService userService;

    @GetMapping(value= "/user")
    public Collection<User> users() {
        return userService.getAllUsers();
    }


}
