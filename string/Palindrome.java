package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome
{
	public static void main(String[] args) throws IOException
	{
		String s1, s2="";
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String to check Plaindrome ");
		s1 = bf.readLine();

		for (int i=s1.length()-1; i>=0; i--)
		{
			s2=s2+s1.charAt(i);
		}
		if (s2.equals(s1))
			System.out.println("Palindrome ");
		else
			System.out.println("Not a Plaindrome ");
	}
}
