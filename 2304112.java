import java.io.*;

// Program to read from second line of file

class Main{
    public static void main(String[] args){
        InputStream is= null;
        try{    
            is= new FileInputStream("file.txt");
            while(is.read()!=(int)'\n');
            while(true){
                int c= is.read();
                if(c==-1)
                    break;
                System.out.print((char)c);
            }
        }catch(FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }finally{
            try{
                is.close();
            }catch(IOException ioe){
                System.out.println(ioe.getMessage());
            }
        }
    }
}