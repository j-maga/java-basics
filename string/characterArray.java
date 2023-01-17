package string;

import java.util.Scanner;

public class characterArray {
	public static void main(String[] args) {
		String name;
		char[] charName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		name = sc.next();
		charName = name.toCharArray();
		
		for (int i=0; i<charName.length; i++)
		{
			System.out.println(charName[i]);
		}		
		
	}

}