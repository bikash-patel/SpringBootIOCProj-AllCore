package com.bikash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bikash.dao.IEmployeeDao;
import com.bikash.model.Employee;

@Service("empSer")
public class EmployeeService implements IEmployeeService {

	@Qualifier("data")
	@Autowired
	private IEmployeeDao dao;
	@Override
	public List<Employee> getEmployeeDetails(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list=dao.retriveEmpByDes(desg1, desg2, desg3);
		list.sort((c1,c2)->c1.getEmpid().compareTo(c2.getEmpid())); 
		list.forEach(emp->{
			emp.setGrossSalary(emp.getEmpsalary()+(emp.getEmpsalary()*0.5));
			emp.setNetSalary(emp.getEmpsalary()+(emp.getEmpsalary()*0.3));
			});
		return list;
	}

}
