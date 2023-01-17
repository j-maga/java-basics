package loops;

public class WhileLoop {
	public static void main(String args[])
	{
		int colors=0;
		String rainbow[]=new String[] {"violet", "indigo", "blue", "green", "yellow", "orange", "red"};
		while (colors<rainbow.length)
		{
			System.out.println(rainbow[colors]);
			colors++;
		}
	}

}
