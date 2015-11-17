import java.util.*;
public class QueueOfInts {
	private	int[] a; //array where queue will be held
	private int N; //number of items in the queue  

public QueueOfInts(int maxLength)//initializes the array to store the queue in and its length
{
	a = new int[maxLength];
	N = 0;
	for(int i: a)
		i = -1;
}
public void enqueue(int number) 
{
	if(N >= a.length)
		throw new IllegalStateException("Can't add to a full queue.");
	a[N] = number;
	N++;
}
public int dequeue() 
{   
	if (a[0] == -1)
     		throw new IllegalStateException("Can't dequeue from an empty queue.");
     	int firstItem = a[0];
	N--;
	for(int i = 1; i < a.length; i++)
	{
		a[i-1] = a[i];
	}
	a[N] = -1;
   	return firstItem;
   
}
   
}
