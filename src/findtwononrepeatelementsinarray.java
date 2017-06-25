
public class findtwononrepeatelementsinarray 
{
	public static void findele(int[] arr)
	{
		int a = 0;
		int x = 0, y = 0;
		int i;
		for(i=0 ; i<arr.length ; i++)
		{
			a^=arr[i];
		}
		int setbit = (a&-a);//(a&-(a-1))
		for(i=0 ;i<arr.length ;i++)
		{
			if((arr[i] & setbit)>0)
			x = x ^ arr[i];
			else
				y=y^arr[i];
		}
		System.out.println(x+" "+y);
		
	}
	public static void main(String[] args)
	{
		int[] arr = {2,3,11 , 7,9,11,2,3};
		findele(arr);
	}
}
