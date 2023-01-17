package array;

import java.util.Arrays;
import java.util.Scanner;

public class Copy {
	public static void main(String[] args) {
		int A[] = new int[5];
		int B[] = new int[5];
		int C[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements ");
		for (int i=0; i<5; i++)
		{
			A[i]=sc.nextInt();
		}
		
		for(int i=0; i<5; i++)
		{
			B[i]=A[i];
		}
		
		System.out.println("\nArray B ");
		for(int i=0; i<5; i++)
		{
			System.out.print(B[i]+" ");
		}
		System.out.println("\tArray Copied!");
		
		C = Arrays.copyOf(B, 5);
		
		System.out.println("\nArray C ");
		for (int i=0; i<5; i++)
		{
			System.out.print(C[i]+" ");
		}
		System.out.println("\tArray C copied from B!");
				
		
	}

}
