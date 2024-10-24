package com.bikash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bikash.model.Employee;

@Repository
public class EmployeeOracleDao implements IEmployeeDao {
	private static final String SQL_QUERY="SELECT * FROM EMPLOYEE WHERE EMPDEG IN(?,?,?)";
	@Autowired
	private DataSource dSource; //Common interface
	List<Employee> list=null;
	
	@Override
	public List<Employee> retriveEmpByDes(String desg1, String desg2, String desg3) throws Exception {
		try(//Getting connection from Connection Pool
			Connection con=dSource.getConnection();
		    PreparedStatement st=con.prepareStatement(SQL_QUERY);) {
			st.setString(1,desg1);
			st.setString(2,desg2);
			st.setString(3,desg3);
			try(ResultSet rs=st.executeQuery();){
				list=new ArrayList<Employee>();
				while(rs.next())
				{
					Employee emp=new Employee();
					emp.setEmpid(rs.getInt(1));
					emp.setEmpname(rs.getString(2));
					emp.setEmpdeg(rs.getString(3));
					emp.setEmpsalary(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));
					list.add(emp);
				}
			}
		} catch (SQLException e) {
			throw e; //Delegating exception to caller class
		}
		return list;
	}

}
