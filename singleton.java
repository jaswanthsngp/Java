//Singleton classes limit the number of objects to 1
class Singleton
{
  static Singleton ob;      									//lazy instantiation
  //static Singleton ob= new Stingleton();    //eager instantiation
	int x; 
  private Singleton()			//private pointer, ensures object can't be instantiated outside
	{
		x= 10;
	}
  public static Singleton getInstance()	//getInstance() returns the only object availiable
  {
    if(ob==null)
      ob= new Singleton(); 							//one and only instantiation
    return ob;
  }
	public void getValues()
	{
		System.out.println(x);
	}
}

class Main
{
  public static void main(String args[])
  {
    Singleton a= Singleton.getInstance();
		a.getValues();
  }
}