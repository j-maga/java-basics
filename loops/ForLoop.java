package loops;

public class ForLoop {
	public static void main(String args[])
	{
		String rainbow[] = new String[] {"violet", "indigo", "blue", "green", "yellow", "orange", "red"};
		for (int colors=0; colors<rainbow.length; colors++)
		{
			System.out.println(rainbow[colors]);
		}
	}

}
