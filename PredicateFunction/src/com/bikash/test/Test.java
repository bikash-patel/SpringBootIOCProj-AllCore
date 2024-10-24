package com.bikash.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.bikash.student.Student;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		populate(list);
		Function<Student,String> f=s->{int mark=s.mark;
        if(mark>80)
       	 return "A[Distintion]";
        else if(mark>70)
       	 return "B[2nd Division]";
        else if(mark>60)
       	 return "C[3rd Division]";
        else if(mark>35)
       	 return "D[4th Division]";
        else
       	 return "E[Failed]";
      };
      Predicate<Student> p=s->s.mark>=60;
      for(Student s1:list)
		{
			if(p.test(s1))
			{
				System.out.println("Name : "+s1.name);
				System.out.println("Mark : "+s1.mark);
				System.out.println(f.apply(s1));
				System.out.println();
			}
		}
	}
	public static void populate(List<Student> list)
	{
		list.add(new Student("Bikash",95));
		list.add(new Student("Sasmita",65));
		list.add(new Student("Priyansh",35));
		list.add(new Student("Suraj",23));
		list.add(new Student("Namita",77));
	}
}