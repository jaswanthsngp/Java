//Arrays
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a[];
		a= new int[5];
		//int a[]= new int[5];
		//it can't be declared as a[5] (as static) as in C/C++, but only similar to pointers and DMA
		//Direct initialisation is also possible
		//int a[]= {1, 2, 3, 4, 5};
		int n= a.length;			//'length' variable holds the length of array
		for(int i=0; i<n; i++)
			a[i]= sc.nextInt();
		for(int i=0; i<n; i++)				//for loop references the array's contents
			System.out.print(a[i]+2+" ");
		System.out.println();
		for(int i: a)					//for each loop copies the values of array's contents into looping variable
			System.out.print(i+2+" ");
		sc.close();
	}
}