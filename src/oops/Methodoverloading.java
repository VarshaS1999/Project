package oops;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading ob=new Methodoverloading();
		ob.add();
		ob.add(10, 30);
		ob.add(32, 2.5);
		ob.add(3.2, 20);
	}
	
	public void add()
	{
		int a=20,b=30,c;
		c=a+b;
		System.out.println(c);
		
	}
public void add(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}

public void add(int a,double b)
{
	double c=a+b;
	System.out.println(c);
}
public void add(double a,int b)
{
	double c=a+b;
	System.out.println(c);
}
}
