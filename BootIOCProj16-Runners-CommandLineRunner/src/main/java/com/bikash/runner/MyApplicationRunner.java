package com.bikash.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bikash.controller.StudentController;
import com.bikash.model.Student;

@Component
public class MyApplicationRunner implements CommandLineRunner {

	@Autowired
	private StudentController controller;
	@Override
	public void run(String... args) throws Exception {
	System.out.println("MyApplicationRunner.run()");
	try {
		List<Student> list=controller.studentOperationController("Raipur","Sambalpur","Bargarh");
		list.forEach(st->{
			System.out.println(st);
		});
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}


}
