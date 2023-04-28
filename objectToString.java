class Student{
    int roll;
    String name;
    Student(int roll, String name){
        this.roll= roll;
        this.name= name;
    }
    public String toString(){
        return this.roll+" "+this.name;
    }
}

class Main{
    public static void main(String[] args) {
        Student s= new Student(1, "Someone");
        System.out.println(s);
    }
}