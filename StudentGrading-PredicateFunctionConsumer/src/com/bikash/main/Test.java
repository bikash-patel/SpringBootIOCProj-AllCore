package com.bikash.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.bikash.student.Student;

public class Test {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		populate(list);
		Predicate<Student> p=s->s.marks>60;
		Function<Student,String> f=s->{
						if(s.marks>80)
							return "A";
						else if(s.marks>70)
							return "B";
						else if(s.marks>60)
							return "C";
						else
							return "D";
		};
		Consumer<Student> c=s->{
			System.out.println("Name : "+s.userName);
			System.out.println("Marks : "+s.marks);
			System.out.println("Grade : "+f.apply(s));
			System.out.println();
		};
		for(Student s:list)
		{
			c.accept(s);
		}
	}
	public static void populate(List<Student> list)
	{
		list.add(new Student("Bikash",86));
		list.add(new Student("Sasmita",67));
		list.add(new Student("Priyansh",56));
		list.add(new Student("Karan",26));
	}
}
