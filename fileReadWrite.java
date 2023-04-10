import java.io.OutputStream;

import java.io.*;

class Main{
    public static void main(String[] args){
        File file= new File("file.txt");
        OutputStream os= null;
        try{    
            os= new FileOutputStream(file, false);
            os.write("Hi".getBytes());
        }catch(FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }finally{
            try{
                os.close();
            }catch(IOException ioe){
                System.out.println(ioe.getMessage());
            }
        }
    }
}