package loops;

public class ForEachLoop {
	public static void main(String args[])
	{
		String rainbow[] = new String[] {"violet", "indigo", "blue", "green", "yellow", "orange", "red"};
		for (String colors: rainbow)
		{
			System.out.println(colors);
		}
	}

}
