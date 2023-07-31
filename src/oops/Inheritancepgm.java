package oops;

class Member
{
	
		String name;
		int age;
		int phoneno;
		String address;
		int salary;
		public void printdetails()
		{
		
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phoneno="+phoneno);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
		
		
	}}
	class employee1 extends Member
	{
		
		String specialization;
		
		
		
	}

class Manager extends Member
{
	
		String department;
		{
			System.out.println("Department= developer");
		}
	}

public class Inheritancepgm {

	public static void main(String[] args) {
		employee1 emp1=new employee1();
		emp1.name="Varsha";
		emp1.age=25;
		emp1.address="Palakkad";
		emp1.salary=30000;
		emp1.phoneno=1234;
		emp1.printdetails();
		
	

}}
