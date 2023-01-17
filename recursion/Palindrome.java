package recursion;

import java.util.Scanner;

class printPal
{
	boolean printPal(String a, int i, int j)
	{
		if (i==j)
			return true;
		if((a.charAt(i)) != (a.charAt(j)))
			return false;
		if(i<j+1)
			return printPal(a, 1+i, j-1);
		return true;
	}
}

public class Palindrome {
	public static void main(String[] args) {
		String a;
		printPal pp = new printPal();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to check Palindrome - ");
		a=sc.next();
		int l = a.length();
		System.out.println("Is " + a + ", a palindrome? "+ pp.printPal(a, 0, l-1));
	}
}
