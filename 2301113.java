/*
	WAP with class Student with get() and show() methods
	get() fetches name and reg.no from user
	show() displays the details
*/
import java.util.*;
class Student
{
	void show(String name, int reg)
	{
		System.out.println(name+" "+reg);
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		Student st= new Student();
		sc.nextLine();
		String s= sc.nextLine();
		sc.nextLine();
		int i= sc.nextInt();
		st.show(s, i);
	}
}