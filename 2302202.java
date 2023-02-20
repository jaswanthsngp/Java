class Car
{
    void drive(int speed)
    {
        System.out.println("Driving a car");
    }
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
        Car c= new Car();
        c.drive(23);
        WagonR w= new WagonR();
        w.drive(34);
        Car cc= new WagonR();       //A parent ref can refer to child object
        cc.drive(29);           //and the overriden fns can be called from child, and all the fns from parent
        //cc.fly();                     //fly() can't be called bcz it is not overriden
        //WagonR ww= new Car();       //But a child ref can't refer to parent object
        //ww.drive(24);
    }
}