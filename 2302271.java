import java.lang.String;

class Main{
    public static void main(String[] args) {
        /*
        System.out.println("He".compareTo("Hi"));   // e-i= -4
        System.out.println("Hi".compareTo("Hey"));  // i-e= 4
        System.out.println("Hey".compareTo("Hi"));  // e-i= 4
        System.out.println("He".compareTo("Hell")); // 2 chars extra in 'Hell' 
        System.out.println("Hell".compareTo("He")); // 2 chars less in 'He'
        
        //display second occurance of 'a' in "Java Language"
        String s= "Java Language";
        int x= s.indexOf('a');
        System.out.println(s.indexOf('a', x+1));
        */
        //change "I am writing the test" to "I was writing the test"
        System.out.println("I am writing the test".replace("am", "was"));
        System.out.println("I am learning programming".replaceFirst("am", "was"));
    }
}