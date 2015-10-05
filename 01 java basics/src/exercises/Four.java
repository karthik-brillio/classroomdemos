package exercises;

import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		int num=-165151;
		int a[]=new int[10];
		if(num>0)
			positive_number(num,a);
		else
			negetive_number(num,a);
		
	}

	private static void negetive_number(int num, int[] a) {
		int i=0;
		while(num!=0)
		{
			int rem=num%10;
			num=num/10;
			a[i]=rem;
			i++;
		}
		for (int j = 0; j < a.length; j++) {
			for (int j2 = 0; j2 < a.length; j2++) {
				if(a[j2]<a[j])
				{
					int temp=a[j2];
					a[j2]=a[j];
					a[j]=temp;
					
				}
				
			}
			
		}
		System.out.print("-");
		for (int k = 0; k < a.length; k++) {
			
			//if(a[k]>0)
			System.out.print(a[k]);
		}
		
	}

		
	

	private static void positive_number(int num, int[] a) {
		int i=0;
		while(num!=0)
		{
			int rem=num%10;
			num=num/10;
			a[i]=rem;
			i++;
		}
		for (int j = 0; j < a.length; j++) {
			for (int j2 = 0; j2 < a.length; j2++) {
				if(a[j2]>a[j])
				{
					int temp=a[j2];
					a[j2]=a[j];
					a[j]=temp;
					
				}
				
			}
			
		}
		for (int k = 0; k < a.length; k++) {
			if(a[k]>0)
			System.out.print(a[k]);
		}
		
	}

}
