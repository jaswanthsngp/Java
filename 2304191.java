import java.util.*;

class Main{
    public static void main(String[] args) {
        int i, n;
        LinkedList<Integer> l= new LinkedList<Integer>();
        l.add(3); l.add(0); l.add(2); l.add(7);
        l.add(5); l.add(10); l.add(10); l.add(0);
        n= l.size();
        for(i=0; i<n; i++)
            System.out.print(l.get(i)+" ");
        System.out.println();
        ListIterator<Integer> it= l.listIterator();
        // put 20 in front of consecutive 10s
        // while(it.hasNext()){
        //     int next, prev=-1;
        //     if(it.hasPrevious()){
        //         prev= it.previous();
        //         it.next();
        //     }
        //     next= it.next();
        //     System.out.println(next+" "+prev);
        //     if(next==10 && prev!=10){
        //         it.previous();
        //         it.set(20);
        //         it.next();
        //         it.next();
        //     }
        // }
        // n= l.size();
        // for(i=0; i<n; i++)
        //     System.out.print(l.get(i)+" ");
        // System.out.println();
        // Replace 0 with 1
        while(it.hasNext())
            if(it.next().equals(0))
                it.set(1);
        n= l.size();
        for(i=0; i<n; i++)
            System.out.print(l.get(i)+" ");
        System.out.println();
        i=0;
        // Put 20 after every 10
        it= l.listIterator();
        while(it.hasNext()){
            if(it.next().equals(10))
                l.set(i+1, 20);
            i++;
        }
        n= l.size();
        for(i=0; i<n; i++)
            System.out.print(l.get(i)+" ");
        System.out.println();
        n= l.size();
        i= n-1;
        // Put 20 before every 10
        it= l.listIterator(n);
        while(it.hasPrevious()){
            if(it.previous().equals(10))
                l.set(i-1, 20);
            i--;
        }
        n= l.size();
        for(i=0; i<n; i++)
            System.out.print(l.get(i)+" ");
        System.out.println();
    }
}