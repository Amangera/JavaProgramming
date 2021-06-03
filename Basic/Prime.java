import java.util.*;
public class Prime
{
	public static void main(String args[])
	{
                Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		if(isprime(n))
		{
			System.out.println(n + "is a Prime number");
		}
		else
		{
			System.out.println(n + "is not a prime number");
		}
	}
		public static boolean isprime(int n)
		{
			if(n==0 || n==1)
			{
				return false;
			}
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
					return false;
			}
			return true;
	}
}
