//WAP to reverse array
/*
	take array i/p from user
	pass array as parameter to revrseArray
	display new array inside main
*/
import java.util.*;

class Main
{
	int[] reverseArray(int a[])
	{
		//using two pointers from both sides till they crash and swapping them
		for(int i=0, j= a.length-1; i<j; i++, j--)
		{
			int temp= a[i];
			a[i]= a[j];
			a[j]= temp;
		}
		return a;
	}

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size:\t");
		int n= sc.nextInt(), a[]= new int[n];
		System.out.println("Enter elements");
		for(int i=0; i<n; i++)
			a[i]= sc.nextInt();
		int x[]= new Main().reverseArray(a.clone());
		//returned array
		for(int i=0; i<n; i++)
			System.out.print(x[i]+" ");
		System.out.println();
		//passed array, it doesn't change because it is passed by value. Passing its name directly results in reference
		for(int i=0; i<n; i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
}

