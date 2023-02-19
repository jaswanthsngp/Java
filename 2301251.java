import java.util.*;

class BankingApplication
{
	int balance;
	BankingApplication()
	{
		balance= 1000;
		System.out.println("Initial Balance "+balance);
	}
	void deposit(int amount)
	{
		balance+=amount;
		System.out.println("Balance: "+balance);
	}
	void withdraw(int amount)
	{
		balance-=amount;
		System.out.println("Balance: "+balance);
	}
	void checkBalance()
	{
		System.out.println("The balance left is "+balance);
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int x= 1;
		BankingApplication obj= new BankingApplication();
		System.out.println("Press\n1 to deposit\n2 to withdraw\n3 to check balance or\nAny other integer to exit");
		while(0<x && x<4){
		x= sc.nextInt();
		switch(x)
		{
			case 1:
				System.out.println("Enter the amount");
				obj.deposit(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter the amount");
				obj.withdraw(sc.nextInt());
				break;
			case 3:
				obj.checkBalance();
				break;
			default:
				System.out.println("Program terminated");
			}
		}
	}
}