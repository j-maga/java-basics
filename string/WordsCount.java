package string;

public class WordsCount {

	public static void main(String[] args) {
		String s1 = "My name is Magalaxmi";
		String s2 = "I love fried Items";
		String s3 = "This   is   not         properly          formatted       line";
		
		System.out.println("\nString 1 "+s1+"\nNo.of Words "+ countWords(s1));
		System.out.println("\nString 1 "+s2+"\nNo.of Words "+ countWords(s2));
		System.out.println("\nString 1 "+s3+"\nNo.of Words "+ countWords(s3));

	}

	private static int countWords(String s)
	{
		int count = 1;
		
		for (int i=0; i<s.length(); i++)
		{
			if (s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				count++;
			}
			
			else if (s.charAt(i)==' ' && s.charAt(i+1)==' ')
			{
				continue;
			}
			
		}
		return count;
	}

}
