class Main{
    public static void main(String[] args) {
        try{
            int a= Integer.parseInt(args[0]);
            int b= Integer.parseInt(args[1]);
            for(int i=a+1; i<b; i++){
                System.out.print(i+" ");
            }
            if(a==b || a==b+1){
                System.out.println("There are no numbers in between those");
            }else if(a>b){
                System.out.println("first number should be less than the second");
            }
        }
        catch(ArrayIndexOutOfBoundsException|NumberFormatException obj){
           if(obj instanceof ArrayIndexOutOfBoundsException){
                System.out.println("Enter 2 integers");
           }else if(obj instanceof NumberFormatException){
                System.out.println("We have excpected some integers");
           }
        }
        // catch(ArrayIndexOutOfBoundsException aioobe){
        //     System.out.println(aioobe.getMessage());
        //     System.out.println(aioobe.getCause());
        // }
        // catch(NumberFormatException nfe){
        //     System.out.println(nfe.getMessage());
        //     System.out.println(nfe.getCause());
        // }
        catch(Exception ex){
            System.out.println(ex+" arised");
        }
        // System.out.println("Hello world".substring(4, 1));
    }
}