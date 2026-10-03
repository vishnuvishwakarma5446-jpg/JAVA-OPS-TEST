/*
what is class in java
what is object in java
class v/s object
instance variable/non static variable
instance method
creating object using new
accessing object member using .
creating multiple object
non Static method can acess static as well as non static member(variable & method) where as static method can only access static members
*/
import java.util.*;
public class Session13
{
    //instance variable
    String name="xxxxxx";
    int rollNo=55;
    double marks=86.8;
    //class variable
    static String clg="NHITM";
    //instance method
    void displayDetails()
    {
        System.out.println("Student Name: "+name);
        System.out.println("Student Roll Number: "+rollNo);
        System.out.println("Student Marks: "+marks);
        System.out.println(getResult());
    }
    //instance method
    String getResult()
    {
        if(marks>=40)
            return "pass";
        else
            return "fail";
    }
    //class method
    static void showCollege()
    {
        System.out.println("Student College Name: "+clg);
    }
}
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Session13 obj1=new Session13();
        Session13 obj2=new Session13();
        Session13 obj3=new Session13();
        //System.out.println(obj1.name+"\n"+obj1.rollNo+"\n"+obj1.marks);
        //System.out.println(obj2.name+"\n"+obj2.rollNo+"\n"+obj2.marks);
        //System.out.println(obj3.name+"\n"+obj3.rollNo+"\n"+obj3.marks);
        obj2.name="Trinad";
        obj2.rollNo=44;
        obj2.marks=90.78;
        System.out.println(obj2.name+"\n"+obj2.rollNo+"\n"+obj2.marks);
        System.out.print("Enter name: ");
        obj2.name=sc.nextLine();
        System.out.println("Enter Roll Number: ");
        obj2.rollNo=sc.nextInt();
        System.out.println("Enter Marks: ");
        obj2.marks=sc.nextDouble();
        System.out.println(obj2.name+"\n"+obj2.rollNo+"\n"+obj2.marks);
        obj1.displayDetails();
        // obj2.displayDetails();
        //obj3.displayDetails();
    }
}