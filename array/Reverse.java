package array;

public class Reverse {
	public static void main(String[] args) {
		int A[] = new int [] {1, 2, 3, 4, 5};
		int B[] = new int [5];
		int C[] = new int [5];
		int n=4;
		
		System.out.println("Array A ");
		for(int i=0; i<5; i++)
		{
			System.out.print(A[i]+" ");
		}
		
		for (int i=0; i<=4; i++,n--)
		{
			B[i]=A[n];
		}
		
		System.out.println("\n\nArray B ");
		for(int i=0; i<5; i++)
		{
			System.out.print(B[i]+" ");
		}
		System.out.println("\nArray B Reversed!");
		
	}

}
