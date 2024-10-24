package com.bikash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikash.dao.IHospitalDao;
import com.bikash.model.Hospital;

@Service
public class HospitalService implements IHospitalService {

	@Autowired
	private IHospitalDao hosDao;
	
	@Override
	public List<Hospital> getEmpDetailsByLocation(String loc1, String loc2, String loc3) throws Exception {
	    List<Hospital> list=hosDao.getHospitalDetails(loc1,loc2,loc3);
		return list;
	}

}

