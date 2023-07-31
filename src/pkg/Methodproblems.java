package pkg;

public class Methodproblems {

	public static void main(String[] args) {
		Methodproblems ob=new Methodproblems();
		
	ob.circle();
	double trivalue=ob.triangle();
	System.out.println(trivalue);
	ob.rec(5, 10);
	int squvalue=ob.square(8);
	System.out.println(squvalue);
	}

	
	
	
	
	public void circle()
	{
		
	double r=5,c;
	c=0.5*r*r;
	System.out.println(c);
	}
	
	public double triangle()
	{
		int a=3,b=2;
		double c;
		c=0.5*a*b;
		return c;
	}
	
	public void rec(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	
	public int square(int a)
	{
		
		int b=a*a;
		return b;
	}
}
