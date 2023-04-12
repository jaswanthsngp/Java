import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name\t");
        String name= sc.nextLine();
        File dir= new File(name);
        File eligible= new File(name+"/eligible.txt");
        File notEligible= new File(name+"/notEligible.txt");
        OutputStream eos= null, nos= null;
        try{
            dir.mkdir();
            eligible.createNewFile();
            notEligible.createNewFile();
            eos= new FileOutputStream(eligible, true);
            nos= new FileOutputStream(notEligible, true);
            System.out.println("Enter the size of family");
            int n= sc.nextInt();
            for(int i=0; i<n; i++){
                System.out.println("Enter the Name of the Person\t");
                sc.nextLine();
                String mName= sc.nextLine();
                System.out.println("Enter the Age of Person\t");
                int age= sc.nextInt();
                if(age>18)
                    eos.write((age+" : "+mName+"\n").getBytes());
                else
                    nos.write((age+" : "+mName+"\n").getBytes());
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
        sc.close();
    }
}