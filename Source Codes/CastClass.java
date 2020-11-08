import mypackage.CoreJava.*;

public class CastClass
{
	public static void main(String[] args)
	{
		OtherEmployee[] staff = new OtherEmployee[3];
		staff[0] = new OtherEmployee("Antonio Rossi", 2000000, 1, 10, 1989);
		staff[1] = new Manager("Maria Bianchi", 25000000, 1, 12, 1991);
		staff[2] = new OtherEmployee("Isabel Vidal", 30000000, 1, 11, 1993);
		Manager boss = (Manager) staff[1];
		System.out.println(boss.getSecretaryName());
		if(staff[0] instanceof Manager)
		{
			System.out.println("staff[1] is instanceof Manager Class");
			boss = (Manager) staff[1];
		}
	}
}