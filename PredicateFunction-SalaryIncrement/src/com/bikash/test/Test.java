package com.bikash.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.bikash.student.Employee;

public class Test {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		populate(list);
		System.out.println("Before salary increment : "+list);
		
			Predicate<Employee> p=emp->emp.salary<=25000;
			Function<Employee,Employee> f=emp->{
			                                  emp.salary=emp.salary+2000;
			                                  return emp;
			                                 };
            List<Employee> list2=new ArrayList<Employee>();			                                 
			for(Employee e:list)
			{
				if(p.test(e)) {
					f.apply(e);
					list2.add(e);
				}
			}
			System.out.println("After salary increment : "+list);
			System.out.println();
			System.out.println("Employee for whome salary incremented "+list2);
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
