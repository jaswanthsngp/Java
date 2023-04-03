import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt(), b= sc.nextInt();
        // This works perfectly
        // boolean isNotZero = true;
        // while(isNotZero){
        //     try{
        //         System.out.println(a/b);
        //         isNotZero= false;
        //     }catch(ArithmeticException e){
        //         System.out.println("Cannot divide by zero, enter another number");
        //         b= sc.nextInt();
        //     }
        // }
        // This is just to show that try-catch can be nested
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero, enter another");
            b= sc.nextInt();
            try{
                System.out.println(a/b);
            }catch(ArithmeticException e1){
                System.out.println("I am exhausted");
            }
        }
        sc.close();
    }
}