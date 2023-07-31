package pkg;

public class Operators {

	public static void main(String[] args) {
		//Arithmetic operators
		
		int a=50,b=20;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a+b="+(a*b));
		System.out.println("a+b="+(a/b));
		System.out.println("a+b="+(a%b));
		
		//Assignment operators
		
		System.out.println("a+=b="+(a+=b));
		System.out.println("a-=b="+(a-=b));
		System.out.println("a*=b="+(a*=b));
		System.out.println("a/=b="+(a/=b));
		
		//Relational operators
		
		System.out.println("a==b="+(a==b));
		System.out.println("a<b="+(a<b));
		System.out.println("a<=b="+(a<=b));
		System.out.println("a>b="+(a>b));
		System.out.println("a>=b="+(a>=b));
		System.out.println("a!=b="+(a!=b));
		
		
		//Logical operators
		
		String username="Varsha";
		String pswd="99";
		
		System.out.println(username=="Varsha"&&pswd=="99");
		System.out.println(username=="Varsha"||pswd=="99");
		System.out.println(!(username=="Varsha"));
		
		//Unary operators
		
		int d=2;
		
		System.out.println(d++);
		System.out.println(d);
		System.out.println(++d);
		System.out.println(d--);
		System.out.println(--d);
		
		//Ternary operator
		
		int v1=30,v2=10;
		int ans=v1>v2?v1:v2;
		System.out.println(ans);
		
		int v=20,p=30;
		String ans1=v>p?"v1 is greater":"v2 is greater";
		System.out.println(ans1);
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
