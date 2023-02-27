import java.lang.String;            //Immutable
//import java.lang.StringBuffer;    //Mutable, synchronized
//import java.lang.StringBuilder;   //Mutable, non-synchronized
//These are the classes we use in String Handling
class Main{
    public static void main(String[] args) {
        String uni= "lpu";
        // 'uni'  is a ref variable to string object 'lpu'.
        uni= "Lovely Professional University";
        // uni can be re-assigned to a new string, but 'lpu' can't be altered  
        System.out.println(uni);
