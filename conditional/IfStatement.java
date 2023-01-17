package conditional;

import java.util.Scanner;

public class IfStatement {
	public static void main(String args[])
	{
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mark ");
		marks = sc.nextInt();
		
		if (marks>=60)
		{
			System.out.println("Pass");
		}
	}

}
