package string;

import java.util.Scanner;

public class Concatenation {
	public static void main(String[] args) {
		String fname, lname, name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Strings ");
		fname = sc.next();
		lname = sc.next();
		name = fname.concat(lname);
		System.out.println(name);
	}

}
