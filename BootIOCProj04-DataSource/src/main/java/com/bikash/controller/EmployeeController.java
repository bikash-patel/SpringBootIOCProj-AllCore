package com.bikash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bikash.model.Employee;
import com.bikash.service.IEmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private IEmployeeService empSer;
	
	public List<Employee> getEmployee(String desg1,String desg2,String desg3) throws Exception
	{
		List<Employee> list=empSer.getEmployeeDetails(desg1, desg2, desg3);
		return list;
	}
}
