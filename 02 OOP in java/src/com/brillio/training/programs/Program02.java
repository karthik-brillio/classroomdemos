package com.brillio.training.programs;

import com.brillio.training.entity.Category;
import com.brillio.training.entity.Product;

public class Program02 {
	
	public static void main(String[] args) {
		Category c1=new Category(10, "beverages");
		
		Product p1=new Product(12, "cahai", 18.5);
		p1.setCategory(c1);
		
		System.out.println(p1);
		System.out.println(p1.getCategory());

	}
}
