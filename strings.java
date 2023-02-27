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

        //ways to create a string
        String s1= new String();        //create empty, then assign something
        s1= "example1";
        System.out.println(s1);
        String s2= new String(s1);      //or pass another string to copy it
        System.out.println(s2);
        String s3= new String("example3");
        System.out.println(s3);
        char carr[]= {'1', 'a', 'A', 'x', '$', '8', '>'};
        String s4= new String(carr);    //or pass a charachter array
        System.out.println(s4);
        byte barr[]= {1, 97, 65, 89, 45, 4, 23, 32};
        String s5= new String(barr);    //or a byte array, resulting chars with thier ascii values
        System.out.println(s5);
        String s6= new String(carr, 1, 5);  //or can make a string with a part of array
        System.out.println(s6);
        String s7= new String(barr, 2, 4); //a part of byte array
        System.out.println(s7);

        //string methods
        System.out.println(s1.length());    //gives length of string
        System.out.println(s1.concat(s7));  //concats two strings and returns new one
        System.out.println(s2+s6);          //this is another way
        char c[]= s1.toCharArray();         //converts string to a charachter array 
        for(char i: c)
            System.out.print(i+" ");
        System.out.println();
        String s8= "I dont like Java";
        System.out.println(s8);
        s8= s8.replace("dont ", "");    //replaces target with replacement and returns new string
        System.out.println(s8);
        System.out.println(s8.replaceFirst("a", "@"));    //replaces the first occurance of target with replacement
        c= new char[5];
        s8.getChars( 1, 6, c, 0);   //puts the chars into the destination char array
        for(char i: c)
            System.out.print(i+" ");
        System.out.println();
        //'==' doesn't work for a string
        System.out.println(s1.equals(s2));              //equals() is an object method which checks if both the refs
        String s9= "example1";                          //  are pointing to same address
        System.out.println(s1.equals(s9));              //but in string class, it is overriden to check only values
        System.out.println(s1.contentEquals(s9));       //This is the same, IDK why they have two methods
        System.out.println(s1.compareTo(s9));           //returns -ve if s1<s9, 0 if s1==s9, +ve if s1>s9
        System.out.println(s1.compareTo(s8));
        s9= "ExaMple1";
        System.out.println(s1.equalsIgnoreCase(s9));    //This ignores case while comparing
        System.out.println(s1.compareToIgnoreCase(s9)); //Compare, ignoring case.
        s9= "example1";
        System.out.println(s9.indexOf('e'));
        System.out.println(s9.indexOf('e', 2));
        System.out.println(s9.lastIndexOf('e'));
        System.out.println(s9.lastIndexOf('e', 4));
        System.out.println(s9.indexOf("am"));
        System.out.println(s9.lastIndexOf("am"));
        System.out.println(s9.indexOf("am", 2));
        System.out.println(s9.lastIndexOf("am", 2));
        System.out.println(s9.substring(2));                //2, 3, 4,....,n
        System.out.println(s9.substring(2, 5)); //2, 3, 4
        System.out.println(s9.toUpperCase());
        System.out.println(s9.toLowerCase());
        s9= " example ";
        System.out.println(s9.trim());                  // removes spaces to the left and right of string
        s9= "example 1 is so boring";
        String[] s= s9.split(" ");              // splits everywhere there is a space
        for(String i: s)
            System.out.println(i);
        s= s9.split(" ", 3);                // split method, limited to the limit
        for(String i: s)
            System.out.println(i);
        s= s9.split(" ", -2);                      // 0/-ve limits doesn't apply, it goes on splitting
        for(String i: s)
            System.out.println(i);
        System.out.println(String.join(" ", "3", "2", "532", "dowj"));  //joins elements by putting delimiter in between
        
    }
}