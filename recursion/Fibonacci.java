package recursion;

import java.util.Scanner;

class printFib
{
	int printFib(int a)
	{
		
		if (a==0)
			return a;
		else if(a==1 || a==2)
			return 1;
		return printFib(a-1)+printFib(a-2);
	}
}

public class Fibonacci {
	public static void main(String[] args) {
		int a;
		printFib pf = new printFib();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num to print Fibonacci - ");
		a=sc.nextInt();
		
		for (int i=0; i<=a; i++)
		{
			System.out.print(" "+pf.printFib(i));
		}
	}
}