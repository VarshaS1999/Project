package pkg;

public class Practice {

	public static void main(String[] args) {
		//Swapping with variable
		int a=20,b=30,temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
		
		//Swapping Without variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swapping value of a and b is="+a+ " "+b);
		
		
		int c=23,d=45;
		System.out.println(c==d);
		
		int e=55,f=70;
		System.out.println(e<50&&e<f);
		
		int g=17;
		System.out.println(g%10);

		
		
		
}
}