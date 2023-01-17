package com.departmentservice.departmentservice.response;

import com.departmentservice.departmentservice.entity.Department;

public class DepartmentResponse {
	
	private Long id;
	private String department;
	private StudentResponse studentResponse;
	private AddressResponse addressResponse;
	
	
	public DepartmentResponse(Department department) {
		super();
		this.id = department.getId();
		this.department = department.getDepartment();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public StudentResponse getStudentResponse() {
		return studentResponse;
	}
	public void setStudentResponse(StudentResponse studentResponse) {
		this.studentResponse = studentResponse;
	}
	public AddressResponse getAddressResponse() {
		return addressResponse;
	}
	public void setAddressResponse(AddressResponse addressResponse) {
		this.addressResponse = addressResponse;
	}
	
	
	
}