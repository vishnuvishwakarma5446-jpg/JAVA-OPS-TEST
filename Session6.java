/*
session 6
what is method
why methods are needed
creating a method
calling a method
parameters
return value
void
method overloading
passing value to method
*/
import java.util.Scanner;
public class Session6
{
    /*
    void method without parameter
     */
    static void showCompany()
    {
        System.out.println("---------------------------------------------");
        System.out.println("            Vishnu Technology                ");
        System.out.println("            Employee PayRoll                 ");
        System.out.println("---------------------------------------------");
    }
    /*
    void method with parameter
    */
    static void displayEmployee(String a,int b,String c)
    {
        System.out.println("--------------Employee Details-----------------");
        System.out.println("Employee ID: "+b);
        System.out.println("Employee Name: "+a);
        System.out.println("Employee Department: "+c);
    }
    /*
    method with parameter and return value
    */
    static double grossSalary(double bs)
    {
        double gs=bs+(bs*0.20)+(bs*0.10);
        return gs;
    }
    static double calculatePf(double b)
    {
        return b*0.12;
    }
    static double netSalary(double gs,double pf)
    {
        return gs-pf;
    }
    static double calculateper(double bs,double per)
    {
        return (bs*per)/100;
    }
    static double calculateBonus(double bs,int yos)
    {
        if(yos>=5)

            return 15000;

        else

            return 5000;

    }
    static void displaySalary(double bs,double allow,double gs,double pf,double bn,double ns)
    {
        System.out.println("----------Salary Details--------");
        System.out.println("Basic Salary: Rs. "+bs);
        System.out.println("Allowance: Rs. "+allow);
        System.out.println("Gross Salary: Rs. "+gs);
        System.out.println("PF Deduction: Rs. "+pf);
        System.out.println("Bonus Salary: Rs. "+bn);
        System.out.println("Net Salary: Rs. "+ns);

    }
    static String checkP(double salary)
    {
        if(salary>=50000)
        {
            return "Excellent";
        }
        else if(salary>=30000)
        {
            return "good";
        }
        else
        {
            return "Average";
        }
    }
    public static void main(String[] args)
    {
        String name;
        int id;
        String department;
        Scanner sc=new Scanner(System.in);
        //showCompany();
        System.out.print("Enter Employee Name: ");
        name=sc.nextLine();
        System.out.print("Enter Employee id: ");
        id=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Department: ");
        department=sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double bs=sc.nextDouble();
        //System.out.print("Gross Salary: "+x);
        System.out.print("Enter Allowance: ");
        double allow=sc.nextDouble();
        System.out.print("Enter Years Of Service: ");
        int yos=sc.nextInt();
        displayEmployee(name,id,department);
        double gs=grossSalary(bs);
        double pf=calculatePf(bs);
        double ns=netSalary(gs,pf);
        double fb;

        double bper=calculateper(allow, pf);
        double bexp=calculateBonus(bs, yos);
        displaySalary(bs, allow, gs, pf, bs, ns);
        System.out.println("------Performance-------");
        System.out.println("------Employee Performance-------");
        System.out.println("----------Thank You--------------------");
    }
}

