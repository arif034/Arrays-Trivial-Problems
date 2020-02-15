package ArraysSamplePractise;
import java.util.*;
public class MaxSumSubArray 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;++i)
		{
			a[i] = sc.nextInt();
		}
		int result = maxSumSubArray(a);
		System.out.println(result);
	}
	public static int maxSumSubArray(int a[])
	{
		int maxSum = 0;
		int finalResult = 0;
		int len = a.length;
		for(int i=0;i<len;++i)
		{
			for(int j=0;j<len;++j)
			{
				maxSum = SumFromIToJ(a,i,j);
				if(maxSum > finalResult)
				{
					finalResult = maxSum;
				}
			}
		}
		return finalResult;
	}
	public static int SumFromIToJ(int a[], int i, int j)
	{
		int sum =0;
		for(int itr =i;itr <=j; ++itr)
		{
			sum+=a[itr];
		}
		return sum;
	}
}