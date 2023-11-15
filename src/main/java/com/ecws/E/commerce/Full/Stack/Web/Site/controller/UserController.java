package com.ecws.E.commerce.Full.Stack.Web.Site.controller;

import com.ecws.E.commerce.Full.Stack.Web.Site.interfaces.UserServiceInterface;
import com.ecws.E.commerce.Full.Stack.Web.Site.model.User;
import com.ecws.E.commerce.Full.Stack.Web.Site.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserServiceInterface userServiceInterface;



    @PostMapping("/registerNewUser")
    public User registerNewUser(@RequestBody User user) {
        return userServiceInterface.registerNewUser(user);
    }
}
