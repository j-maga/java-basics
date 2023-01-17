package string;

class StringB
{
	String str;
	StringB(String str)
	{
		this.str = str;
	}
	/*public String toString()
	{
		return this.str;
	}*/
}

public class Basics
{
	public static void main(String[] args) {
		StringB sb = new StringB ("Hi");
		String s1 = new String ("Hi");
		System.out.println(sb);
		System.out.println(s1);
	}

}
