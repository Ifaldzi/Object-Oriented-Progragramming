public class CodePointAndUnit
{
	public static void main(String[] args)
	{
		String greeting = "Hello";
		int n = greeting.codePointCount(0, greeting.length());
		System.out.println("The true length of string is " + n);

		char first = greeting.charAt(0);
		char last = greeting.charAt(4);
		System.out.println(first + " | " + last);

		int index = greeting.offsetByCodePoints(0, 2);
		int cp = greeting.codePointAt(index);
		System.out.println("2nd code point = " + cp);

		int[] codePoints = greeting.codePoints().toArray();
		for(int i=0; i<codePoints.length; i++)
		{
			System.out.print(codePoints[i] + " ");
		}	
		String str = new String(codePoints, 0, codePoints.length);
		System.out.println("\n" + str);
	}
}