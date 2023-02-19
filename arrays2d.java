import java.util.*;

//2-D Arrays
/*
Declaration:
	int Array[][]= new int[2][5];

	int Array[][]= new int[3][];
	int arr1= new int[5];
	int arr2= new int[3];
	int arr3= new int[9];
	Array[0]= arr1;
	Array[1]= arr2;
	Array[2]= arr3;

	int arr1[]= new int[5];
	int arr2[]= new int[7];
	int arr3[]= new int[2];
	int Array[][]= {arr1, arr2, arr3};

	int Array[][]= {{1,2,3}, {6,7}, {82, 93, 23}};
*/

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
		sc.close();
	}
}