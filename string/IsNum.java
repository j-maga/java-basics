package string;

public class IsNum {
	public static void main(String[] args) {
		String a = "124";
		String b = "123d";
		
		try
		{
			double d = Long.parseLong(a);
			System.out.println(d);
			double e = Long.parseLong(b);
			System.out.println(e);
		}
		catch (NumberFormatException e)
		{
			System.out.println("Number Format Exception ");
		}
	}

}
