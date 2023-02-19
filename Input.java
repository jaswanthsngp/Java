import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int i= sc.nextInt();
		float f= sc.nextFloat();
		double d= sc.nextDouble();
		long l= sc.nextLong();
		sc.nextLine();	//to take input buffer
		String s= sc.nextLine();
		String w= sc.next();
		char c= sc.next().charAt(0);
		
		System.out.println("int "+i);
		System.out.println("float "+f);
		System.out.println("double "+d);
		System.out.println("long "+l);
		System.out.println("String "+s);
		System.out.println("Word "+w);
		System.out.println("char "+c);
		sc.close();
	}
}