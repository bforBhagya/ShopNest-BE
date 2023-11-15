package com.ecws.E.commerce.Full.Stack.Web.Site.service;

import com.ecws.E.commerce.Full.Stack.Web.Site.interfaces.RoleServiceInterface;
import com.ecws.E.commerce.Full.Stack.Web.Site.model.Role;
import com.ecws.E.commerce.Full.Stack.Web.Site.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements RoleServiceInterface {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role createNewRole( Role role) {
        return roleRepository.save(role);
    }
}
