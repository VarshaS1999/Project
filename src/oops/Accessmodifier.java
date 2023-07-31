package oops;

class b
{
	private String name;	//Within class
}//cannot access name restricted data

public class Accessmodifier {
	protected int a=10;
	String designation;

	public static void main(String[] args) {
		b ob=new b();
	Accessmodifier ob1=new Accessmodifier();
	System.out.println(ob1.a);
	System.out.println(ob1.designation="Manager");
		
	}
	}

