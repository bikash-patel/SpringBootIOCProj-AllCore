package com.bikash.dao;

import java.sql.SQLException;
import java.util.List;

import com.bikash.model.Hospital;

public interface IHospitalDao {
	public List<Hospital> getHospitalDetails(String loc1,String loc2,String loc3) throws SQLException;
}
