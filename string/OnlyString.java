package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnlyString {
	public static void main(String[] args) throws IOException
	{
		String s1;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String ");
		s1 = bf.readLine();
		
		char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int acount=0;
		
		for (int i=0; i<s1.length(); i++)
		{
			for (int j=0; j<10; j++)
			{
				if(s1.charAt(i)==arr[j])
				{
					System.out.println(s1.charAt(i));
					j++;
				}
				else
					acount=acount+1;
			}
		}
		if (acount==0)
			System.out.println("String has no alphabet ");
		else
			System.out.println("String has alphabets");
	}

}
