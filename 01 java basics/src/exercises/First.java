package exercises;

import java.util.Scanner;

public class First {
	
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter gthe numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		compare(a,b,c);
		
	}

	private static void compare(int a, int b, int c) {
		if(a>b)
		{
			if(a>c)
			{
				if(b>c)
				{
					System.out.println(+a+" "+b+" "+c);
				}
				else
				{
					System.out.println(+a+" "+c+" "+b);
				}
					
			}
			else
			{
				System.out.println(+c+" "+a+" "+b);
			}
		}
		else
		{
			if(b>c)
			{
				if(a>c)
				{
					System.out.println(b+" "+a+" "+c);
				}
				else
				{
					System.out.println(b+" "+c+" "+a);
				}
			}
			else
			{
				System.out.println(c+" "+b+" "+a);
			}
		}
	}

}
