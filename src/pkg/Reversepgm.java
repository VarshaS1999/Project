package pkg;

public class Reversepgm {

	public static void main(String[] args) {
		int n=2345;
		int r;
		int rev=0;
		
		while(n>0)
		{
       r=n%10;
       rev=rev*10+r;
       
       n=n/10;
	}
System.out.println(rev);
}
}