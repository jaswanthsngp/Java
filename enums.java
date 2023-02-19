enum Laptops{
	MACBOOK(2500), XPS(2000), HP(1500), SURFACE(1800), THINKPAD(1900), MACBOOKPRO(2500, 2);
	int p;
	Laptops(int price)
	{
		p= price;
	}
	Laptops(int price, int mul)
	{
		p= price*mul;
	}
	int displayPrice(){
		return p;
	}
}

class Main
{
	public enum Season {SUMMER, WINTER, SPRING}
	public static void main(String args[])
	{
		for(Season i: Season.values())
			System.out.print(i+" ");
		System.out.println();
		Laptops lap= Laptops.HP;
		System.out.println(lap.ordinal());
		for(Laptops l: Laptops.values())
			System.out.println(l+" : "+l.displayPrice());
	}
}