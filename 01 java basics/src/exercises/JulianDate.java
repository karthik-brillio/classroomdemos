package exercises;

import java.util.Scanner;

public class JulianDate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the date ");
		int day=s.nextInt();
		int month=s.nextInt();
		int year=s.nextInt();
		int res= calculatedays(day,month,year);
		System.out.println(res);
	}

	private static int calculatedays(int day, int month, int year) {
		int a=yearfinder(year);
		int sum_month=0;
		for (int i = 1; i < month; i++) {
			int b=monthfinder(month,year);
			sum_month=sum_month+b;
		}
		int total=a+sum_month+day;
		return total;
	}

	private static int monthfinder(int month,int year) {
		if(month%2!=0)
			return 31;
		else if(year%4==0&&month==2)
			return 29;
		else if(year%4!=0&&month==2)
			return 28;
		else
			return 30;
	}

	private static int yearfinder(int year) {
		int diff=year-1900;
		int leap=diff/4;
		int non_leap=diff-leap;
		return ((leap*366)+(non_leap*365));
	}

}
