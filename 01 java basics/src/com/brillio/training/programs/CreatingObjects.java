package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class CreatingObjects {
	public static void main(String[] args) {
		
		Person p1; //created a reference variable 8 bytes will be occupied\
		p1 = new Person();
		
		System.out.println("name is "+p1.name);
		System.out.println("age is "+p1.age);
	}

}
