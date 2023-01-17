package com.departmentservice.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.departmentservice.departmentservice.response.DepartmentResponse;
import com.departmentservice.departmentservice.service.DepartmentService;



@RestController
@RequestMapping("/api/department")
public class DepartmentController {
	@Autowired
	DepartmentService departmentservice;
	
	@GetMapping("/getById/{id}")
	public DepartmentResponse getById (@PathVariable long id) {
		return departmentservice.getById(id);
	
	}

}
