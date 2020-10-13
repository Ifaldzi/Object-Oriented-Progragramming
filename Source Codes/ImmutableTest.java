public class ImmutableTest
{
	public static void main(String[] args)
	{
		String greeting = "Hello";
		//greeting[3] = 'p'; error, in java string is immutable so we can't do this operation
		greeting = greeting.substring(0, 3) + "p!";
		System.out.println(greeting);
	}
}