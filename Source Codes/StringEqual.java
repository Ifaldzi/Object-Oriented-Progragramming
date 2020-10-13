public class StringEqual
{
	public static void main(String[] args)
	{
		String s = "Test";
		String greeting = "Hello";
		if("Hello".equals(greeting)) System.out.println("Equal");
		if(s.equalsIgnoreCase("test")) System.out.println("Equal");
	}
}