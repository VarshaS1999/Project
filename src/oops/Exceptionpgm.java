package oops;

public class Exceptionpgm {

	public static void main(String[] args){
		
	
		try {  //Exception handling
	int a=30,b=0;
	int c=a/b;
	System.out.println(c);

	}
catch(ArithmeticException e)
		
		{
	System.out.println(e.getMessage());
	System.out.println("Error");
		}
	
	
}
}
