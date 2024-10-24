package com.bikash.dao;

import java.util.List;

import com.bikash.model.Employee;

public interface IEmployeeDao {
	public String registerEmployee(Employee emp) throws Exception;
	public List<Employee> searchByDesg(String desg1,String desg2,String desg3) throws Exception;
}
