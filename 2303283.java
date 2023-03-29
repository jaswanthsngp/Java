interface Bank{
    void processLoan();
}

class Main{
    public static void main(String[] args) {
        Bank a= new Bank(){
            public void processLoan(){
                System.out.println("Loan Processed");
            }
        };
        a.processLoan();
        Bank b= () -> System.out.println("Loan is getting processed");
        b.processLoan();
    }
}