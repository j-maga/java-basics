package array;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Size ");
		n = sc.nextInt();
		
		int []Arr = new int[n];
		
		System.out.println("Enter Array Elements ");
		for (int i=0; i<n; i++)
		{
			Arr[i] = sc.nextInt();
		}
		
		Arrays.sort(Arr);
		
		System.out.println("\nArray Elements Sorted ");
		for (int i=0; i<n; i++)
		{
			System.out.print(Arr[i]+ "  ");
		}
		
	}

}
