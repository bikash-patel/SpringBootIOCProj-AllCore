package com.bikash.dao;

import java.util.List;

import com.bikash.model.Employee;

public interface IEmployeeDao {
	public List<Employee> retriveEmpByDes(String desg1,String desg2,String desg3) throws Exception;
}
