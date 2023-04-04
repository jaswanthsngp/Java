class Main{
    public static void main(String[] args) {
        try{
            System.out.println("Trying to divide by zero");
            System.out.println(1/0);
        }
        catch(ArithmeticException ae){
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("Tried to divide by zero");
        }
    }
}