import java.io.*;

class Main{
    public static void main(String[] args){
        File file= new File("file.txt");
        OutputStream os= null;          // to the file
        InputStream is= null;           // from the file
        try{    
            os= new FileOutputStream(file, false);
            os.write("This is some text\nwritten into this file".getBytes());
            os.flush();
            is= new FileInputStream(file);
            while(true){
                int c= is.read();            // read() reads only one, returns its ASCII code or -1 if not found
                if(c==-1)
                    break;
                System.out.print((char)c);
            }
            // byte[] b= is.readAllBytes();     // readAllBytes returns a byte array
            // for(byte i: b){
            //     System.out.print((char)i);
            // }
            
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