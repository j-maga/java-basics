package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Operations
{
	ArrayList <String> cars = new ArrayList <String>(Arrays.asList("Mercedes-Benz", "Lamborghini", "Ferrari", "BMW", "Toyota"));
	
	void add(String input)
	{
		cars.add(input);
	}
	
	void add(int index, String input)
	{
		cars.add(index, input);
	}
	
	void delete(String input)
	{
		cars.remove(input);
	}
	
	void delete(int index)
	{
		cars.remove(index);
	}
	
	void modify(int index, String input)
	{
		cars.set(index, input);
	}
	
	void display()
	{
		for (int i=0; i<cars.size(); i++)
		{
			System.out.print(cars.get(i)+", ");
		}
	}
	
	void sort()
	{
		Collections.sort(cars);
	}
	
	int size()
	{
		return cars.size();
	}
}

public class BasicArrayList {
	public static void main(String[] args) {
		int choice1, choice2, index;
		String input;
		
		Scanner sc = new Scanner(System.in);
		Operations op = new Operations();
		
		System.out.println("-- ArrayList Basic Operations --");
		System.out.println("\n1.Add\t\t2.Remove\n3.Modify\t4.Display\n5.Sort\t\t6.Size");
		
		do {
			System.out.println("\nYour Choice - ");
			choice2 = sc.nextInt();
			
			switch(choice2)
			{
			case 1:
				System.out.println("\n1.Using index \t2.Without index");
				choice1 = sc.nextInt();
				
				if (choice1==1)
				{
					System.out.println("Enter here to add ");
					input = sc.next();
					System.out.println("Enter index ");
					index = sc.nextInt();
					op.add(index, input);
				}
				else if(choice1==2)
				{
					System.out.println("Enter here to add ");
					input = sc.next();
					op.add(input);
				}
				else
				{
					System.out.println("Invalid Choice");
				}
				break;
				
			case 2:
				System.out.println("\n1.Using index \t2.Without index");
				choice1 = sc.nextInt();
				
				if (choice1==1)
				{
					System.out.println("Enter index to delete ");
					index = sc.nextInt();
					op.delete(index);
				}
				else if(choice1==2)
				{
					System.out.println("Enter value to delete ");
					input = sc.next();
					op.delete(input);
				}
				else
				{
					System.out.println("Invalid Choice");
				}
				break;
			
			case 3:
				System.out.println("Enter here to modify ");
				input = sc.next();
				System.out.println("Enter index ");
				index = sc.nextInt();
				op.modify(index, input);
				break;
			
			case 4:
				op.display();
				break;
			case 5:
				op.sort();
				System.out.println("Sorted");
				break;
			case 6:
				System.out.println(op.size()); 
				break;
				
			default:
				System.out.println("Check your choice !");
				break;
			}
		}while(choice2>0 && choice2<7);
	}
}
		