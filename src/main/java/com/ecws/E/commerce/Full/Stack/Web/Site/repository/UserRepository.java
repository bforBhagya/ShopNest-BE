package com.ecws.E.commerce.Full.Stack.Web.Site.repository;

import com.ecws.E.commerce.Full.Stack.Web.Site.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
}
