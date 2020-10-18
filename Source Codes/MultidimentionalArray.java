import java.util.Arrays;

public class MultidimentionalArray
{
	public static void main(String[] args)
	{
		int[][] twoDArray = new int[5][5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++){
				twoDArray[i][j] = i;
			}
		}
		for(int[] row : twoDArray){
			for(int value : row)
			{
				System.out.print((value+1) + " ");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(twoDArray));
	}
}