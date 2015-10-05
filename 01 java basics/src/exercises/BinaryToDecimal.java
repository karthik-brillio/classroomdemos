package exercises;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		long num=s.nextLong();
		int sum=0,i=0;
		sum=calculatesum(num);
		
		System.out.println(sum);
	}

	private static int calculatesum(long num) {
		int sum=0,i=0;
		while(num!=0)
		{
			long rem=num%10;
			num=num/10;
			if(rem!=0&&rem!=1){
				System.out.println("invalid input");
				System.exit(0);
			}
			sum=(int) (sum+rem*Math.pow(2, i));	
			i++;
		}
		return sum;
	}

}
