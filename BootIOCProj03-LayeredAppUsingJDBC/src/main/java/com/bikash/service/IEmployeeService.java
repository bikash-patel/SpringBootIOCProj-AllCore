package com.bikash.service;

import java.util.List;

import com.bikash.model.Employee;

public interface IEmployeeService {
	public List<Employee> getEmployeeDetails(String desg1,String desg2,String desg3) throws Exception;
}
