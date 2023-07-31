package oops;

public class Staticfinal {
	String name;// Requires object
	static String companyname="Luminar";// no ob is required,can be updated
	final double pi=3.14; //even if made static cannot be updated

	public static void main(String[] args) {
		Staticfinal ob=new Staticfinal();
		System.out.println(ob.name="Varsha");
		System.out.println(companyname="luminar technolab");
        System.out.println(ob.pi);
	}

}
