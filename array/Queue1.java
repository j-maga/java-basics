package array;

public class Queue1   
{  

  int size;  
  int[] Arr;  
  int first;  
  int last;  
  int pointer;  
  
  public Queue1(int size)  
  {  
    this.size = size;  
    this.Arr = new int[size];  
    first = 0;  
    last = -1;  
    pointer = 0;  
  }  
  
  public void insert(int item)  
  {  
  
    if(isFull())  
    {  
      System.out.println("Queue is full!");  
      return;  
    }  
    if(last == size - 1)  
{  
      last = -1;  
    }  
    
    Arr[++last] = item;  
    pointer++;  
    System.out.println("Item added to queue: " + item);  
  }  
 
  public int delete()  
  {  
    
    if(isQueueEmpty())  
    {  
      System.out.println("Queue is empty");  
    }  
    
    int temp = Arr[first++];  
    if(first == size)  
    {  
      first = 0;  
    }  
    pointer--;  
    return temp;  
  }  
  
  public int peek()  
  {  
    return Arr[first];  
  }  
  
  public boolean isFull()  
  {  
    return (size == pointer);  
  }      
  
  public boolean isQueueEmpty()  
{  
    return (pointer == 0);  
  }  
  
  public static void main(String[] args)   
  {  
    Queue1 queue = new Queue1(5);	
    queue.insert(2);  
    queue.insert(3);  
    System.out.println("Dequeue: " + queue.delete());  
    System.out.println("Dequeue: " + queue.delete());  
    queue.insert(5);      
    System.out.println("Dequeue: " + queue.delete());      
  }  
}