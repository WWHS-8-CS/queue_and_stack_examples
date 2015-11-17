import java.util.*;
public class QueueOfInts {
	private	int[] a; //array where queue will be held
	private int N; //number of items in the queue  

public QueueOfInts(int maxLength)//initializes the array to store the queue in and its length
{
	a = new int[maxLength];
	N = 0;
}
public void enqueue(int number) 
{
	int spot = findNull(a[]);
	if(N >= a.length)
		throw new IllegalStateException("Can't add to a full queue.");
	a[spot] = number;
	N++;
}
public int dequeue() 
{   
	if (a[0] == null)
     		throw new IllegalStateException("Can't dequeue from an empty queue.");
     	int firstItem = a[0];
	N--;
	for(int i = 1; i < a.length; i++)
	{
		a[i-1] = a[i];
	}
	a[N] = null;
   	return firstItem;
   
}
   
}
