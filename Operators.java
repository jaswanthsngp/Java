class Main
{
	public static void main(String args[])
	{

		//Arithmetic Operators
		int a= 10;
		int b= 20;
		int c= 25;
		int d= 25;
		System.out.println("a+b= "+(a+b));
		System.out.println("a+b= "+a+b);
		System.out.println("a-b= "+(a-b));
		System.out.println("a*b= "+(a*b));
		System.out.println("b/a= "+(b/a));
		System.out.println("b%a= "+(b%a));
		System.out.println("a%b= "+(a%b));
		System.out.println("c%a= "+(c%a));
		System.out.println("++a= "+(++a));
		System.out.println("--a= "+(--a));
		System.out.println("d++= "+(d++));
		System.out.println("++d= "+(++d));
		char c1= 'A';
		char c2= 'B';
		System.out.println("c1+c2= "+(c1+c2));

		//Assignment Operators
		a= 10;
		b= 20;
		c= 0;
		c= a+b;
		System.out.println("c= a+b = "+ c);
		c+=a;
		System.out.println("c+=a = "+ c);
		c-=a;
		System.out.println("c-=a = "+ c);
		c*=a;
		System.out.println("c*=a = "+ c);
		c/=a;
		System.out.println("c/=a = "+ c);
		c%=a;
		System.out.println("c%=a = "+ c);
		c=-a;
		System.out.println("c=-a = "+ c);
		c=+b;
		System.out.println("c=+b = "+ c);


		//Logical Operators
		boolean x= true;
		boolean y= false;
		System.out.println("a && b = "+ (x&&y));
		System.out.println("a || b = "+ (x||y));
		System.out.println("!(a && b) = "+ !(x&&y));

		//Relational Operators
		a=10; b= 20;
		System.out.println(" a==b = "+ (a==b));
		System.out.println(" a!=b = "+ (a!=b));
		System.out.println(" a>b = "+ (a>b));
		System.out.println(" a<b = "+ (a<b));
		System.out.println(" a>=b = "+ (a>=b));
		System.out.println(" a<=b = "+ (a<=b));

		//Ternary Operator
		a= 10; b=0;
		b= (a==1)?20:30;
		System.out.println("Value of b is "+b);
		b= (a==10)?20:30;
		System.out.println("Value of b is "+b);

		//Bitwise Operators
		a= 60;		//60= 0011 1100
		b= 13;		//13= 0000 1101
		c= 0;
		c= a & b;		//12= 0000 1100
		System.out.println("a & b= "+c);
		c= a | b;		//61= 0011 1101
		System.out.println("a | b= "+c);
		c= a ^ b;		//49= 0011 0001
		System.out.println("a ^ b= "+c);
		c= ~a; 	    	//-61= 1100 0011
		System.out.println("~a= "+c);
		c= a<<2;		//240= 1111 0000
		System.out.println("a<<2= "+c);
		c= a>>2;		//215= 0000 1111
		System.out.println("a>>2= "+c);
		c= a>>>2;		//215= 0000 1111
		System.out.println("a>>>2= "+c);
		int z= -1;
		c= z>>>32;
		System.out.println("z>>>32= "+c);
		c= z>>>33;
		System.out.println("z>>>33= "+c);
		c= z>>>34;
		System.out.println("z>>>2= "+c);
	}
}