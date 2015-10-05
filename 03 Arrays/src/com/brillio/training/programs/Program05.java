package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Program05 {

	public static void main(String[] args) {

		// person is not a reference to a person object
		// but it is a reference to an array of Person objects
		Person[] persons;

		persons = new Person[3];
		persons[0] = new Person(1, "karthik", "udupi");
		persons[1] = new Person(2, "vinod", "bangalore");
		persons[2] = new Person(3, "nayak", "bangalore");

		for (Person p1 : persons) {
			System.out.println(p1);

		}
	}

}
