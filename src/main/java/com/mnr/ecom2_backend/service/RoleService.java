package com.mnr.ecom2_backend.service;

import com.mnr.ecom2_backend.dao.RoleDao;
import com.mnr.ecom2_backend.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role){
        return roleDao.save(role);

    }


}
