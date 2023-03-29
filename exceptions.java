import java.util.FormatterClosedException;

class Main{
    public static void main(String[] args) {
        int p, z, n, size;
        p=z=n=0;
        try{
            size= Integer.parseInt(args[0]);
            for(int i=1; i<=size; i++){
                int a= Integer.parseInt(args[i]);
                if(a>0) p++;
                else if(a==0) z++;
                else n++;
            }
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Lesser number of elements entered");
        }
        catch(NumberFormatException f){
            System.out.println("Invalid type of number entered");
        }
        finally{
            System.out.print(p+" Positives, ");
            System.out.print(z+" Zeroes and ");
            System.out.print(n+" Negatives");
        }
    }
}