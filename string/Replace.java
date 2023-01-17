package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Replace {
	public static void main(String[] args) throws IOException {
		String s1;
		String s2 = "Maga is a Trainee";
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String 1 - ");
		s1 = bf.readLine();
		
		System.out.println("Char replace - "+s1.replace('a', 'i'));
		System.out.println("Char Seq replace - "+s1.replace("aga", "J"));
		System.out.println("\nString Replace - "+s2.replaceAll(s1, "She"));
	}
}
