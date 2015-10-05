package exercises;

import java.util.Scanner;

public class Third {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int hr=s.nextInt();
		int min=s.nextInt();
		int sec=s.nextInt();
		int add=s.nextInt();
		if(add>0)
		{
			calculate(hr,min,sec,add);
		}
		else
		{
			calculate(hr,min,sec,-(add));
		}
	}

	public static void calculate(int hr, int min, int sec, int i) {
		if(hr>12||min>60||sec>60)
		{
			System.out.println("invalid input");
		}
		else
		{
			int j=i/60;
			min+=j;
			int k=i-(60*j);
			sec=sec+k;
				if(sec>60){
					min++;
					sec-=60;
				}
				if(min>60)
				{
					int b=min/60;
					hr+=b;
					min-=60;
					if(hr>12)
					{
						hr-=12;
					}
				}
		}
		System.out.println(hr+":"+min+":"+sec);
		
	}

}
