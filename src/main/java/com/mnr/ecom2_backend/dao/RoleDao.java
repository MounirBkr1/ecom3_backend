package com.mnr.ecom2_backend.dao;

import com.mnr.ecom2_backend.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role,String> {
}
