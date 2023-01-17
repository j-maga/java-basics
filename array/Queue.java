package array;

import java.util.Scanner;

class Colors
{
	String []Color;
	int size;
	int first;
	int last;
	int pointer;
	
	Colors(int size)
	{
		this.Color = new String[size];
		first = 0;
		last = -1;
		pointer = 0;
	}
	
	void insert(String s)
	{
		if(isFull())
		{
			System.out.println("Queue is Full!");
		}
		else
		{
			pointer++;
			Color[first] =s;
			first++;
		}
	}
	
	void delete()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty!");
		}
		else
		{
			first--;
			System.out.println(Color[first]+ "Removed!"); 
		}
		
	}
	
	void peek()
	{
		System.out.println(Color[first]);
	}
	
	void print()
	{
		for (int i=0; i<first; i++)
		{
			System.out.println(Color[i]);
		}
	}
	
	boolean isFull()
	{
		if (pointer==size-1)
			return true;
		else
			return false;
	}
	
	boolean isEmpty()
	{
		if(first==0)
			return true;
		else
			return false;
	}
	
}

public class Queue
{
	public static void main(String[] args)
	{
		String s;
		int size, choice;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Size of the Queue ");
		size = sc.nextInt();
		if (size<1)
			System.out.println("Invalid Size");
		
		Colors cque = new Colors(size);
		System.out.println("\nEnter your choice ");
		System.out.println("1.Insert\t2.Delete\t3.Print\t4.Peek");
		choice = sc.nextInt();
		
		do
		{
			switch(choice)
			{
			case 1:
				System.out.println("Enter color to add in queue ");
				s = sc.next();
				cque.insert(s);
				break;
			case 2:
				cque.delete();
				break;
			case 3:
				cque.print();
				break;
			case 4:
				cque.peek();
				break;
			default:
				System.out.println("Invalid Input !");
				break;
			}
		}while (choice>0 && choice<5);
	}
}
