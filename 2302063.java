import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a[][]= {{1,2,3}, {4,7}, {2,3,5,7}};
		for(int i[]: a)
		{
			for(int j: i)
				System.out.print(j+" ");
			System.out.println();
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}