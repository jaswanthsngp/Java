import java.util.Scanner;

class InvalidMarksException extends Exception{
    String message;
    InvalidMarksException(String message){
        super(message);             // changes message that will be inherited from Exception
        this.message= message;
    }
    String errorMessage() {
        return message;
    }
    // public String getMessage(){
    //     return message;
    // }
}

class Main{
    // throws keyword is used when we don't want to handle it here, but later
    // if it is never handled, JVM handles it, which stops the program 
    static void display() throws InterruptedException{
        for(int i=0; i<10; i++){
            System.out.print(i+" ");
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n, marks;
        try{
            System.out.println("Enter the number of subjects");
            n= sc.nextInt();
            if(n<1 || n>5)
                throw new ArithmeticException("Enter any number from 1 to 5");
            for(int i=0; i<n; i++){
                marks= sc.nextInt();  
                    if(marks<0 || marks>100)
                        throw new InvalidMarksException("Marks should be from 0 to 100");
            }
        }catch(ArithmeticException x){
            System.out.println(x.getMessage());
        }
        catch(InvalidMarksException x){
            System.out.println(x.errorMessage());       // method we delcared to display message
            System.out.println(x.getMessage());         // the default one
        }
    }
}