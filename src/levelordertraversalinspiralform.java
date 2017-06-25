import java.util.*;
class node23
{
	int data;
	node23 left,right;
	public node23(int data)
	{
		this.data = data;
		right=left=null;
		
	}
	
}
public class levelordertraversalinspiralform
{
	/*public static int height(node23 root)
	{
		if(root==null)
			return 0;
		else 
		return 1+Math.max(height(root.left) , height(root.right));
	}
	public static void printfrom(node23 root)
	{
		int h = height(root);
		boolean itr = false;
		for(int i=1 ; i<=h ; i++)
		{
			spiralform(root , i , itr);
			itr = !itr;
		}
	}
	public static void spiralform(node23 root , int h , boolean itr)
	{
		if(root==null)
			return;
		if(h==1)
			System.out.print(root.data);
		else if(h>1)
		{
			if(itr!=false)
			{
				spiralform(root.left , h-1 , itr);
				spiralform(root.right , h-1 , itr);
			}
			else
			{
				spiralform(root.right , h-1 , itr);
				spiralform(root.left , h-1 , itr);
			}
		}
	}*/
	//using iterative o(n)
	public static void spiral(node23 root)
	{
		if(root==null)
			return;
		Stack<node23> s1 = new Stack<>();
		Stack<node23> s2 = new Stack<>();
		s1.push(root);
		while(!s1.isEmpty() || !s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
				node23 temp = s1.peek();
				s1.pop();
				System.out.println(temp.data);
				
				if(temp.right!=null)
					s2.push(temp.right);
				if(temp.left!=null)
					s2.push(temp.left);
				
			}
			
			while(!s2.isEmpty())
			{
				node23 temp = s2.peek();
				s2.pop();
				System.out.println(temp.data);
				
				if(temp.left!=null)
					s1.push(temp.left);
				if(temp.right!=null)
					s1.push(temp.right);
				
			}
		}
		
	}
	public static node23 insert(node23 root ,  int data)
	{
		if(root==null)
			return new node23(data);
		else
		{
		node23 curr;
		if(data<=root.data)
		{
			curr = insert(root.left , data);
			root.left = curr;
		}
		else if(data>=root.data)
		{
			curr = insert(root.right , data);
			root.right = curr;
		}
		
		
		return root ;
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	    node23 root = null;
		while(n-->0)
		{
			int data = scan.nextInt();
			root = insert(root , data);
		}
		spiral(root);
	}
}
