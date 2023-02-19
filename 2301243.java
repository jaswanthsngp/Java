//WAP to create a class Car, having a data member speed, initialize the speed through initializer and display the speed through default constructor.

class Car
{
	int speed;
	{
		speed= 23;
	}
	Car()
	{
		System.out.println(speed);
	}
}

class Main
{
	public static void main(String args[])
	{
		Car c= new Car();
	}
}