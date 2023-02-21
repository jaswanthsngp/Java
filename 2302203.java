//abstract fn can be contained only in abstract class and an abstract class can't be instantiated
abstract class Car
{
    void drive(int speed)
    {
        System.out.println("Driving a car");
    }
    abstract void fly();
}
class WagonR extends Car{
    void drive(int speed)
    {
        System.out.println("Driving a WagonR");
    }
    void fly()
    {
        System.out.println("Flying");
    }
}

class Main
{
    public static void main(String[] args) {
        WagonR w= new WagonR();
        w.drive(34);
    }
}