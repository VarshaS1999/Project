package oops;

public class Employee {
	String empname;
	String design;
	String stid;
	
	Employee(String empname,String design,String stid)
	{
		this.empname=empname;
		this.design=design;
		this.stid=stid;
	}
		Accessmodifier ob=new Accessmodifier();
		

	public static void main(String[] args) {
			
			
			Accessmodifier ob=new Accessmodifier();
			System.out.println(ob.a);
		Employee emp=new Employee("Varsha","Developer","101");
			
		System.out.println(emp.empname);
		System.out.println(emp.design);
		System.out.println(emp.stid);
	
		
					}
	}


