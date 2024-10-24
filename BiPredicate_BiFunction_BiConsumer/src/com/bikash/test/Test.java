package com.bikash.test;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		System.out.println("Test.main()-BiPredicate");
		BiPredicate<Integer,Integer> p=(i,j)->(i+j)>5;
		System.out.println(p.test(7,3));
		System.out.println("Test.main()-BiFunction");
		BiFunction<Integer,Integer,Integer> f=(i,j)->(i+j);
		System.out.println(f.apply(8,5));
		System.out.println("Test.main()-BiConsumer");
		BiConsumer<Integer,Integer> c=(i,j)-> System.out.println(i*j);
		c.accept(6,5);
	}

}
