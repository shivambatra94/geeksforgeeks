import java.util.*;
public class getlevelofnodeinbinarytree 
{
	class node
	{
		int data;
		node left,right;
		node(int data)
		{
			this.data = data;
			left=right=null;
		}
	}
	 node insert(node root , int data)
	{
		 if(root==null)
			return new node(data);
			
		 else
			{
				node curr;
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
	 public static int getlevelutil(node root , int temp , int level)
	 {
		 if(root==null)
			 return 0;
		 if(root.data==temp)
			 return level;
		 
		 int downlevel = getlevelutil(root.left , temp , level+1);
		 System.out.println(downlevel);
		 if(downlevel!=0)
			 return downlevel;
		 downlevel = getlevelutil(root.right , temp , level+1);
		 System.out.println(" x= "+downlevel);
		 return downlevel;
	 }
	 public static int getlevel(node root , int temp)
	 {
		 return getlevelutil(root , temp , 1);
	 }
	public static void main(String[] args)
	{
		getlevelofnodeinbinarytree  tree = new getlevelofnodeinbinarytree();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		node root = null;
		while(n-->0)
		{
			int data = scan.nextInt();
			root = tree.insert(root , data);
		}
		int temp = scan.nextInt();
		int a = getlevel(root , temp);
		System.out.println(a);
	}
}
