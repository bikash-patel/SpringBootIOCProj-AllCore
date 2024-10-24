package com.bikash.service;

import java.util.List;

import com.bikash.model.Student;

public interface IStudentService {
	public List<Student> getStudentAddress(String addrs1,String addrs2,String addrs3) throws Exception;
}
