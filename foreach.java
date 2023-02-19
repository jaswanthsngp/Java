class Main
{
	public static void main(String args[])
	{
		//1D Array
		int num[]= {1,2,3,4,5};
		int sum= 0;
		for(int i:num)
		{
			System.out.print(i+" ");
			sum+=i;
		}
		System.out.println();
		System.out.println(sum);
		

		//2D Array
		int arr[][]= new int[3][5];
		sum= 0;
		for(int i=0; i<3; i++)
			for(int j=0; j<5; j++)
				arr[i][j]=(i+1)*(j+1);
		for(int x[]: arr)
		{
			for(int y: x)
			{
				System.out.print(y+" ");
				sum+=y;
			}
			System.out.println();
		}
		System.out.println(sum);
	}
}