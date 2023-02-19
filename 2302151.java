class Calculator
{
    int x= 10;
    void add(int a, int b)
    {
        System.out.println(a+b);
    }

}
class ScientificCalc extends Calculator
{
    int x= 20;
    void add(int a, int b)
    {
        super.add(a, b);
    }
    void add(String a, String b)
    {
        this.add(5, 5);
        super.add(23, 4);
        System.out.println(a+b);
        System.out.println(x+" "+super.x);
    }
}

class Main
{
    public static void main(String[] args) {
        new ScientificCalc().add(5, 2);
        new ScientificCalc().add("odng", "sonld");
    }
}
