package ArraysSamplePractise;
import java.util.*;
public class DifferentBehaviourStringProblem
{
	public static void main(String[] args)
	{
		String s = null;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 0)
		{
			s = sc.next();
			s = sc.nextLine();
		}
		else
		{
			if(n == 1)
			{
			s = sc.nextLine();
			s = sc.next();
			}
		}
		System.out.println(s);
	}
}