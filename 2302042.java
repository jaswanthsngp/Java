import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a[]= new int[8], i, k, x;
		System.out.println("Enter 7 elements");
		for(i=0; i<7; i++)
			a[i]= sc.nextInt();
		System.out.print("Enter the index to insert:\t");
		k= sc.nextInt();
		System.out.print("Enter the number to insert:\t");
		x= sc.nextInt();
		for(i=7; i>0; i--)
		{
			if(i==k)
			{
				a[i]= x;
				break;
			}
			else
				a[i]=a[i-1];
		}
		if(k==0)
			a[0]= x;
		System.out.println("The final array is");
		for(i=0; i<8; i++)
			System.out.print(a[i]+" ");
	}
}