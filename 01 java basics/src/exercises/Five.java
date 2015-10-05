package exercises;

import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		int sum= cal_sum(a,b);
		System.out.println(sum);
	}
	

	private static int cal_sum(int a, int b) {
		int sum=0;
		for (int i = a; i <= b; i++) {
			boolean k = isprime(i);
			if (k == true) {
				sum = sum + i;
			}

		}
		return sum;
	}


	private static boolean isprime(int i) {
		if(i<0||i==1)
			return false;
		
		for (int j = 2; j <= i / 2; j++) {
			if ((i % j == 0))
				return false;
		}
		return true;
	}

}
