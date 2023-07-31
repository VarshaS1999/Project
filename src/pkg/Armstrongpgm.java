package pkg;

import java.util.Scanner;

public class Armstrongpgm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
	    int r;
		int temp=n;
		int s=0;
		while(n>0)

		{
			r=n%10;
			s=s+r*r*r;
			n=n/10;
		}
		
		
		if(s==temp)
		{
			
			System.out.println("Armstromg");
		}
		
		else
			
		{
			System.out.println("Not Armstrong");
		}
	}
	
	

}
