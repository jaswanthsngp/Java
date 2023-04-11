import java.io.*;
import java.util.Scanner;

// get Laptop Brand, Model and Warranty from user and store in a file

class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        File file= new File("./Laptop.txt");
        OutputStream os=null;
        try{
            file.createNewFile();
            os= new FileOutputStream(file, true);
            String brand, model;
            float warranty;
            System.out.println("Enter the Brand");
            brand= sc.next();
            System.out.println("Enter the Model");
            model= sc.next();
            System.out.println("Enter the Warranty in years");
            warranty= sc.nextFloat();
            os.write((brand+" "+model+" "+warranty+" years\n").getBytes());
            os.flush();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
        finally{
            try{
                os.close();
            }catch(IOException ioe){
                System.out.println(ioe.getMessage());
            }
        }
        sc.close();
    }
}