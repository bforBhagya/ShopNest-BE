package com.ecws.E.commerce.Full.Stack.Web.Site.service;

import com.ecws.E.commerce.Full.Stack.Web.Site.interfaces.UserServiceInterface;
import com.ecws.E.commerce.Full.Stack.Web.Site.model.Role;
import com.ecws.E.commerce.Full.Stack.Web.Site.model.User;
import com.ecws.E.commerce.Full.Stack.Web.Site.repository.RoleRepository;
import com.ecws.E.commerce.Full.Stack.Web.Site.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService implements UserServiceInterface {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerNewUser(User user) {
        return userRepository.save(user);
    }


}
