class Main
{
	public static void main(String args[])
	{
		byte b= 127; //range of byte= -128 to 127
		System.out.println(b);
		b++;	//it will go to -128 due to cyclic rotation
		System.out.println(b);
		byte b1= (byte)128; //it will take only after typecasting as it is already out of range
		System.out.println(b1);
		byte a= 20;
		byte c= 2;
		byte r= (byte)(a*c); //multiplications result only int, so typecasting is necessary
		System.out.println(r);
		short s= 10*10; //Not needed in case of direct assignment
		System.out.println(s);
		short s1= 102; // 16 bit int
		System.out.println(s1);
		long l1= 20;
		long l2= 23;
		long l3= l1*l2; //typecasting is not needed for datatypes greater than int
		System.out.println(l3);
		float f1= 10.1f; //an f behind number is mandatory for float, else it will be termed as double
		System.out.println(f1);
		double d1= 10.5;
		System.out.println(d1);
		char c1= 65;
		char c2= 'A';
		System.out.println(c1+" "+c2);
		c2++;
		System.out.println(c1+" "+c2);
		float f4= 5.123456789f; //float saves precisely till 6 decimal spaces
		System.out.println(f4);
		long l4= 12345678912L; //an L is compulsory after the long number if it exceeds 10 digits
		System.out.println(l4);
	}
}