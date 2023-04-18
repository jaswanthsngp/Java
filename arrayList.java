import java.util.*;

class Main{
    public static void main(String[] args) {
        ArrayList<String> colors= new ArrayList<String>();
        colors.add("Blue");
        colors.add("Green");
        colors.add(0, "Red");
        int n= colors.size();
        for (String i : colors)
            System.out.print(colors.indexOf(i)+" ");
        System.out.println();
        for(int i=0; i<n; i++)
            System.out.print(colors.get(i)+" ");
        System.out.println();
        System.out.println(colors);
        ArrayList<String> moreColors= new ArrayList<String>();
        moreColors.add("Cyan");
        moreColors.add("Magenta");
        moreColors.add("Yellow");
        moreColors.add("Black");
        moreColors.addAll(0, colors);
        for(String i: moreColors)
            System.out.print(i+" ");
        System.out.println();
        moreColors.removeAll(colors);
        for(String i: moreColors)
            System.out.print(i+" ");
        System.out.println();
        // moreColors.remove("Black");          // Removes first occurance of object
        // moreColors.retainAll(colors);        // Opposite of removeAll()
        // for(String i: moreColors)
        //     System.out.print(i+" ");
        // System.out.println();
        String arr[]={};
        arr= colors.toArray(arr);
        for(String i: arr)
            System.out.print(i+" ");
        System.out.println();
        System.out.println(arr.getClass());
        System.out.println(colors.containsAll(colors));
        System.out.println(moreColors.containsAll(colors));
        Iterator<String> it= moreColors.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");
        it.remove();
        System.out.println();
        for(String i: moreColors)
            System.out.print(i+" ");
        System.out.println();
    }
}