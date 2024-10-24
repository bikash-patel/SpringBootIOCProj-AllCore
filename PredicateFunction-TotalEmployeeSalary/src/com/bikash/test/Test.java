package com.bikash.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.bikash.student.Employee;

public class Test {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		populate(list);
		Function<List<Employee>,Double> f=emp->{double totalSalary=0.0;
		                                  for(Employee e:list)
		                                  {
		                                	  totalSalary=e.salary+totalSalary;
		                                  }
		                                  return totalSalary;
		                                 };
    	  System.out.println("Total salary need to deposite in bank in this month is : "+f.apply(list));;
	}
	public static void populate(List<Employee> list)
	{
		list.add(new Employee("Bikash",25000.0));
		list.add(new Employee("Sasmita",25000.0));
		list.add(new Employee("Suresh",35000.0));
		list.add(new Employee("Saroj",50000.0));
		list.add(new Employee("Manish",15000.0));
	}
}
