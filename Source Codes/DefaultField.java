public class DefaultField
{
	public static void main(String[] args) 
	{
		Default ex = new Default();
		ex.printThis();
	}
}

class Default
{
	public int number;
	public String name;
	public boolean bool;

	public void printThis()
	{
		System.out.println(number + " " + name + " " + bool);
	}
}