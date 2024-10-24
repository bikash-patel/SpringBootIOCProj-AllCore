package com.bikash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bikash.model.Hospital;
import com.bikash.service.IHospitalService;

@Controller
public class HospitalController {
	@Autowired
	private IHospitalService hosService;
	public List<Hospital> getDetails(String loc1,String loc2,String loc3) throws Exception
	{
		List<Hospital> list=hosService.getEmpDetailsByLocation(loc1, loc2, loc3);
		return list;
	}
}
