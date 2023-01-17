package array;

import java.util.Scanner;

public class Average {
	public static void main(String[] args)
	{
		int size;
		int A[] = new int[] {1, 2, 6, 4, 5};
		
		int sum=0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Array Elements ");
		for (int i=0; i<A.length; i++)
		{
			System.out.print(A[i]+" ");
		}
		
		for (int i=0; i<A.length; i++)
		{
			sum = sum+A[i];
		}
		float average = (float)sum/5; 
		System.out.println("\nSum is - "+sum+"\nAverage is - "+average);
		
		sum=0;
		System.out.println("\n\nEnter Array size ");
		size = sc.nextInt();
		int B[] = new int[size];
		
		System.out.println("Enter Array Elements ");
		for (int i=0; i<size; i++)
		{
			B[i]=sc.nextInt();
		}
		
		for (int i=0; i<B.length; i++)
		{
			sum = sum+B[i];
		}
		average = (float)sum/size; 
		System.out.println("Sum is "+sum+"\nAverage is "+average);		
	}
}
