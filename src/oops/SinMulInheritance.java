package oops;

class Animal
{
 public void animal()
 {
	 System.out.println("Animal");
 }
}


class Dog extends Animal //Single level
{
	public void dog()
	{
		System.out.println("barking");
	}
}

class babydog extends Dog //Multiple level
{
	
	public void babydogg()
	{
		System.out.println("cute");
	}
}

public class SinMulInheritance {

	public static void main(String[] args) {
		
		babydog ob=new babydog();
		ob.animal();
		ob.dog();
		ob.babydogg();
		

	}

}
