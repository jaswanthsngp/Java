//WAP to display the third largest element of an array

import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size");
		int n= sc.nextInt(), marks[], i;
		if(n<0 || n>20)
			System.out.println("Invalid Size");
		else if(n<3)
			System.out.println("Not Sufficient Elements");
		else
		{
			marks= new int[n];
			for(i=0; i<n; i++)
				marks[i]= (int)(Math.random()*100)+1;
			for(i=0; i<n; i++)
				System.out.print(marks[i]+" ");
			System.out.println();
			int first=0, second=0, third=0;
			for(i=0; i<n; i++)
			{
				if(marks[i]>first)
				{
					third= second;
					second= first;
					first= marks[i];
				}
				else if(marks[i]>second)
				{
					third= second;
					second= marks[i];
				}
				else if(marks[i]>third)
				{
					third= marks[i];
				}
			}
			System.out.println(first+" "+second+" "+third);
			System.out.println("The third lagest is "+third);
		}
	}
}