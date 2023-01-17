package recursion;

import java.util.Scanner;

class printSum
{
	int printSum(int a)
	{
		if (a!=0)
			return a+ printSum(a-1);
		else
			return a;
	}
}

public class Sum {
	public static void main(String[] args) {
		int a;
		printSum ps = new printSum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num to print Sum - ");
		a=sc.nextInt();
		System.out.println("Sum : 0 to "+ a +" is " + ps.printSum(a));
	}
}
