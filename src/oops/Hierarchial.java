package oops;

class Animal1
{
	public void animall()
	{
		System.out.println("sleep");
	}
}

class Tiger extends Animal1
{
	public void tigerr()
	{
		System.out.println("Tiger details");
	}
}

class Lion extends Animal1
{
	public void lionn()
	{
		System.out.println("Lion details");
	}
}

public class Hierarchial {

	public static void main(String[] args) {
Tiger ob=new Tiger();
ob.animall();
ob.tigerr();
Lion ob1=new Lion();
ob1.animall();
ob1.lionn();


	}

}
