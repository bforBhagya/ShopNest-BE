package com.ecws.E.commerce.Full.Stack.Web.Site.controller;

import com.ecws.E.commerce.Full.Stack.Web.Site.interfaces.CommonServiceInterface;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CommonController {
    @Autowired
    private CommonServiceInterface commonServiceInterface;
    @PostConstruct
    public void initRolesAndUsers() {
        commonServiceInterface.initRoleAndUser();
    }
}
