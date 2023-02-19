//WAP to create a class e-wallet having data members name and balance amount. Now take the i/p of name and the balance amoutn from user, initialize the data member through constructor and display the e-wallet detail through show fn.

import java.util.*;

class Ewallet
{
	String name;
	int balance;
	static
	{
		//Static block will be excecuted first of all, even before the Object is created
		System.out.println("This is from static block");
	}
	{
		//this is initializer block, will be excecuted before constructor and after static
		this.balance= 500;
		System.out.println("This is from init block");
	}
	//Parameterized Constructor
	Ewallet(String name, int balance)
	{
		//this=> this class' variable
		this.name= name;
		this.balance= balance;
		System.out.println("This is from constructor");
	}
	void show()
	{
		System.out.println(this.name+" "+this.balance);
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name and balance");
		Ewallet e1= new Ewallet("ABC", 234);
		Ewallet e2= new Ewallet(sc.nextLine(), sc.nextInt());
		e1.show();
		e2.show();
		sc.close();
	}
}

// A constructor is privided by the compiler unless one is given by us