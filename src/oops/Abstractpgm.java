package oops;
abstract class Car
{
	abstract public void carengine();
	abstract public void speed();
	abstract public void acceleration();
	
}

class Maruti extends Car
{

	@Override
	public void carengine() {
		System.out.println("car engine");
		
	}

	@Override
	public void speed() {
		System.out.println("car speed");
		
		
	}

	@Override
	public void acceleration() {
		System.out.println("car acceleration");
		
		
	}
	
}
class Bmw extends Car
{

	@Override
	public void carengine() {
		System.out.println("Bmw carengine");
		
	}

	@Override
	public void speed() {
		System.out.println("Bmw speed");
		
		
	}

	@Override
	public void acceleration() {
		System.out.println("Bmw acceleration");
		
		
	}
	
}
public class Abstractpgm {

	public static void main(String[] args) {
		Bmw ob=new Bmw();
		Maruti ob1=new Maruti();
		ob1.carengine();
		ob1.acceleration();
		ob1.speed();
		
		
		ob.carengine();
		ob.speed();
		ob.acceleration();

	}

}
