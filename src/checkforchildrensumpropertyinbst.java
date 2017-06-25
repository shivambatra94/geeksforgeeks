import java.util.*;
class node24
{
	int data;
	node24 left , right;
	public node24(int data)
	{
		this.data = data;
		left=right=null;
	}
}
public class checkforchildrensumpropertyinbst 
{
	static node24 root;
	public static int checksum(node24 root)
	{
		int leftdata = 0 , rightdata = 0;
		if(root==null ||(root.left==null && root.right==null))
			return 1;
		
		else
		{
			if(root.left!=null)
				leftdata = root.left.data;
			
			if(root.right!=null)
				rightdata = root.right.data;
			
			if((root.data==leftdata+rightdata)&&
					checksum(root.left)!=0 && checksum(root.right)!=0)
			return 1;
			else
				return 0;
			
		}
		
	}
	
	public static void main(String[] args)
	{
		
		checkforchildrensumpropertyinbst tree = new checkforchildrensumpropertyinbst();
		tree.root=new node24(10);
		tree.root.left=new node24(8);
		tree.root.right=new node24(2);
		tree.root.left.left=new node24(3);
		tree.root.left.right=new node24(0);
		tree.root.right.right=new node24(2);
		
		int a=checksum(tree.root);
		if(a==1)
			System.out.println("true");
		else
			System.out.println("false");
		
		
	}
}
