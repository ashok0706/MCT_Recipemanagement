package com.xadmin.swagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.xadmin.swagger.model.User;

@Service
public interface UserRepo extends JpaRepository<User,String> {

}
