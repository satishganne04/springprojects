package com.springreactmicro.springreactmicro.contoroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springreactmicro.springreactmicro.model.User;
import com.springreactmicro.springreactmicro.service.UserManagmentService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class Contoroller {
	
	 @Autowired
	 private UserManagmentService usermanagmentservice;
	 
	  @PostMapping("/departments")
	    public User saveUser(@Validated @RequestBody User user)
	    {
	        return usermanagmentservice.saveUser(user);
	    }
	  @GetMapping("api")
	  public String message() {
		  return "satish";
	  }
	 
	

}
