package com.ecws.E.commerce.Full.Stack.Web.Site.controller;

import com.ecws.E.commerce.Full.Stack.Web.Site.interfaces.RoleServiceInterface;
import com.ecws.E.commerce.Full.Stack.Web.Site.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RoleController {

    @Autowired
    private RoleServiceInterface roleServiceInterface;

    @PostMapping({"/createNewRole"})
    public Role createNewRole(@RequestBody Role role) {
        return roleServiceInterface.createNewRole(role);
    }
}
