package com.vm.training.java.Collections;

import java.util.ArrayList;
import java.util.Collections;

class Movie1 implements Comparable<Movie1> {

	private double rating;
	private String name;
	private  int year;
	public int compareTo(TestMovie m)
	{
		return this.year - m.year;
	}
	public Movie1(double rating, String name, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	public double getRating() {
		return rating;
	}
	
	public String getName() {
		return name;
	}
	
	public int getYear() {
		return year;
	}
}
class TestMovie2
{
	public static void main(String[] args)
	{
		ArrayList<TestMovie> list = new ArrayList<TestMovie>();
		list.add(new TestMovie1(5.0,"ajka",2017));
		list.add(new Movie1(7.0,"dhh",2019));
		list.add(new Movie1(15.0,"aedn",2020));
		
		Collections.sort(list);
		System.out.println("Movies after sorting :");
		for(TestMovie movie: list) {
			System.out.println(movie.getRating()+" "+movie.getName()+" "+movie.getYear());
		}
	}
	
	
	}

