/*
WAP to create a class Examination having data members
-Name,reg,subject1,subjet2,subject3
-float tgpaCalc()
-show()
Take the input of Data members from User and intialise the same through contructor
and return the calculated tgpa of student through the tgpa() method and also show th basic detail like name and reg through show method
*/
import java.util.*;
class Examination
{
	String name;
	int reg;
	float sub1, sub2, sub3;
	Examination(int reg, float sub1, float sub2, float sub3, String name)
	{
		this.name= name;
		this.reg= reg;
		this.sub1= sub1;
		this.sub2= sub2;
		this.sub3= sub3;
	}
	float tgpaCalc()
	{
		return (this.sub1+this.sub2+this.sub3)/30;
	}
	void show()
	{
		System.out.println(name+" with reg no."+reg+" secured the TGPA "+tgpaCalc());
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the reg. no, marks of sub1, sub2, sub3 and your name respectively");
		Examination e1= new Examination(sc.nextInt(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextLine());
		e1.show();
	}
}