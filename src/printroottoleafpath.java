import java.util.*;
class node14
{
	int data;
	node14 left,right;
	public node14(int data)
	{
		this.data = data;
		left=right=null;
	}
}
public class printroottoleafpath 
{
	
	public static void printpath(node14 root)
	{
		int[] path = new int[10000];
		printpathrec(root , path , 0);
	}
	
	public static void printpathrec(node14 root , int[] path ,int  plen)
	{
		if(root==null)
			return;
		
		path[plen] = root.data;
		plen++;
		
		if(root.left==null && root.right==null )
			printarray(path , plen);
		
		else
		{
		printpathrec(root.left , path ,plen);
		
		printpathrec(root.right , path ,plen);
		}
		
	}
	
	public static void printarray(int[] path ,int plen)
	{
		for(int i=0 ; i<plen ; i++)
			System.out.print(path[i]+" ");
		System.out.println("");
	}
	public static node14 insert(node14 root , int data)
	{
		if(root==null)
			return new node14(data);
		else
		{
			node14 curr;
			if(data<=root.data)
			{
				curr=insert(root.left,data);
				root.left=curr;
			}
			if(data>root.data)
			{
				curr=insert(root.right , data);
				root.right=curr;
			}
			return root;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		node14 root =null;
		while(n-->0)
		{
			int data = scan.nextInt();
			root=insert(root , data);
		}
		printpath(root);
	}
}
