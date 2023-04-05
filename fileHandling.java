import java.io.*;

class Main{
    public static void main(String[] args) {
        File f= new File("file.txt");
        try{
           System.out.println("Newly Created? "+f.createNewFile());
        }catch(IOException ioe){
            System.out.println("Error Occured");
        }
        System.out.println("is File? "+ f.isFile());
        System.out.println("is Directory? "+ f.isDirectory());
        System.out.println("Hidden? "+ f.isHidden());
        System.out.println("Exists? "+ f.exists());
        System.out.println("Readable? "+ f.canRead());
        System.out.println("Writable? "+ f.canWrite());
        System.out.println("Excecutable? "+ f.canExecute());
        System.out.println("Name: "+ f.getName());
        System.out.println("Path: "+ f.getPath());
        System.out.println("Ablosolute Path: "+ f.getAbsolutePath());
        System.out.println("Parent: "+ f.getParent());
        System.out.println("lastModified: "+ f.lastModified());
        System.out.println("length: "+ f.length());
        // System.out.println("New Name"+f.renameTo(new File("another.txt")));
        // System.out.println(f.delete());

        File dir= new File("./");
        File[] files = dir.listFiles();
        for(File x: files)
            System.out.println(x.getName());
    }
}