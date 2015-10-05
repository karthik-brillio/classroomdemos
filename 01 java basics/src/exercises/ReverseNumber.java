package exercises;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=s.nextInt();
		if (num>0)
		{
			int[] rev_num=reverse(num);
			for (int i = 0; i < rev_num.length; i++) {
				if(rev_num[i]>0)
				System.out.print(rev_num[i]);
				
			}
		}
		else
		{
			num=-(num);
			int[] rev_num=reverse(num);
			System.out.print("-");
			for (int i = 0; i < rev_num.length; i++) {
				if(rev_num[i]>0)
				System.out.print(rev_num[i]);
				
			}
			

		}
	}

	private static int[] reverse(int num) {
		int a[]=new int[10];
		int i=0;
		while(num!=0)
		{
			int rem=num%10;
			num=num/10;
			a[i]=rem;
			i++;
		}
		return a;
	}

}
