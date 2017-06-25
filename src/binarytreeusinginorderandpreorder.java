import java.util.*;
class node3
{
	char data;
	node3 right,left;
	node3(char data)
	{
		this.data = data;
		right=left=null;
	}
}
public class binarytreeusinginorderandpreorder 
{
	static node3 root;
	static int preindex = 0;
	public static node3 binarytree(char[] in , char[] pre , int start , int end)
	{
	   if(start>end)
		   return null;
	   node3 tnode = new node3(pre[preindex++]);
	   if(start==end)
		   return tnode;
	   int index = search(in , start , end , tnode.data);
	   tnode.left = binarytree(in , pre , start , index-1);
	   tnode.right = binarytree(in , pre , index+1 , end);
	   
	   return tnode;
	   
	} 
	
	public static int search(char[] arr , int start , int end , char value)
	{
		int i;
		for(i=start ; i<=end ; i++)
		{
			if(arr[i]==value)
				return i;
		}
		return i;
	}
	public static void inorder(node3 root)
	{
		if(root==null)
			return;
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void main(String[] args)
	{
		
		char[] in = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
		char[] pre = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
		int len = in.length;
		node3 root = binarytree(in , pre , 0 , len-1);
		inorder(root);
	}
}
