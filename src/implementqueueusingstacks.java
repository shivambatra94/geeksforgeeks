import java.util.*;

public class implementqueueusingstacks 
{

	int size =0;
	Stack<Integer> s1 = new Stack<>();
	//Stack<Integer> s2 = new Stack<>();
	void enqueue(int value)
	{
		
		s1.push(value);
		size++;
	}
	
	int dequeue()
	{
		if(size>0)
			size--;
			
		return getreversetop();
	}
	int getreversetop()
	{
		int x = s1.pop();
		if(s1.isEmpty())
			return 0;
		 int res = getreversetop();
			s1.push(x);
			return res;
		
	}
	/*void enqueue(int value)
	{
		s1.push(value);
	}
	int dequeue()
	{
		if(s1.isEmpty() && s2.isEmpty())
			return -1;
	
	    while(!s1.isEmpty())
	    {
		   s2.push(s1.pop());
	    }
	    return s2.pop();
	}*/
	public static void main(String...s)
	{
		implementqueueusingstacks a = new implementqueueusingstacks();
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		System.out.println(a.dequeue());
		System.out.println(a.dequeue());
		System.out.println(a.dequeue());
	}
}
