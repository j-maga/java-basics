package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Swap
{
	public static void main(String[] args) throws IOException
	{
		int a, b;
		String s1, s2;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String 1 ");
		s1 = bf.readLine();
		System.out.println("Enter String 2 ");
		s2 = bf.readLine();
		System.out.println("\n\nBefore Swapping :\tString 1 - "+s1 +"\t\tString 2 - "+s2);
		a = s1.length();
		b = s2.length();
		s1 = s1.concat(s2);
		s2 = s2.concat(s1);
		s1 = s1.substring(a);
		s2 = s2.substring(b, a+b);
		System.out.println("After Swapping :\tString 1 - "+s1 +"\tString 2 - "+s2);
	}
}
