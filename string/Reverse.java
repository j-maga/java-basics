package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String - ");
		String s = bf.readLine();
		StringBuffer s1 = new StringBuffer (s);
		System.out.println("Reverse String is "+s1.reverse());
	}

}
