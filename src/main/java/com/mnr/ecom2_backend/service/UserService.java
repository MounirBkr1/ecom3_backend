package com.mnr.ecom2_backend.service;

import com.mnr.ecom2_backend.dao.RoleDao;
import com.mnr.ecom2_backend.dao.UserDao;
import com.mnr.ecom2_backend.entity.Role;
import com.mnr.ecom2_backend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    public User createNewUser(User user){
        return  userDao.save(user);
    }

    public void initRolesAndUser(){
        Role adminRole = new Role();
        adminRole.setRoleName("admin");
        adminRole.setRoleDescription("Admin role ");
        roleDao.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("User role  for newly created role ");
        roleDao.save(userRole);

        User adminUser= new User();
        adminUser.setUserFirstName("Admin");
        adminUser.setUserLastName("admin");
        adminUser.setUserName("admin123");
        adminUser.setUserPassword("admin@pass");
        Set<Role> adminRoles= new HashSet<>();
        adminRoles.add(adminRole);
        adminRoles.add(userRole);
        adminUser.setRole(adminRoles);
        userDao.save(adminUser);

        User user= new User();
        user.setUserFirstName("mnr");
        user.setUserLastName("bkr");
        user.setUserName("mnr123");
        user.setUserPassword("mnr@pass");
        Set<Role> userRoles= new HashSet<>();
        userRoles.add(userRole);
        user.setRole(userRoles);
        userDao.save(user);



    }
}
