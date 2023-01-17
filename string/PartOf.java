package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PartOf {
	public static void main(String[] args) throws IOException {
		String s1 = "Software Testing Help", s2;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any string to check ");
		s2 = bf.readLine();
		if (s1.contains(s2))
			System.out.println(s2+" is present in "+s1);
		else
			System.out.println(s2+" is not present in "+s1);
	}

}
