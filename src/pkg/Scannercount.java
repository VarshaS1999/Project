package pkg;

import java.util.Scanner;

public class Scannercount {

	public static void main(String[] args) {
	Scanner ob = new Scanner(System.in);
			
			System.out.println("Enter a number");
			int n=ob.nextInt();
			int count=0;
			while(n>0)
			{
				
				n=n/10;
				
				count++;
				
			}
			
			System.out.println("Count of the number="+count);
			
	}}