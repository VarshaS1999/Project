package pkg;

public class Countofno {

	public static void main(String[] args) {
		int n=345678;
		int c=0;
		while(n>0)
		{
			
			n=n/10;
			c++;
		}
		System.out.println(c);
	}
	

}
