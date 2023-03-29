abstract class Bank{
    String bankName= "";
    class Loan{
        double interest= 0;
        Loan(double i){
            interest= i;
        }
        void displayInterest(){
            System.out.print(interest+" ");
        }
        void displayInterestAndBank(){
            System.out.print(bankName+" "); // Properties of outer class can be accessed iff inner is non-static
            System.out.println(interest);
        }
    }
    Bank(String name){
        bankName= name;
    }
    void displayName(){
        System.out.print(bankName+" ");
    }
    // create anonymous calss, then define this in that
    abstract void processLoan();
}

class Main{
    public static void main(String[] args) {
        // 1 bank, 3 loans

        Bank sbi= new Bank("State Bank of India"){
            void processLoan(){
                System.out.println("Processing Loan");
                System.out.println("Loan is processed");
            }
        };
        Bank.Loan sbi1= sbi.new Loan(5);
        Bank.Loan sbi2= sbi.new Loan(7.4);
        Bank.Loan sbi3= sbi.new Loan(2.3);
        sbi.displayName();
        sbi1.displayInterest();
        sbi2.displayInterest();
        sbi3.displayInterest();
        System.out.println();
        sbi.processLoan();

        // 3 banks, 3 loans

        // Bank b1= new Bank("ICICI");
        // Bank.Loan l1= b1.new Loan(10.6);
        // Bank b2= new Bank("HDFC");
        // Bank.Loan l2= b2.new Loan(8.3);
        // Bank b3= new Bank("CANARA");
        // Bank.Loan l3= b3.new Loan(8.1);
        // l1.displayInterestAndBank();
        // l2.displayInterestAndBank();
        // l3.displayInterestAndBank();
    }
}