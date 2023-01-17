package cmdlinearg;

public class OneArg {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		System.out.println("Value of a is "+ a);
	}
}
