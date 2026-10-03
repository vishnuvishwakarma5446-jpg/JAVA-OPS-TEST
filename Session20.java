/*
method overiding
@Overide
parent method vs child method
super.method()
runtime polymorphism
parent refercence child object
dynamic method dispatch
*/
/*
 class Animal{
     void sound(){
         System.out.println("ANIMAL MAKES SOUND ");

     }
 }

 class Dog1 extends Animal {
     @Override

     void sound(){
         super.sound();
         System.out.println("DOG BARKS ");

     }



 }

class Session20 {
    public static void main(String[] args) {
        Dog1 obj=new Dog1();
        obj .sound();


    }
}*/
/*
class payment{
    void pay(){
        System.out.println("PAYMENT");
    }
    class paytm extends payment{
        void pay(){
            System.out.println("PAYMENT THROUGS PAYTM");
        }
    }
    class cash extends payment{
        void pay(){
            System.out.println("PAYMENT WENT THROUGH CASH");

        }
    }
    class card extends payment {
        void pay() {
            System.out.println("PAYMENT WENT THROUGH CARD");

        }
    }


    class Session20{
        public static void main(String[] args) {

            p=new paytm();
            p.pay();
            p=new cash();
            p.pay();

        }
    }



}
*/

