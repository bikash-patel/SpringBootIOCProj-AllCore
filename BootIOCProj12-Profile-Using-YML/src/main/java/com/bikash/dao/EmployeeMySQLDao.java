package com.bikash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.bikash.model.Employee;

@Repository
@Profile({"dev","test"})
public class EmployeeMySQLDao implements IEmployeeDao {

	final private String INSERT_QUERY="INSERT INTO EMPLOYEE(empname,empsal,empdeg,deptno) VALUES(?,?,?,?)";
	final private String SEARCH_QUERY="SELECT * FROM EMPLOYEE WHERE EMPDEG IN(?,?,?)";
	private List<Employee> list=new ArrayList<Employee>();
	
	@Autowired
	private DataSource ds;
	private String msg;
	@Override
	public String registerEmployee(Employee emp) throws Exception {
		System.out.println(ds.getClass());
		try (Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(INSERT_QUERY);){
			ps.setString(1,emp.getEmpdeg());
			ps.setDouble(2,emp.getEmpsal());
			ps.setString(3,emp.getEmpdeg());
			ps.setInt(4,emp.getDeptno());
			int count=ps.executeUpdate();
			msg=count==1?"Employee Inserted":"Employee Not Inserted";
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return msg;
	}

	@Override
	public List<Employee> searchByDesg(String desg1,String desg2,String desg3) throws Exception {
		try (Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(SEARCH_QUERY);){
			ps.setString(1,desg1);
			ps.setString(2,desg2);
			ps.setString(3,desg3);
			try(ResultSet rs=ps.executeQuery();) {
				while(rs.next())
				{
					Employee emp=new Employee();
					emp.setEmpno(rs.getInt(1));
					emp.setEmpname(rs.getString(2));
					emp.setEmpsal(rs.getDouble(3));
					emp.setEmpdeg(rs.getString(4));
					emp.setDeptno(rs.getInt(5));
					list.add(emp);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}

}
