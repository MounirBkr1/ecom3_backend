package com.mnr.ecom2_backend.controller;

import com.mnr.ecom2_backend.dao.RoleDao;
import com.mnr.ecom2_backend.dao.UserDao;
import com.mnr.ecom2_backend.entity.Role;
import com.mnr.ecom2_backend.entity.User;
import com.mnr.ecom2_backend.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @PostConstruct
    public void initRolesAndUsers(){
        userService.initRolesAndUser();
    }


    @PostMapping("createNewUser")
    public User registerNewUser(@RequestBody  User user){
        return userService.createNewUser(user);
    }




}
