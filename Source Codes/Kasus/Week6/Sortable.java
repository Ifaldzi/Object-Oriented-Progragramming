package Kasus.Week6;

abstract class Sortable
{
	public abstract int compare(Sortable b);
	public static void shell_sort(Sortable[] a)
	{
		//shell sort body
		for(int interval=a.length/2; interval>0; interval/=2)
		{
			for(int i=interval; i<a.length; i++)
			{
				Sortable temp = a[i];
				int j;
				for(j=i; j>=interval && a[j-interval].compare(temp)==-1; j-=interval)
				{
					a[j] = a[j-interval];
				}
				a[j] = temp;
			}	
		}
	}
}