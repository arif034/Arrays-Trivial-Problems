package ArraysSamplePractise;
import java.util.*;
public class LinearSearch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int k = sc.nextInt();
		for(int i=0;i<n;++i)
		{
			a[i] = sc.nextInt();
		}
		LinearSearch(a,k);
//		System.out.println(result);
	}
	public static void LinearSearch(int[]a, int n)
	{
		int res = 0;
		int len = a.length;
		for(int i=0;i<len;++i)
		{
			if(a[i] == n)
			{
				res = i;
			}
		}
		System.out.println(res);
	}
}