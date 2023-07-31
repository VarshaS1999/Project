package oops;
interface Tvremote
{
	public void poweron();
	public void volumeupp();
	public void volumedown();
}
interface Smarttv extends Tvremote
{
	public void Lcddisplay();
	public void Dolbysystem();
}


class Tv implements Tvremote,Smarttv
{

	@Override
	public void Lcddisplay() {
		System.out.println("tv lcd");
		
	}

	@Override
	public void Dolbysystem() {
		
		System.out.println("tv dolby");
	}

	@Override
	public void poweron() {
		System.out.println("tv power");
		
	}

	@Override
	public void volumeupp() {
		System.out.println("tv volume");
	}

	@Override
	public void volumedown() {
		System.out.println("tv volumedown");
	}
	
}
public class Tvppgm {

	public static void main(String[] args) {
		
		
		Smarttv ob1=new Tv();
		
		ob1.Lcddisplay();
		
		ob1.poweron();
		ob1.volumedown();
		ob1.volumeupp();
		ob1.Lcddisplay();
		ob1.Dolbysystem();
	}

}
