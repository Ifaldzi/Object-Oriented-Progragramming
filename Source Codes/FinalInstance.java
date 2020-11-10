public class FinalInstance
{
	public static void main(String[] args) 
	{
		EmployeeFin e = new EmployeeFin();
		e.giveGoldStar();
		e.printThis();
	}
}
	class EmployeeFin
	{
		private final StringBuilder evaluations;
		public EmployeeFin()
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