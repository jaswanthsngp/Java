class Main
{
	public static void main(String args[])
	{
		String str= "she saw a ship in the sea";
		int count=0, size= str.length();
		for(int i=0; i<size; i++)
		{
			if(str.charAt(i)!='s') continue;
			count++;
		}
		System.out.println("Number of 's's in the string: "+count);

		outer:
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(j>i)
				{
				  System.out.println(" Hi");
				  continue outer;
				}
				System.out.print(" "+(i*j));
			}
		}
	}
}
