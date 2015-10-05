package com.brillio.training.programs;

import java.util.Arrays;

public class Program02 {
	public static void main(String[] args) {
		
		int[][] nums={
				{12,32},
				{33,45,4},
				{213,34,43,42,434,2,4},
				{123,134,343,34}
		};
		for (int i = 0; i < nums.length; i++) {
			System.out.println(Arrays.toString(nums[i]));
		}
	}

}
