package jump;

public class ContinueStatement {
	public static void main(String args[])
	{
		String rainbow[] = new String[] {"violet", "indigo", "blue", "green", "yellow", "orange", "red"};
		for (int i=0; i<rainbow.length; i++)
		{
			if (rainbow[i]=="green")
			{
				System.out.println("Continue Statement Executed");
				continue;
			}
			System.out.println(rainbow[i]);
		}
	}

}
