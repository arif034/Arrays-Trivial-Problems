package ArraysSamplePractise;
import java.util.*;
public class BinarySearchWithoutRecursion 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int m = 6;
		int position = binarySearch(a,m);
		System.out.println(++position + "th Element in Array");
	}
	public static int binarySearch(int a[], int n)
	{
		int len = a.length;
		int mid = len/2;
		int last = len-1;
		int start = 0;
		int pos = 0;
		for(int i=start;i<last;++i)
		{
			if(a[mid] == n)
			{
				pos = mid;
			}
			else
			{
				if(n > a[mid])
				{
					start = mid+1;
					mid = (last+start)/2;
				}
				else
				{
					last = mid-1;
					mid = (start+last)/2;
				}
			}
		}
		return pos;
	}
}