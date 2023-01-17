package array;

public class Equals
{
	public static void main(String[] args)
	{
		int A[] = new int[] {1, 2, 3, 4, 5};
		int B[] = new int[] {1, 2, 3, 4, 5};
		int C[] = new int[] {2, 4, 6, 1, 3};
		
		int count=0;
		
		System.out.println("Array A ");
		for (int i=0; i<5; i++)
		{
			System.out.print(A[i]+" ");
		}
		
		System.out.println("\n\nArray B");
		for (int i=0; i<5; i++)
		{
			System.out.print(B[i]+" ");
		}
		
		System.out.println("\n\nArray C");
		for (int i=0; i<5; i++)
		{
			System.out.print(C[i]+" ");
		}
		
		if (A.length == B.length)
		{
			for (int i=0; i<5; i++)
			{
				if(A[i]==B[i])
				{
					count = count+1;
				}
				else
					break;
			}
		}
		
		if(count==A.length)
			System.out.println("\n\nArray A and B - Equal");
		else
			System.out.println("\n\nArray A and B - Not Equal");
		
		if (A.equals(C))
			System.out.println("\nA and C - Equal");
		else
			System.out.println("\nA and C - not Equal");
	}

}
