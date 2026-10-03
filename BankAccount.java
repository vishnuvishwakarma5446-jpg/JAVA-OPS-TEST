class BankAccount1{
    static String BankName="AXIS BANK ";
    static double IR=6.5;
    String Ah;
    int Ano;
    double bal;

    void deposit(double amt){
        bal=bal+amt;
        System.out.println("Rs. "+amt+" DEPOSITED ");
    }
    void Withdraw(double amt){
        if(amt<=0)
            System.out.println("AMOUNT SHOULD BE GREATER 0");
        else if(amt<bal){
            bal=bal-amt;
            System.out.println("Rs. "+amt+" WITHDRAWN");
        }
        else
            System.out.println("INSUFFICIENT BALANCE");
    }
    void DisplayAccount(){
        System.out.println("------------------------");
        System.out.println("BANK NAME      : "+BankName);
        System.out.println("INTEREST RATE  : "+IR);
        System.out.println("ACCOUNT HOLDER : "+Ah);
        System.out.println("ACCOUNT NUMBER : "+Ano);
        System.out.println("BALANCE        : Rs. "+bal);
    }
}
class BankApplication{
    public static void main(String[] args) {
        BankAccount1[] acc = new BankAccount1[2];
        acc[0]=new BankAccount1();
        acc[1]=new BankAccount1();
        BankAccount1 acc1=new BankAccount1();
        BankAccount1 acc2=new BankAccount1();
        acc[0].Ah="Vishnu";
        acc[0].Ano=885563;
        acc[0].bal=50000;
        acc[1].Ah="Deepak";
        acc[1].Ano=885563;
        acc[1].bal=60000;
        acc[0].DisplayAccount();
        acc[1].DisplayAccount();
        acc[0].deposit( 5000);





    }
}



