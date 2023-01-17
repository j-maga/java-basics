package jump;

public class BreakStatement {
	public static void main(String args[])
	{
		String rainbow[] = new String[] {"violet", "indigo", "blue", "green", "yellow", "orange", "red"};
		for (int i=0; i<rainbow.length; i++)
		{
			if (rainbow[i]=="green")
			{
				System.out.println("Break Statement Executed");
				break;
			}
			System.out.println(rainbow[i]);
		}
	}
}
