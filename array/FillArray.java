package array;

public class FillArray {
	public static void main(String[] args) {
		int A[] = new int[7];
		double B[] = new double[7];
		
		for(int i=0; i<7; i++)
		{
			A[i] = (int) (Math.random()*100);
			B[i] = (float) (Math.random());
		}
		
		System.out.println("Array A");
		for(int i=0; i<7; i++)
		{
			System.out.print(A[i]+" ");
		}
		
		System.out.println("\n\nArray B\n");
		for(int i=0; i<7; i++)
		{
			System.out.println(B[i]*100);
		}
	}

}
