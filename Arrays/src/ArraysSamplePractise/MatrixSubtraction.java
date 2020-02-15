package ArraysSamplePractise;
import java.util.*;
public class MatrixSubtraction 
{
	public static void main(String[] args)
	{
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int c[][] = new int[3][3];
		c = matrixSubtraction(a,b,3);
		display(c);
	}
	public static int[][] matrixSubtraction(int [][]a, int [][]b, int n)
	{
		int [][]c = new int[3][3];
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<n;++j)
			{
				c[i][j] = a[i][j] - a[i][j];
			}
		}
		return c;
	}
	public static void display(int [][]a)
	{
		for(int i=0;i<3;++i)
		{
			for(int j = 0;j<3;++j)
			{
				System.out.println(a[i][j]);
			}
		}
	}
}