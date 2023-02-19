//WAP to take input from user of int type and tell if it is odd or even
import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int i= sc.nextInt();
		if(i%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
		sc.close();
	}
}