import java.util.*;
class fibonacci
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c;
		int count= sc.nextInt();
		System.out.print( a + " " + b );
		for(int i=0;i<count-2;i++)
		{
			c=a+b;
			System.out.print(" "+ c );
			a=b;
			b=c;

		}
	}
}
