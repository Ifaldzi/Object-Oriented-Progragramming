public class StringBuild
{
	public static void main(String[] args)
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Halo");
		builder.append("Ini adalah");
		builder.insert(4, " ");
		builder.insert(5, "David disini dan ");
		builder.delete(4, 5);
		System.out.println(builder);

		String completedString = builder.toString();
		System.out.println(completedString);
	}
}