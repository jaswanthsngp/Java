import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> s= new ArrayList<String>();
        System.out.println("Enter 7 Names");
        // sc.nextLine();
        for(int i=0; i<7; i++){
            String a= sc.nextLine();
            char c= a.charAt(0);
            if(c>='A' && c<='Z')
                s.add(a);
        }
        for(String i: s)
            System.out.println("Hi "+i);
        sc.close();
    }
}