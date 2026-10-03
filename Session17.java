
   class x {
    static int  a=25;
     int b=85;
    int c;
    static void add(){
        System.out.println("STATIC METHOD ");

    }
    void sub(){
        System.out.println("NONSTATIC METHOD ");
    }
}

public class Session17 extends x {
int p=35;
float q=99f;
void sub(){
    System.out.println("IN CHILD CLASS ");
}

    public static void main(String[] args) {
        x obj1=new x();
        x obj2=new x();
        x obj3=new x();
        Session17 obj7=new Session17();
        System.out.println(obj7.c);
        
    }

}
