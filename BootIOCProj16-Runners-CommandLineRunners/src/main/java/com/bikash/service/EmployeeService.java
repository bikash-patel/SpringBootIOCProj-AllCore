package com.bikash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikash.dao.IEmployeeDao;
import com.bikash.model.Employee;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	private IEmployeeDao dao;

	@Override
	public String employeeRegister(Employee emp) throws Exception {
		String msg=dao.registerEmployee(emp);
		return msg;
	}

	@Override
	public List<Employee> employeeSearch(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list=dao.searchByDesg(desg1, desg2, desg3);
		return list;
	}

}
