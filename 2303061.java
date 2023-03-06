// class Developer extends Thread{
//     public void run(){
//         for(int i=0; i<10; i++)
//             System.out.print(i+" ");
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         new Developer().start();
//         new Developer().start();
//     }
// }

// class Developer implements Runnable{
//     public void run(){
//         for(int i=0; i<10; i++)
//             System.out.print(i+" ");
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         Developer d= new Developer();
//         Developer s= new Developer();
//         d.run();
//         s.run();
//         System.out.println();
//         new Thread(d).start();
//         new Thread(s).start();
//     }
// }

class Main{
    public static void main(String[] args) {
        Runnable r1= () -> {
            for(int i=0; i<10; i++)
                System.out.print(i+" ");
        };
        Runnable r2= () -> {
            for(int i=90; i<100; i++)
                System.out.print(i+" ");
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}