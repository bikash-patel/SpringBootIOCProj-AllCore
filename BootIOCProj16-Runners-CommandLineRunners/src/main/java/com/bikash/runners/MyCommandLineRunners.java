package com.bikash.runners;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bikash.controller.EmployeeController;
import com.bikash.model.Employee;

@Component
public class MyCommandLineRunners implements CommandLineRunner {

	@Autowired
	private EmployeeController controller;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("MyCommandLineRunners.run()");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String name=sc.next();
		System.out.println("Enter your Designation : ");
		String desg=sc.next();
		System.out.println("Enter your Salary : ");
		Double salary=sc.nextDouble();
		System.out.println("Enter Deptartment Number : ");
		Integer deptno=sc.nextInt();
		try {
			Employee emp=new Employee();
			emp.setEmpname(name);
			emp.setEmpdeg(desg);
			emp.setEmpsal(salary);
			emp.setDeptno(deptno);
			String msg=controller.insert(emp);
			System.out.println(msg);
		} catch (Exception e) {
			System.out.println("Something went wrong while register employee..");
			e.printStackTrace();
		}
		System.out.println("Enter DESG1: ");
		String desg1=sc.next();
		System.out.println("Enter DESG2: ");
		String desg2=sc.next();
		System.out.println("Enter DESG3: ");
		String desg3=sc.next();
		try {
			List<Employee> list=controller.search(desg1, desg2, desg3);
			for(Employee emp1 : list)
				System.out.println(emp1);
		} catch (Exception e) {
			System.out.println("Something went wrong while searching..");
			e.printStackTrace();
		}
		
		
	}

}
