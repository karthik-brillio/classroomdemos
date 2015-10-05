package exercises;

import java.util.Scanner;

public class NearestSqrt {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=s.nextInt();
		int res=validate(num);
		if(res!=0)
		System.out.println(res);
	}

	private static int validate(int num) {
		if(num<0)
			return -1;
		else if(num>0)
			root(num);
		else
			return -2;
		return 0;
			
		
	}

	private static void root(int num) {
		int a=(int) Math.sqrt(num);
		int b=a+1;
		int c=(num)-(a*a);
		int d=(b*b)-(num);
		if(c>d)
		{
			System.out.println(b);
		}
		else
			System.out.println(a);
	}

}
