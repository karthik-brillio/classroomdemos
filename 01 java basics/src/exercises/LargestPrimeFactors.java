package exercises;

import java.util.Scanner;

public class LargestPrimeFactors {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int prime=pri_fac(num);
		System.out.println(prime);
	}

	private static int pri_fac(int num) {
		if(num<0) return -1;
		if(isprime(num)==true) return -2;
		
		int b=0;
		for (int i = 1; i < num/2; i++) {
			boolean res=isprime(i);
			if(res==true)
			{
				if(num%i==0)
					b=i;
			}
		}
		return b;
	}

	private static boolean isprime(int i) {
		for (int j = 2; j <= i/2; j++) {
			if(i%j==0)
				return false;
		}
		return true;
	}

}
