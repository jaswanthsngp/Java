import java.util.*;

class Main{
    public static void main(String[] args) {
        ArrayList<Integer> num= new ArrayList<Integer>();
        for(int i=0; i<10; i++)
            num.add(i);
        Iterator<Integer> it= num.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");
    }
}