package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NonRepeat 
{
	public static void main(String[] args) throws IOException
	{
		String s;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String ");
		s = bf.readLine();
		
		for (int j=0; j<s.length(); j++)
		{
			char ch = s.charAt(j);
			int repeat = 0;
			
			for (int i=0; i<s.length(); i++)
			{
				if (s.charAt(i)==ch)
				{
					repeat = repeat+1;
					if(repeat>=2)
					{
						//System.out.println(ch+" repeated");
						break;
					}
				}
			}
			
			if (repeat<2)
			{
				System.out.println(ch+" not repeated");
			}
		
		}

	}

}
