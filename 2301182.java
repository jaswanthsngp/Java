class Main
{
	public static void main(String args[])
	{
/*
		class X {};
		class Y extends X {};
		class Z extends Y {};
		
		X x1= new Y();
		Y y1= new Z();
		Y y2= new Y();
		System.out.println(x1 instanceof X);
		System.out.println(x1 instanceof Z);
		System.out.println(y1 instanceof Z);
		System.out.println(y2 instanceof X);
*/
		int i= 0, j= 29, k=32;
		int a= 12, b= 31, c= 53, d= 39;
		System.out.println(a+" "+b+" "+c+" "+d);
		if(i==0)
		{
			if(j<20) a=b;
			if(k>100) c= d;
			else a=c;
		}
		System.out.println(a+" "+b+" "+c+" "+d);
	}
}