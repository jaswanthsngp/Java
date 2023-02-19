import java.util.*;
class Examination
{
	static void display(String name, int reg, float cgpa)
	{
		System.out.println(name+" "+reg+" "+cgpa);
	}
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		String name= s.next();
		int reg= s.nextInt();
		float cgpa= s.nextFloat();
		display(name, reg, cgpa);
	}
}