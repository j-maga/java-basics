package string;

public class ReplaceAll
{
	public static void main(String[] args)
	{
		String s1 = "Birds Fly in the Sky. Birds have wings. Birds live in the Nest.";
		System.out.println("Before Replacing\n"+s1);
		System.out.println("\nAfter Replacing\n"+s1.replaceAll("Birds", "Fishes"));
	}
}
