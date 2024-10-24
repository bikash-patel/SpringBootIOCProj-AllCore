package com.bikash.service;

import java.util.List;

import com.bikash.model.Hospital;

public interface IHospitalService {
	public List<Hospital> getEmpDetailsByLocation(String loc1,String loc2,String loc3) throws Exception;
}
