import java.time.LocalDate;

public class LocDate
{
	public static void main(String[] args)
	{
		LocalDate localDate = LocalDate.now();
		LocalDate myBirthDay = LocalDate.of(2001, 5, 24);
		System.out.println(localDate + " My Birthday: " + myBirthDay);
	}
}