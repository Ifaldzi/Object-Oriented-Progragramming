public class MessageCommand
{
	public static void main(String[] args)
	{
		if(args.length == 0 || args[0].equals("-h"))
			System.out.print("Hello,");
		else if(args[0].equals("-g"))
			System.out.print("Goodbye,");
		else if(args[0].equals("-i"))
		{
			System.out.print("Command info:\n-h: Hello,\n-g: Goodbye,\n-i: info");
		}
		for(int i=1;i<args.length;i++)
		{
			System.out.print(" " + args[i]);
		}
		System.out.println("");
	}
}