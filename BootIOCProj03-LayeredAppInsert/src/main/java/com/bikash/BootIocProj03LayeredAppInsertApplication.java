package com.bikash;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.bikash.controller.EmployeeController;
import com.bikash.model.Employee;

@SpringBootApplication
@ImportResource("com/bikash/config/applicationContext.xml")
public class BootIocProj03LayeredAppInsertApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj03LayeredAppInsertApplication.class, args);
		EmployeeController controller=ctx.getBean("employeeController",EmployeeController.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Name :");
		String empName=sc.next();
		System.out.println("Enter Your Desgination :");
		String empDesig=sc.next();
		System.out.println("Enter your Salary :");
		Double empSalary=sc.nextDouble();
		System.out.println("Department Number :");
		int deptNo=sc.nextInt();
		
		//Mapped value to Model class
		Employee emp=new Employee();
		emp.setEmpName(empName);
		emp.setEmpDesg(empDesig);
		emp.setSalary(empSalary);
		emp.setDeptNo(deptNo);
		try {
			//Calling controller class method
			String msg=controller.register(emp);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong!.Try again");
		}
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
