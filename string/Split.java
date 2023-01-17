package string;

public class Split
{
	public static void main(String[] args)
	{
		String s1 = "Thexyzwebsitexyzisxyzsoftwaretestingxyzhelp";
		String []StrArr = s1.split("xyz", 4);
		
		for (int i=0; i<StrArr.length; i++)
		{
			System.out.println(StrArr[i]);
		}
	}
}
