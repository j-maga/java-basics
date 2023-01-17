package conditional;

import java.util.Scanner;

public class Switch {
	public static void main(String args[])
	{
		int choice;
		float num1, num2, output;
		Scanner sc=new Scanner(System.in);
		System.out.println("Simple Calculator\nEnter num 1");
		num1 = sc.nextFloat();
		System.out.println("Enter num 2");
		num2 = sc.nextFloat();
		
		System.out.println("\n\n1.Sum \n2.Difference \n3.Product \n4.Division \n\nEnter your choice ");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			output = num1 + num2;
			System.out.println("\nSum is " + output);
			break;
			
		case 2:
			output = num1 - num2;
			System.out.println("\nDifference is " + output);
			break;
		
		case 3:
			output = num1 * num2;
			System.out.println("\nProduct is " + output);
			break;
		
		case 4:
			output = num1 / num2;
			System.out.println("\nDivision is " + output);
			break;
			
		default :
			System.out.println("\nInvalid Input");
			break;
		} 
		
	}
}
