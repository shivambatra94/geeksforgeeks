import java.util.*;
public class specialstackdatastructure 
{
	int top;
	int[] max;
	int[] aux;
	public specialstackdatastructure(int size)
	{
		aux=new int[size];
		max = new int[size];
		top=-1;
	}
	public void push(int data)
	{
		if(top==max.length-1)
		{
			System.out.println("no space for "+data);
			return;
		}
		
		else if(top==-1)
		{
			aux[top+1] = data;
			max[top+1] = data;
		}
		
		else
		{
			if(top<max.length && data<aux[top])
			{
				aux[top+1]=data;
				max[top+1]=data;
			}
			
			else if(top<max.length && data>aux[top])
			{
				aux[top+1]=aux[top];
				max[top+1] = data;
			}
		}
		top++;
	}
	
	public void getmin()
	{
		System.out.println(aux[top]);
	}
	public void peek()
	{
		System.out.println(max[top]);
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("no element in stack");
		}
		else
			System.out.println(max[top--]);
	}
	public static void main(String[] args)
	{
		specialstackdatastructure s = new specialstackdatastructure(5);
		s.push(50);
		s.push(40);
		s.push(30);
		s.push(20);
		s.push(100);
		s.push(70);
		
		s.getmin();
		s.peek();
		s.pop();
		s.peek();
		
	}
}
