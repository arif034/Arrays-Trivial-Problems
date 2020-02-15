package ArraysSamplePractise;
import java.util.*;
public class JumpSearch 
{	
	private static final int jump = 4;
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int n = 5;
		System.out.println(jumpSearch(a,jump,n)+1);
	}
	public static int jumpSearch(int []a,int span,int n)
	{
		int pos = 0;
		int len = a.length;
		int count = 0;
		for(int i=0;i<len;i+=span)
		{
			if(n == a[i])
				pos = i;
			if(n > a[i])
			{
				count++;
				continue;
			}
			else
			{
				if(n<a[i])
				{
					break;
				}
			}
		}
		for(int i = count*span; i < (count+1)*span; ++i)
		{
			if(n == a[i])
			{
				pos = i;
			}
		}
	return pos;	
	}
}