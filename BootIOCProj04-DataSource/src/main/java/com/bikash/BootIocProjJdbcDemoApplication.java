package com.bikash;

import java.util.Arrays;
import java.util.List;
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
public class BootIocProjJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProjJdbcDemoApplication.class, args);
		EmployeeController empctrl=ctx.getBean("employeeController",EmployeeController.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st desgination");
		String desg1=sc.next();
		System.out.println("Enter 2nd desgination");
		String desg2=sc.next();
		System.out.println("Enter 3rd desgination");
		String desg3=sc.next();
		try {
			List<Employee> list=empctrl.getEmployee(desg1,desg2,desg3);
			for(Employee emp:list)
			{
				System.out.println(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong..Try again !!");
		}//catch
		String[] beanIds=ctx.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanIds));
		((ConfigurableApplicationContext) ctx).close();
		
	}

}

