class Area
{
    void area(int a)
    {
        System.out.println("area of square is "+a*a);
    }
    void area(int a, int b)
    {
        System.out.println("area of rectangle is "+a*b);
    }
}

class Main
{
    public static void main(String[] args) {
        new Area().area(5);
        new Area().area(5, 6);
    }
}
