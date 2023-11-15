package com.ecws.E.commerce.Full.Stack.Web.Site.service;

import com.ecws.E.commerce.Full.Stack.Web.Site.interfaces.CommonServiceInterface;
import com.ecws.E.commerce.Full.Stack.Web.Site.model.Role;
import com.ecws.E.commerce.Full.Stack.Web.Site.model.User;
import com.ecws.E.commerce.Full.Stack.Web.Site.repository.RoleRepository;
import com.ecws.E.commerce.Full.Stack.Web.Site.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CommonService implements CommonServiceInterface {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public void initRoleAndUser() {
        Role adminRole = new Role();
        adminRole.setRoleName("ADMIN");
        adminRole.setRoleDescription("ADMIN ROLE");
        roleRepository.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("USER");
        userRole.setRoleDescription("DEFAULT ROLE FOR NEWLY CREATED RECORD");
        roleRepository.save(userRole);

        User adminUser = new User();
        adminUser.setUserFirstName("ADMIN");
        adminUser.setUserLastName("ADMIN");
        adminUser.setUserPassword("ADMIN");
        adminUser.setUserName("ADMIN@123");
        adminUser.setUserPassword("ADMINPASS");
        Set<Role> adminRoles = new HashSet<Role>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userRepository.save(adminUser);

        User user = new User();
        user.setUserFirstName("BHAGYA");
        user.setUserLastName("BHAGYA");
        user.setUserPassword("BHAGYA");
        user.setUserName("BHAGYA@123");
        user.setUserPassword("BHAGYAPASS");
        Set<Role> userRoles = new HashSet<Role>();
        userRoles.add(adminRole);
        user.setRole(userRoles);
        userRepository.save(user);
    }
}
