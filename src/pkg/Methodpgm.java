package pkg;

public class Methodpgm {

	public static void main(String[] args) {
	Methodpgm ob=new Methodpgm();
	ob.add();
	int subvalue=ob.sub();
	System.out.println(subvalue);
	ob.mul(30,20);
	double divans=ob.div(3, 2);
System.out.println(divans);
	}


//Method without parameter & without return type

public void add()
{
	int a=10,b=30,c;
	c=a+b;
	System.out.println(c);
}

//Method without parameter & with return type

public int sub()
{
	int a=20,b=30,c;
	c=a-b;
	return c;
}

//Method with parameter & without return type

public void mul(int a,int b)
{
	
	int c=a*b;
	System.out.println(c);
}

//Method with parameter & with return type

public float div(float a, float b)
{
	
	float c=a/b;
	return c;
}}