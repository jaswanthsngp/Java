class Demo
{
    static final double pi= 3.14;
    static final double pi2= 3.1415;
    void display()
    {
        final double pi= 3.14;
        final double pi2= 3.141;
        System.out.println(pi);
        System.out.println(pi2);
    }
}

/*
 * Uses of 'final' keyword:
 *  final variables can't be changed
 *  final methods can't be overwritten
 *  final classes can't be inherited
 */

class Main
{
    public static void main(String args[]) 
    {
        final double pi = 3.14;
        final double pi2 = 3.141;
        System.out.println(pi);
        System.out.println(pi2);
    }
}