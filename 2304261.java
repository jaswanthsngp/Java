import java.util.*;
// sort the objects on the basis of length of names in those
class Student implements Comparable<Student>{
    String name;
    Student(String name){
        this.name= name;
    }
    public int compareTo(Student s){
        if(this.name.length()>s.name.length())
            return 1;
        if(this.name.length()<s.name.length())
            return -1;
        return 0;
    }
    public String toString(){
        return this.name;
    }
}

class Main{
    public static void main(String[] args) {
        ArrayList<Student> al= new ArrayList<Student>();
        al.add(new Student("Charlie"));
        al.add(new Student("Alice"));
        al.add(new Student("Bob"));

        Collections.sort(al);
        for(Student s: al)
            System.out.println(s);
    }
}