import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name= sc.nextLine();
        System.out.println("Hi "+name.split(" ")[0]);
        int i= name.indexOf(" ");
        try{
            System.out.println(name.substring(0, i));
        }
        catch(StringIndexOutOfBoundsException sioobe){
            System.out.println("Please enter in the format Firstname Lastname");
        }
        sc.close();
    }
}