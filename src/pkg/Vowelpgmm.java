package pkg;

import java.util.Scanner;

public class Vowelpgmm {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a string");
     String s=sc.next();
     int c=0;
     for(int i=0;i<s.length();i++)
     {
        
    	 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
    	 {
    		 c++;
    	 }
     }
    	 System.out.println("NUmber of vowels:"+c);
	}

}
