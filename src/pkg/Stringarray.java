package pkg;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		String ar[]=new String[4];
		Scanner sc=new Scanner(System.in);
		
System.out.println("Enter names: ");

for(int i=0;i<4;i++)
{
	ar[i]=sc.nextLine();
}
System.out.println("Names are :");

for(int i=0;i<4;i++)
	
{
	System.out.println(ar[i]);
}
	}

}
