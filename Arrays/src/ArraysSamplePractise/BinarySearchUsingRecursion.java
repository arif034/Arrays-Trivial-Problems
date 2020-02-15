package ArraysSamplePractise;
import java.util.*;
public class BinarySearchUsingRecursion 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int n = 6;
		int position = BinarySearch(a,0,9,6);
		System.out.println(position);
	}
	public static int BinarySearch(int[]a, int start, int last, int element)
	{
		int pos = 0;
		int mid = (last+start)/2;
		if(element == a[mid])
		{
			pos = mid;
		}
		else
		{
			if(element > a[mid])
			{
				return BinarySearch(a,mid+1,last,element);
			}
			else
			{
				if(element<a[mid])
				{
					return BinarySearch(a,start,mid-1,element);
				}
			}
		}
		return ++pos;
	}
}