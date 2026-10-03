

 /*
1)A class in java contains data member(variable)and member function(methods)as property of class
2)There are two types of member in class
-static data member and member function of class can be called/used by their name directly or by classname.membername
-non static data member and member function of class can be called/used by creating object of class
 */
 import java.util.*;
 public class Session7 extends Session8
 {

     static void pardeep(){
         Session8 obj=new Session8();
         System.out.println("hello pardeep"); // static method which
         System.out.println(obj.name);     // called
         System.out.println(obj.num);
         System.out.println(obj.height);
         System.out.println(Session8. a+"this code from session 7 method ");

         //obj. vishnu();
         //   obj. ajay();


     }

     String name="vishnu";
     int age=19;
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         Session8 obj=new Session7();


         int no=35; //local variable
         int age=25;
        // obj.abc();
         //obj.xyz();
         obj.pardeep();
         System.out.println(obj.name);
         //System.out.println(obj.age);
         System.out.println(age);
     }
     void abc()
     {
         int no=45;
         System.out.println("HELLO");
         //System.out.println(name);
         System.out.println("  "+no);
         System.out.println("abc 45="+this.age);
         //this return the global variable this.variable
     }
     void xyz()
     {
         System.out.println("HELLO XYZ");
     }
 }
