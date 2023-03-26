import java.lang.StringBuilder;

class Main{
    public static void main(String[] args) {
        StringBuilder b= new StringBuilder("abcdef");
        System.out.println(b);
        System.out.println(b.capacity());
        b.delete(4, 6);
        System.out.println(b);
        System.out.println(b.capacity());
        b.ensureCapacity(22);
        System.out.println(b.capacity());
        b.ensureCapacity(23);
        System.out.println(b.capacity());
        System.out.println(b.length());
        b.setLength(2);
        System.out.println(b.length());
        System.out.println(b);
    }
}