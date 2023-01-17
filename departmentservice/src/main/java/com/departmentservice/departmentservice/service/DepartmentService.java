package com.departmentservice.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.departmentservice.departmentservice.entity.Department;

import com.departmentservice.departmentservice.feignclients.StudentFeignClien;
import com.departmentservice.departmentservice.repository.DepartmentRepository;
import com.departmentservice.departmentservice.response.DepartmentResponse;
import com.departmentservice.departmentservice.response.StudentResponse;

@Service
public class DepartmentService {
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	WebClient webClient;
	/*
	 * @Autowired AddressFeignClient addressFeignClient;
	 */
	@Autowired
	StudentFeignClien studentfeignclient;
	
	

	public DepartmentResponse getById(long id) {
		Department department = departmentRepository.findById(id).get();
		DepartmentResponse deaprtmentresponse=new DepartmentResponse(department);
		deaprtmentresponse.setStudentResponse(studentfeignclient.getById(department.getId()));
	//	deaprtmentresponse.setAddressResponse(addressFeignClient.getById(department.getId()));
        return deaprtmentresponse;
	}
	

}
