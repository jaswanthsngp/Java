class Main
{
	public static void main(String args[])
	{
		for(int i=0; i<100; i++)
		{
			if(i==10) break;
			System.out.print(i+" ");
		}
		System.out.println();

		outer:
		for(int i=0; i<3; i++)
		{
			System.out.println("outer "+i);
			inner:
			for(int j=0; j<3; j++)
			{
				System.out.println("Inner "+j);
				if(i==j+1)
					break outer;
				//here it breaks out from "outer" block, but if we use unlabelled break, it breaks out only from "inner" block
			}
		}
	}
}