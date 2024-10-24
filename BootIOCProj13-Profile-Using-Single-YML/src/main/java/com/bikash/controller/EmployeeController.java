package com.bikash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bikash.model.Employee;
import com.bikash.service.IEmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private IEmployeeService service;
	public String insert(Employee emp) throws Exception
	{
	String msg=service.employeeRegister(emp);
     return msg;	
	}
	public List<Employee> search(String desg1,String desg2,String desg3) throws Exception
	{
		List<Employee> list=service.employeeSearch(desg1, desg2, desg3);
		return list;
	}
	                                               
}
