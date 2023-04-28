import java.util.*;

class Student{
    int roll;
    String name;
    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
}

class Main{
    public static void main(String[] args) {
        ArrayList<Student> al= new ArrayList<Student>();
        al.add(new Student(3, "Charlie"));
        al.add(new Student(1, "Alice"));
        al.add(new Student(2, "Bob"));

        Comparator<Student> c= new Comparator<Student>() {
            public int compare(Student a, Student b){
                if(a.roll>b.roll)
                    return 1;
                else if(a.roll<b.roll)
                    return -1;
                return 0;
            }
        };
        Collections.sort(al, c);
        for(Student s: al){
            System.out.println(s.roll+" "+s.name);
        }
    }
}