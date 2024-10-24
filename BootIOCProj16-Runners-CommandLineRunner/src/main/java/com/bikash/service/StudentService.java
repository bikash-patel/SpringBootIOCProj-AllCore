package com.bikash.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bikash.model.Student;

@Service
public class StudentService implements IStudentService {

	@Override
	public List<Student> getStudentAddress(String addrs1, String addrs2, String addrs3) throws Exception {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.setAddress(addrs1);s2.setAddress(addrs2);s3.setAddress(addrs3);
		List<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		return list;
	}

}
