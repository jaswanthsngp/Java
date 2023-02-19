
class Student
{
	String name;
	int roll;
	Student()
	{
		name= "";
		roll= 0;
	}
	Student(String name)
	{
		this();
		this.name= name;
	}
	Student(int roll)
	{
		this("noname");
		this.roll= roll;
		System.out.println(name+" "+roll);
	}
	void display()
	{
		System.out.println(name+" "+roll);
	}
} 

class Main
{
	public static void main(String args[])
	{
		Student x= new Student();
		Student y= new Student("Jaswanth");
		Student z= new Student(19);
		x.display();
		y.display();
		z.display();
	}
}