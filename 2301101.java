class Examination
{
	void cgpa()
	{
		System.out.println(8.6);
	}
	public static void main(String args[])
	{
		//Creating an object so that it's method can be called
		//no need if the fn is declared static
		Examination e= new Examination();
		e.cgpa();
	}
}