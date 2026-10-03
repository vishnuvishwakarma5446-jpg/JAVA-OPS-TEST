 /*
 what is constructor
 defoult constructor
 parametras constructor
 constructor overloading
 this keyword
 this()
 constructor execution
 constructor vcs method
 a constructor have  same name as class name
 it has not return type

  */

public class Session14 {
      int id;
      String name;
      double salary ;
      Session14(){
          id=0;
          name="not assigned";
          salary=0;
          System.out.println("DEFAULT CONSTRUCTOR EXECUTE ");
      }
      Session14(int id ,String name,double salary){
          id=101;
          name="vishnu";
          salary=50000;
      }
      void Display(){
          System.out.println("EMPLOYEE ID     : "+id);
          System.out.println("EMPLOYEE NAME   : "+name);
          System.out.println("EMPLOYEE SALARY : "+ salary);

      }
    public static void main(String[] args) {
       Session14 obj=new Session14();
       obj.Display();
       obj.name="VISHNU";
    }
}
