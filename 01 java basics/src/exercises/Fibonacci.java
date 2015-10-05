package exercises;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the position ");
		int pos=s.nextInt();
		int val=getvalue(pos);
		System.out.println(val);
	}

	private static int getvalue(int pos) {
		if(pos<0) return -1;
		if(pos>100) return -2;
		int a=0,b=1;
		for (int i = 2; i < pos; i++) {
			int c=a+b;
			a=b;
			b=c;
		}
		return b;
	}

}
