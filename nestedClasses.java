class Cricket{
    class Prizes{                               // A non Static nested class is called inner class
        static final int prize=100;             // and static nested classes are called static nested classes
        static int i= 10;
        void distributePrizes(){
            System.out.println(numberOfPlayers);
            System.out.println(score);
            //incrementScore(6);
            System.out.println(prize);
        }
    }
    static final int numberOfPlayers= 11;
    int score;
    void incrementScore(int x){
        score+=x;
        System.out.println(score);
        new Prizes().distributePrizes();
    }
    // static void incrementScore(int x){
    //     new Cricket().new Prizes().distributePrizes();
    // }
}

class Main{
    public static void main(String[] args) {
        //new Cricket().new Prizes().distributePrizes();
        Cricket c= new Cricket();
        c.incrementScore(2);
        Cricket.Prizes p= c.new Prizes();           //this should be instantiated using obj of outer class
        p.distributePrizes();
    }
}