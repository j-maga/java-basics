package string;

public class Comparison {
	public static void main(String[] args) {
		String s1, s2, s3, s4, s5;
		s1 = new String ("Java");
		s2 = s1;
		s3 = "java";
		s4 = "Java";
		s5 = "Php";
		
		System.out.println("S1 = "+s1 +"\tS2 = "+s2+"\tS3 = "+s3+"\tS4 = "+s4+"\tS5 = "+s5);
				
		System.out.println("\n== Operator ");
		System.out.println(s1==s4);
		System.out.println(s1==s2);
		
		System.out.println("\nEquals Method ");
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s2));
		
		System.out.println("\nCompare Method ");
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareToIgnoreCase(s4));
		System.out.println(s1.compareTo(s5));
		
		System.out.println("\nStarts with/ Ends with ");
		System.out.println(s1.startsWith("j"));
		System.out.println(s5.endsWith("p"));
		
		System.out.println("\nContent Equals ");
		System.out.println(s1.contentEquals(s3));
		
	}

}
