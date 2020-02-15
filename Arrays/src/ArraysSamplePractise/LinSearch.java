package ArraysSamplePractise;
import java.util.*;
public class LinSearch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {1,2,3,4,5,6,7};
		int k = 4;
		int res =0;
		for(int i=0;i<a.length;++i)
		{
			if(a[i] == k)
			{
				res = i;
			}
		}
		++res;
		System.out.println(res + "th Position");
	}
}