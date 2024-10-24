package com.bikash.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.bikash.movie.Movie;

public class TestMain {

	public static void main(String[] args) {
		/*Consumer<String> c=s->System.out.println(s);
		c.accept("Bikash");
		c.accept("Creation");*/
		
		List<Movie> list=new ArrayList<Movie>();
		populate(list);
		Consumer<Movie> c=m->{
			System.out.println("Movie Name "+m.movieName);
			System.out.println("Hero in the movie "+m.movieHero);
			System.out.println("Heroin in the movie "+m.movieHeroin);
			System.out.println();
		};
		for(Movie m:list)
		{
			c.accept(m);
		}
	}
public static void populate(List<Movie> list)
{
	list.add(new Movie("Puspa","Allu Arjun","Deepika"));
	list.add(new Movie("KGF","Raj","Anuska"));
	list.add(new Movie("Animal","Ranbveer kapur","Smriti"));
}
}
