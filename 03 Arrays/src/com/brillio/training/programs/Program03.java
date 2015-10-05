package com.brillio.training.programs;

public class Program03 {
	public static void main(String[] args) {

		// array of 4 strings
		String[] names = { "scott", "miller", "allen", "jones" };

		/*
		 * for (int i = 0; i < names.length; i++) {
		 * System.out.println(names[i]);
		 */

		// enhanced for loop (for-each-loop)
		// introduced in java 1.5

		for (String name : names) {
			System.out.println(name);
		}
		
	}
}
