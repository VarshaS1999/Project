package oops;
 interface Cardetails
 {
	 public void acceleration();
	 public void speedlimit();
 }
 
 interface CarAccessories
 {
	 public void exhaust();
	 public void gear();
 }
class Kia implements Cardetails,CarAccessories
{

	@Override
	public void exhaust() {
		System.out.println("kia exhaust");		
	}

	@Override
	public void gear() {
		System.out.println("kia gear");	
		
	}

	@Override
	public void acceleration() {
		System.out.println("kia acceleration");	
		
	}

	@Override
	public void speedlimit() {
		System.out.println("kia speed");	
	}
	
}

class Mg implements Cardetails
{

	@Override
	public void acceleration() {
		System.out.println("Mg acceleration");	
		
	}

	@Override
	public void speedlimit() {
		System.out.println("Mg speedlimit");	
		
	}
	
}
public class Interfacepgm {

	public static void main(String[] args) {
		Cardetails ob=new Kia();
		ob.acceleration();
		ob.speedlimit();
		Cardetails ob1=new Mg();
		ob1.acceleration();
		ob1.speedlimit();

	}

}
