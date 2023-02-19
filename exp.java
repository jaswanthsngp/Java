class Demo
{
	Demo(){
		System.out.println("Default");
	}
	Demo(int a){
		System.out.println("1 Param");
	}
	Demo(int a, int b){
		System.out.println("2 Param");
	}
}

class Main
{
	public static void main(String args[])
	{
		new Demo(2, 3);
	}
}