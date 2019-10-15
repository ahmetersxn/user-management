package com.ahmetersin.usermanagement.controller;

import com.ahmetersin.usermanagement.model.User;
import com.ahmetersin.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value= "/api/mongo/user")
public class UserController {


    @Autowired
    UserService userService;

    @PostMapping(value= "/create")
    public String create(@RequestBody List<User> users) {
        userService.createUser(users);
        return "Created.";
    }


}
