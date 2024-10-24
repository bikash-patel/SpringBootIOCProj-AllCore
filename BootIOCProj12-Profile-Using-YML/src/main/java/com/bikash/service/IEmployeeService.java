package com.bikash.service;

import java.util.List;

import com.bikash.model.Employee;

public interface IEmployeeService {
	public String employeeRegister(Employee emp) throws Exception; 
	public List<Employee> employeeSearch(String desg1,String desg2,String desg3) throws Exception; 
}
