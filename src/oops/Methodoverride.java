package oops;
class Parent
{
	public void phone()
	{
		System.out.println("iphone");
	}
}
class Child extends Parent
{

	@Override
	public void phone() 
	{
		System.out.println("Samsung");
		super.phone();// To call the parent class
	}
	
}

public class Methodoverride {

	public static void main(String[] args) {
Child c=new Child();
c.phone();

	}

}
