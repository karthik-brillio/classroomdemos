package exercises;

import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int month=s.nextInt();
	int year=s.nextInt();
	findday(month,year);
	}

	public static void findday(int month, int year) {
		if(year%4==0)
		{
			if(month==2)
				System.out.println("29");
			else if(month%2==0)
			{
				System.out.println("30");
			}
			else
			{
				System.out.println("31");

			}
		}
		else
		{
			if(month==2)
				System.out.println("28");
			else if(month%2==0)
			{
				System.out.println("30");
			}
			else
			{
				System.out.println("31");

			}
		}
		
		
	}

}
