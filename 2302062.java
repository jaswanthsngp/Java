import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a[][]= new int[4][5];
		for(int i=0; i<4; i++)
		{
			System.out.println("Marks of Student "+ (i+1));
			for(int j=0; j<5; j++)
				a[i][j]= sc.nextInt();
		}
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<5; j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}