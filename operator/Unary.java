package operator;

public class Unary {
	public static void main(String[] args) {
		int a=5;
		a=a++;
		a=a%2;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(++a);
	}
}
