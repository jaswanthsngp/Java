import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int randoms[]= new int[5];
		System.out.println(Math.random());	//gives a random float between 0 and 1 (doesn't include end points)
		System.out.println(Math.random()*10);	//a float between 0 and 10
		System.out.println(Math.ceil(Math.random()*10));	// an int between 1 and 10, including end points


//WAP to get an array which has random no.s between 15 to 20
		for(int i=0; i<5; i++)
			randoms[i]= (int)Math.ceil((Math.random()*5))+15;
		for(int i=0; i<5; i++)
			System.out.print(randoms[i]+" ");
		
//WAP to create a number guess program
		randoms= new int[10];
		boolean won= false;
		for(int i=0; i<10; i++)
			randoms[i]= (int)(Math.random()*20)+ 1;
		System.out.print("Enter a number between 1 to 20:\t");
		int x= sc.nextInt();
		for(int i=0; i<10; i++)
		{
			if(x==randoms[i]);
			{
				won= true;
			}
		}
		if(won)
			System.out.println("YOU WON THE LOTTERY");
		else
			System.out.println("YOU LOST");
		for(int i=0; i<10; i++)
			System.out.print(randoms[i]+" ");
		System.out.println();
		sc.close();
	}
}