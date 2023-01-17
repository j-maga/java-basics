package conditional;

import java.util.Scanner;

public class NestedIf {
	public static void main(String args[])
	{
		int quo, choice1, choice2;
		float num1, num2, output, rem;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1 ");
		num1 = sc.nextFloat();
		System.out.println("\nEnter num2 ");
		num2 = sc.nextFloat();
		
		System.out.println("\n1. Multiplication\n2. Division\n\nEnter your choice ");
		choice1 = sc.nextInt();
		
		if (choice1==2)
		{
			System.out.println("\n-- Division --\n1.Find Quotient\n2.Find Remainder\n\nEnter your choice ");
			choice2 = sc.nextInt();
			if (choice2 == 1)
			{
				quo = (int)(num1/num2);
				System.out.println("Quotient is " + quo);
			}
			else if (choice2 ==2)
			{
				rem = num1%num2;
				System.out.println("Remainder is " + rem);
			}
			else
			{
				System.out.println("Invalid Input");
			}
		}
		
		else if (choice1 ==1)
		{
			output = num1 * num2;
			System.out.println("Multiplication is " + output);
		}
		
		else
		{
			System.out.println("Invalid Input");
		}
	}
}
