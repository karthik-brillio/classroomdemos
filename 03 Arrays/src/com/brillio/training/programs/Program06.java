package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Program06 {
	public static void main(String[] args) {
		Person p1=new Person(2333,"robert smith","new york");
		Person[] persons={
				new Person(),
				new Person(2343,"john scott","new york"),
				new Person(2133,"ramesh kumar","chennai"),
				p1
				
		};
	}

}
