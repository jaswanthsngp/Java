@FunctionalInterface interface MacBook {                //Functional interfaces allow only 1 abstract fn
    static void work(){
        System.out.println("Working inside MacBook");
    }
    void play(int a, int b);
}

abstract interface HPP{
    static void work(){
        System.out.println("Working inside HP");
    }
    default void work(int a){
        System.out.println("Working inside HP"+ a);
    }
    void done();
}

interface HPC extends HPP{
    default void done(){
        System.out.println("Done");
    }
}

/*class Laptop implements MacBook, HPC {
    public void work(){
        System.out.println("Working inside Laptop");
    }
    public void play(){
        System.out.println("Mac Book Playing");
    }
}*/

class Main{
    public static void main(String[] args) {
        MacBook obj= (a, b) -> System.out.println("Playing with Mac");  //Lambda
        obj.play(10, 20);
    }
}