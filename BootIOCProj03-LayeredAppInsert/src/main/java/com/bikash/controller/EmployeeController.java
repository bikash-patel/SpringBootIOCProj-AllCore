package com.bikash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bikash.model.Employee;
import com.bikash.service.IEmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private IEmployeeService empService;
	public String register(Employee emp) throws Exception
	{
		//Calling Service class method
		String msg=empService.registerEmployee(emp);
		return msg;
	}
	
}
