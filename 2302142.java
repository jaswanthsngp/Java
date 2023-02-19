class Parent
{
    Parent()
    {
        System.out.println("Parent constructor");
    }
}
class Child extends Parent
{
    Child()
    {
        System.out.println("Child Constructor");
    }
    Child(int a)
    {
        this();
        System.out.println(a);
    }
}

class Main
{
    public static void main(String[] args) {
        Child ch= new Child(5);
    }
}