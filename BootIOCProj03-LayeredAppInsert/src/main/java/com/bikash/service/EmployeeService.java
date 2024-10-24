package com.bikash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bikash.dao.IEmployeeDao;
import com.bikash.model.Employee;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	@Qualifier("database")
	private IEmployeeDao dao;
	@Override
	public String registerEmployee(Employee emp) throws Exception {
		//Calling Dao class method
		String msg=dao.insertEmployee(emp);
		return msg;
	}

}
