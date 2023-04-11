import java.io.*;

// Program to copy contents of file to another file

class Main{
    public static void main(String[] args){
        OutputStream os= null;
        InputStream is= null;
        try{    
            os= new FileOutputStream("anotherFile.txt", true);
            is= new FileInputStream("file.txt");
            byte[] b= is.readAllBytes();
            os.write(b);
            os.flush();
        }catch(FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }finally{
            try{
                os.close();
                is.close();
            }catch(IOException ioe){
                System.out.println(ioe.getMessage());
            }
        }
    }
}