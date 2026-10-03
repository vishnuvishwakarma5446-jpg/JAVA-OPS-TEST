/*
what is encapsulation?
why direct access to variable is dangerous?
private (only accessible within the class)
getter method (display or return value of variable)
setter method (assign value to variable)
validation inside setter method
encapsulation with constructor
*/

import java.util.*;

class Session15 {
    int emp_id,wd,pd;
    double bs;
    String en;
    Session15(int emp_id,String en,double bs,int wd,int pd)
    {
        this.emp_id=emp_id;
        if(en!=null && !en.trim().isEmpty())
            this.en=en;
        else
            this.en="Unknown";
        if(bs>0)
        {
            bs=(bs/wd)*pd;
            this.bs=bs;
        }
        else
            this.bs=0;
        if(wd>0)
            this.wd=wd;
        else
            this.wd=0;
        if(wd>=pd && pd>0)
            this.pd=pd;
        else
            this.pd=0;
    }
    int getEmployeeId()
    {
        return emp_id;
    }
    String getEmployeeName()
    {
        return en;
    }
    double basicSalary()
    {
        return bs;
    }
    int working_Days()
    {
        return wd;
    }
    int present_Days()
    {
        return pd;
    }
    double gpa()
    {
        if(wd==0)
            return 0;
        else
            return (pd*100.0)/wd;
    }
    double getHra()
    {
        return bs*0.20;
    }
    double da()
    {
        return bs*0.10;
    }
    double gs()
    {

        return bs+getHra()+da();
    }
    double pf()
    {
        return bs*0.12;
    }
    double netSalary()
    {
        return gs()-pf();
    }
    void display()
    {
        System.out.println("--------Employee Payslip---------");
        System.out.println("  Employee ID: "+emp_id);
        System.out.println("  Employee Name: "+en);
        System.out.println("----------------------------------");
        System.out.println("Basic Salary :Rs."+bs);
        System.out.println("Hra :Rs."+getHra());
        System.out.println("Da :Rs."+da());
        System.out.println("----------------------------------");
        System.out.println("Gross Salary :Rs."+gs());
        System.out.println("Pf :Rs."+pf());
        System.out.println("Net Salary :Rs."+netSalary());
        System.out.println("----------------------------------");
        System.out.println("Working Days: "+working_Days());
        System.out.println("Present Days: "+present_Days());
        System.out.println("Attendence: "+gpa());
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee ID:");
        int emp_id=sc.nextInt();
        System.out.print("Enter Employee Name:");
        String en=sc.next();
        System.out.print("Enter Basic Salary:");
        double bs=sc.nextDouble();
        System.out.print("Enter Working Days:");
        int wd=sc.nextInt();
        System.out.print("Enter Present Days:");
        int pd=sc.nextInt();
        Session15 s=new Session15(emp_id,en,bs,wd,pd);

        s.display();
    }

}



