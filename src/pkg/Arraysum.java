package pkg;

import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
		int[]ar=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
		for(int i=0;i<10;i++)
		{
			ar[i]=sc.nextInt();
		}

System.out.println("Entered numbers: ");
		
		for(int i=0;i<10;i++)
		{
			
			System.out.println(ar[i]);
		}
		
		System.out.println("Sum of values are:");
		int sum=0;
		
		for(int i=0;i<10;i++)
		{
	sum=sum+ar[i];
	ar[i]++;
	}
System.out.println(sum);
System.out.println("Average of values are:");
int avg=0;


for(int i=0;i<10;i++)
{
avg=sum/10;
ar[i]++;
}
System.out.println(avg);
}}
