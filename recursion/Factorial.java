package recursion;

import java.util.Scanner;

class printFact
{
	int printFact(int a)
	{
		if (a==1)
			return 1;
		else
			return (a*printFact(a-1));
	}
}

public class Factorial {
	public static void main(String[] args) {
		int a;
		printFact pf = new printFact();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num to find Factorial - ");
		a=sc.nextInt();
		System.out.println(pf.printFact(a));
	}
}
