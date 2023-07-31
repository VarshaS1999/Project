package pkg;

import java.util.Scanner;

public class Scannercalc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		double result=0;
		System.out.println("enter your choice " +"\n 1.Add"+"\n"+"2.Sub"+"\n"+"3.Mul"+"\n"+"4.Div");
		int c=sc.nextInt();
		
				switch(c)
		{	

				
				case 1:result=a+b;
				break;
				
				case 2:result=a-b;
				break;
				case 3:result=a*b;
				break;
				case 4:result=a/b;
				break;
				
		}
				
				System.out.println("result="+result);	 
				}
			
				{
		Default:System.out.println("Invalid choice");
	}
}
