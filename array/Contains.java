package array;

import java.util.Scanner;

public class Contains {

	public static void main(String[] args)
	{
		int value;
		boolean has = false;
		
		int Arr[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to check ");
		value = sc.nextInt();
		
		for (int i=0; i<10; i++)
		{
			if (Arr[i] == value)
			{
				has = true;
				break;
			}
			else
			{
				has = false;
			}				
		}
		if (has==true)
			System.out.println("Array has Value "+value);
		else if (has==false)
			System.out.println("Array has no Value "+value);
	}
}
