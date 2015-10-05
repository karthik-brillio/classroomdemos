package exercises;

import java.util.Scanner;

public class ReverseNumber2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=s.nextInt();
		if (num>0)
		{
			reverse1(num);
		}
		else
		{
			num=-(num);
			reverse2(num);
		}
	}

	private static void reverse1(int num) {
		while(num!=0)
		{
			int rem=num%10;
			num=num/10;
			System.out.print(rem);
		}
		
	}

	private static void reverse2(int num) {
		System.out.print("-");
		while(num!=0)
		{
			int rem=num%10;
			num=num/10;
			System.out.print(rem);
		}
		
	}

}
