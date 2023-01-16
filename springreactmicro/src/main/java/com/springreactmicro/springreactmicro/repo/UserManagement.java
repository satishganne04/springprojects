package com.springreactmicro.springreactmicro.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreactmicro.springreactmicro.model.User;
@Repository
public interface UserManagement extends JpaRepository<User,Integer>{

}
