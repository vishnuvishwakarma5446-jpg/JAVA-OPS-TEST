import java.sql.SQLOutput;

/*
  static properte declared using the static keyword
  belong to the class
  only 1 copy is created shared
  shared by all object
  can be accesed by using class name
  non static property
 */
public class Session10 {
    String name ;
    int age ;
    static String Clg="CSMIT";

    public static void main(String[] args) {
        Session10 obj1=new Session10();
        Session10 obj2=new Session10();

        obj1.name=("vishnu");
        obj1.age=19;
        obj2.name="pardeep";
        obj2.age=23;
        System.out.println("COLLEGE");
        System.out.println("naqme ");
        System.out.println("age ");
    }
}
