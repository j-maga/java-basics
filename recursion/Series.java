package recursion;

class printSeries
{
	void seriesAes(int n)
	{
		if(n>=1)
			seriesAes(n-1);
		else
			return;
		System.out.print(" "+n);
	}
	
	void seriesDes(int a)
	{
		if (a==0)
			return;
		else
			System.out.print(" "+a);
			seriesDes(a-1);
	}
}

public class Series
{
	public static void main(String[] args)
	{
		printSeries ps = new printSeries();
		ps.seriesAes(7);
		ps.seriesDes(6);
	}
}
