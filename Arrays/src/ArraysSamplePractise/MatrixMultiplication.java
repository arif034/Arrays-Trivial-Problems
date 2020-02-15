package ArraysSamplePractise;
import java.util.*;
public class MatrixMultiplication
{
	public static void main(String[] args)
	{
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int c[][] = new int[3][3];
		c = matrixMultiplication(a,b,3);
		display(c);
	}
	public static int[][] matrixMultiplication(int [][]a, int [][]b, int n)
	{
		int [][]c = new int[3][3];
		for(int i=0;i<n;++i)
		{
			for(int j = 0;j<n;++j)
			{
				c[i][j] = 0;
			}
		}
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<n;++j)
			{
				for(int k=0;k<n;++k)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
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