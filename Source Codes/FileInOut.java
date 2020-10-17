import java.io.*;
import java.util.Scanner;
import java.nio.file.Paths;

public class FileInOut
{
	public static void main(String[] args) throws IOException
	{
		PrintWriter out = new PrintWriter("E:\\My Program\\Java\\test.txt", "UTF-8");
		out.println("tes tes");
		out.close();

		Scanner inFile = new Scanner(Paths.get("E:\\My Program\\Java\\test.txt"), "UTF-8");
		String text = inFile.nextLine();
		System.out.println(text);
	}
}