import java.util.*;
 class Session8 {
     String name ="Vishnu";
     int num=19;
     float height=150.5f;
     static int a=55;
    public static void main(String[] a)
    {
        //Scanner sc=new Scanner(System.in);
        Session8 obj=new Session8();

        obj.vishnu();
        obj.ajay();
       Session8.pardeep();
        System.out.println(obj.name);
        System.out.println(obj.num);
        System.out.println(obj.height);
        System.out.println(Session8. a);

    }
    void vishnu(){
System.out.println( "hii , vishnu " );
  //Session8 obj1=new Session8();
        System.out.println(name);
        System.out.println(num);
        System.out.println(height);
        System.out.println(Session8. a+"this is a vishnu method");
        Session8.pardeep();
       // ajay();
    }
    void ajay(){
        System.out.println(  "hello, ajay");
        System.out.println(name);
        System.out.println(num);
        System.out.println(height);
        System.out.println(Session8. a+"this is a ajay method");
        //pardeep();
        Session8.pardeep();
        //vishnu();
    }
        static void pardeep(){
        Session8 obj=new Session8();
        System.out.println("hello pardeep"); // static method which
            System.out.println(obj.name);     // called
            System.out.println(obj.num);
            System.out.println(obj.height);
            System.out.println(Session8. a+"this is a parddeep method session8 ");

                //obj. vishnu();
             //   obj. ajay();


    }

}
