package com.bikash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bikash.model.Student;
import com.bikash.service.IStudentService;

@Controller
public class StudentController {
	@Autowired
	private IStudentService service;
	public List<Student> studentOperationController(String addrs1,String addrs2,String addrs3) throws Exception
	{
		List<Student> list=service.getStudentAddress(addrs1, addrs2, addrs3);
		return list;
	}
}
