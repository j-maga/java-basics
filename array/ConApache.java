package array;

import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;

public class ConApache {

	public static void main(String[] args)
	{
		int value;
		boolean has;
		
		int Arr[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to check ");
		value = sc.nextInt();
		
		has = ArrayUtils.contains(Arr, value);
		
		if (has)
			System.out.println("Array has Value "+value);
		else
			System.out.println("Array has no Value "+value);
	}

}
