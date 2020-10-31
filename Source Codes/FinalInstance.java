public class FinalInstance
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.giveGoldStar();
		e.printThis();
	}
}
	class Employee
	{
		private final StringBuilder evaluations;
		public Employee()
		{
			evaluations = new StringBuilder();
		}

		public void giveGoldStar()
		{
			evaluations.append("hoopla " + "Gold Star!\n");	
		}

		public void printThis()
		{
			System.out.print(evaluations);
		}
	}