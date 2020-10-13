public class NullString
{
	public static void main(String[] args)
	{
		String s = null;
		if(s == null) System.out.println("String is null");
		s = "";
		if(s.length() == 0) System.out.println("String is empty");
	}
}