import java.util.*;

// Student implements comparable interface to give comparing condition
class Student implements Comparable<Student>{
    int roll;
    String name;
    Student(int roll, String name){
        this.roll= roll;
        this.name= name;
    }
    public int compareTo(Student x){
        if(this.roll>x.roll)
            return 1;
        else if(this.roll<x.roll)
            return -1;
        return 0;
    }
}

class Main{
    public static void main(String[] args) {
        ArrayList<Student> al= new ArrayList<Student>();
        al.add(new Student(3, "Charlie"));
        al.add(new Student(1, "Alice"));
        al.add(new Student(2, "Bob"));

        Collections.sort(al);
        for(Student s: al){
            System.out.println(s.roll+" "+s.name);
        }
    }
}