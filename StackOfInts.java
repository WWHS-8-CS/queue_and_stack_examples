import java.util.*;
public class StackOfInts {
	private	int[] a;
	private int N; 

public StackOfInts(int maxLength)
{
	a = new int[maxLength];
	N = 0;
	for(int i: a)
		i = -1;
}
public void push(int number) 
{
	if(N >= a.length)
		throw new IllegalStateException("Can't push to a full stack.");
	for(int i = a.length - 1; i > 0; i++)
        {
                a[i] = a[i-1];
        }
	a[0] = number;
	N++;
}
public int pop() 
{   
	if (a[0] == -1)
     		throw new IllegalStateException("Can't remove from an empty stack.");
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
