abstract class Student{
    void calMarks(){
        class Subjects{
            int x;
            static int i=0;
            Subjects(){
                x= 0;
            }
            
        }
    }
    int m;
    // {
    //     {
    //         m= 10;
    //         System.out.println(m);
    //     }
    // }
}

class Main{
    public static void main(String[] args) {
        Student s= new Student(){
            {
                m= 10;
                System.out.println(m);
                dome();
            }
            void dome(){
                System.out.println("boom");
            }
        };
        // s.dome();
    }
}