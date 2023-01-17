package string;

public class Index {
	public static void main(String[] args) {
		String s1 = "Birds Fly in the Sky. Sky is blue in color";
		System.out.println(s1);
		
		System.out.println("indexOf(s) - " +s1.indexOf('s'));
		System.out.println("indexOf(Sky) - "+ s1.indexOf("Sky"));
		System.out.println("lastIndexOf(y) - "+ s1.lastIndexOf('y'));
		System.out.println("lastIndexOf(Sky) - "+ s1.lastIndexOf("Sky"));
		System.out.println("lastIndexOf(' ', 24) - "+ s1.lastIndexOf(' ', 24));
		System.out.println("lastIndexOf(in, 15) - "+ s1.lastIndexOf("in", 15));
	}
}
