public class StringAPI
{
	public static void main(String[] args)
	{
		String str = "Kono Dio da";
		if(str.endsWith("da")) System.out.println("It's Japanese");
		int index = str.indexOf("Dio");
		System.out.println("'Dio' is start from index " + index);
		String newStr = str.toUpperCase();
		System.out.println(newStr);
	}
}