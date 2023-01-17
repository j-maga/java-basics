package conditional;

import java.util.Scanner;

public class IfElseifLadder {
	public static void main(String args[])
	{
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks ");
		marks = sc.nextInt();
		if (marks >= 90)
		{
			System.out.println("O grade");
		}
		else if (marks >= 80 && marks <90)
		{
			System.out.println("A grade");
		}
		else if (marks >= 70 && marks <80)
		{
			System.out.println("B grade");
		}
		else if (marks >= 60 && marks <70)
		{
			System.out.println("C grade");
		}
		else if (marks <60 && marks>0)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}
