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

import com.bikash.model.Hospital;

@Repository
public class HospitalDao implements IHospitalDao {

	String QUERY_FOR_HOSPITAL="SELECT * FROM HOSPITAL WHERE hospitalLocation IN(?,?,?)";
	List<Hospital> list=new ArrayList<Hospital>();;
	
	@Autowired
	private DataSource ds;
	
	@Override
	public List<Hospital> getHospitalDetails(String loc1,String loc2,String loc3) throws SQLException {
		try(//Get Connection from Connection Pool
				Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(QUERY_FOR_HOSPITAL);
				){
			ps.setString(1,loc1);
			ps.setString(2,loc2);
			ps.setString(3,loc3);
			try(ResultSet rs=ps.executeQuery();)
			{
				while(rs.next())
				{
					Hospital hos=new Hospital();
					hos.setHospitalId(rs.getInt(1));
					hos.setHospitalName(rs.getString(2));
					hos.setHospitalLocation(rs.getString(3));
					hos.setHospitalBedCapacity(rs.getInt(4));
					hos.setHospitalEmail(rs.getString(5));
					hos.setHospitalWebsite(rs.getString(6));
					list.add(hos);
				}
			}
		} catch (Exception e) {
			throw e;
		}
		return list;
	}

}
