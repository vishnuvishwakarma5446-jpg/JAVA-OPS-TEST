/*
upcasting
parent referance child referance
what is parent referance can or cannot access
multiple child object
isntanceof  with multiple classes

 */

class payment {
    void pay(double amount){
        System.out.println("PAYMENT : "+amount);
    }
}
class upi extends payment  {
    void pay(double amount){
        System.out.println("PAYMENT : "+amount);
    }
    void scanqr(){
        System.out.println("QR CODE SCAN");
    }
}
class card extends payment {
    void pay(double amount){
        System.out.println("PAYMENT : "+amount);
    }
    void sc(){
        System.out.println("CARD SWIPPED");

    }

}
class Session21{
    public static void main(String[] args) {
        payment p;
        p=new upi();
        p.pay(560.23);

        ((upi) p).scanqr();
        p=new card();
        p.pay(254.55);
        ((card) p).sc();
    }
}

 /*
 what is abstraction ?
 abstraction class
 abstraction  method
 concrete method inside abstract class
 why abstract class cannot be instantiated
 child class implemention
 @override
 constructor in

  */





