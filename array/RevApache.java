package array;

import org.apache.commons.lang3.ArrayUtils;

public class RevApache {
	public static void main(String[] args)
	{
		int A[] = new int [] {1, 2, 3, 4, 5};
		System.out.println("Array A ");
				
		for(int i=0; i<5; i++)
		{
			System.out.print(A[i]+" ");
		}
		
		ArrayUtils.reverse(A);
		System.out.println("Reversed Array ");
		
		for(int i=0; i<5; i++)
		{
			System.out.println(A[i]+" ");
		}
	}

}
