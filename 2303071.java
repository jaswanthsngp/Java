// Write a program to create a class Person such that a person can have an aadhar card.
// In Person, define a method getAadhar() such that:
// If Aadhar Card is already created then return the same object other wise create the new Aadhar Object.
// Aadhar is a class with attribute aadhar number (12 digits) and make sure that only person can have aadhar object.
// Create two Person objects and for each person call getAadhar() 2 times and display their aadhar number.
class Person{
    class Aadhaar{
        long num;
        Aadhaar(long n){
            num= n;
        }
        void display(){
            System.out.println(num);
        }
    }
    Aadhaar a;
    void createAadhaar(long n){
        a= new Aadhaar(n);
    }
    Aadhaar getAadhaar(long n){
        if(a==null)
            a= new Aadhaar(n);
        return a;
    }
}

class Main{
    public static void main(String[] args) {
        Person p= new Person();
        p.createAadhaar(1234567891234567L);
        p.getAadhaar(9983432472980187L).display();
        Person p1= new Person();
        p1.getAadhaar(9837490274589393L).display();
    }
}