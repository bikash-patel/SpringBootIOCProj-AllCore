package com.bikash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bikash.model.Employee;

@Repository
public class EmployeeMySQLDao implements IEmployeeDao {

	private final String INSERT_QUERY="INSERT INTO EMPLOYEE(empname,empsal,empdeg,deptno) VALUES(?,?,?,?)";
	
	private String msg=null; 
	
	@Autowired
	private DataSource ds;  //Common DataSource interface
	@Override
	public String insertEmployee(Employee emp) throws Exception {
		// TODO Auto-generated method stub
		try(//Connection object using pooled connection
				Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(INSERT_QUERY);)
		{
			 ps.setString(1,emp.getEmpName());
			 ps.setDouble(2,emp.getSalary());
			 ps.setString(3,emp.getEmpDesg());
			 ps.setInt(4,emp.getDeptNo());
			 int count=ps.executeUpdate();
			 msg=count==0?"Employe not registered..":"Employee register successfully!!";
			
		} catch (Exception e) {
			//Delegating exception to caller class
			throw e;
		}
		return msg;
	}

}
