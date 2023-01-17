package loops;

public class DoWhileLoop {
	public static void main(String args[])
	{
		int colors=0;
		String rainbow[]=new String[] {"violet", "indigo", "blue", "green", "yellow", "orange", "red"};
		do
		{
			System.out.println(rainbow[colors]);
			colors++;
		}while (colors<rainbow.length);
	}
}
