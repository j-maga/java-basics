package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contains {
	public static void main(String[] args) throws IOException {
		String s1, s2;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String 1 ");
		s1 = bf.readLine();
		System.out.println("Enter String 2 ");
		s2 = bf.readLine();
		if (s1.contains(s2))
			System.out.println(s1 + " contains "+ s2);
		else
			System.out.println(s1 + " doesn't contain " + s2);
	}

}
