//local variables doesn't have any default values
//instance variable have default values
class Main
{
	int inst;	//instance variable, non static
	static int x;	//static instance variable
	public static void main(String args[])
	{
		int i=1, x=2;	//local variable
		System.out.println(i);				//local i
		System.out.println(new Main().inst);	//non statc instance inst, can be accessed only through object because it is static
		System.out.println(x);				//local x
		System.out.println(Main.x);			//static instance x
	}
}