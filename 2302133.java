import java.util.*;

class Student
{
	int marks[][];
	void evaluation(int a[][])
	{
		marks= a.clone();
	}
	int[][] evaluation()
	{
		int a[][]= new int[3][2];
		for(int i=0; i<3; i++)
		{
			int first= 0, second= 0;
			for(int j=0; j<4; j++)
			{
				if(marks[i][j]>=first)
				{
					second= first;
					first= marks[i][j];
				}
				else if(marks[i][j]>second)
				{
					second= marks[i][j];
				}
			}
			a[i][0]= first; a[i][1]= second;
		}
		return a;
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		Student s1= new Student();
		int marks[][]= new int[3][4];
		for(int i=0; i<3; i++)
			for(int j=0; j<4; j++)
				marks[i][j]= sc.nextInt();
		s1.evaluation(marks);
		int tops[][]= s1.evaluation();
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<2; j++)
				System.out.print(tops[i][j]+" ");
			System.out.println();
		}
	}
}