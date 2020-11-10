import java.util.Scanner;

public class SwitchStatement
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Select number (1,2,3): ");
		int choice = in.nextInt();
		switch (choice)
		{
			case 1:
			System.out.println("You choose number 1");
			break;
			case 2:
			System.out.println("You choose number 2");
			break;
			case 3:
			System.out.println("You choose number 3");
			break;
			default:
			System.out.println("Your choice is wrong");
			break;
		}
		in.close();
	}
}