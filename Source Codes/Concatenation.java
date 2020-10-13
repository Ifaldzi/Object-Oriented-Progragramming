public class Concatenation
{
	public static void main(String[] args)
	{
		String expletive = "Expletive";
		String PG13 = "deleted";
		String message = expletive + PG13;
		System.out.println(message);

		int age = 13;
		String rating = "PG" + age;
		System.out.println(rating);

		String all = String.join(" & ", "S", "M", "L");
		System.out.println(all);
	}
}