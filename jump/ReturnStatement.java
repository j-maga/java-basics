package jump;


public class ReturnStatement {
	   public int add()
	   { 
	      int x = 30;
	      int y = 70;
	      int z = x+y;
	      return z;
	   }
	   
	   public static void main(String args[]) {
	      ReturnStatement rs = new ReturnStatement();
	      int add = rs.add();
	      System.out.println("The sum of x and y is: " + add);
	   }
	}