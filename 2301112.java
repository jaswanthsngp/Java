//WAP to find if a number is prime or not
import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt(), f= 0;
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
				f++;
		}
		if(f>0)
			System.out.println("Not a Prime");
		else
			System.out.println("Prime Number");
		sc.close();
	}
}