package pkg;

public class Stringpgm {

	public static void main(String[] args) {
		String s="Java language is platform independent";
		String[]Stringarray=s.split(" ");
		for(String str:Stringarray)
		{
System.out.println(str);
if(str.equals("platform"))
{
break;
	}

}
}}