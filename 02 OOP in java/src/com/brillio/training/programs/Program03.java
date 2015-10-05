package com.brillio.training.programs;

import com.brillio.training.entity.Television;

public class Program03 {
	public static void main(String[] args) {
		Television t1 = new Television();

		t1.setProductId(12);
		t1.setProductName("sony bravia");
		t1.setUnitPrice(99999.0);
		t1.setScreenType("LCD");
		t1.setSize(40);

		t1.print();
	}
}
