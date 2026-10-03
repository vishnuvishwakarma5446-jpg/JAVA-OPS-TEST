/*
for loop
while loop
do while loop
difference
nested loop
break and continue
*/
import java.util.*;
public class Session5
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("-----Student Anaylse-----");
        System.out.print("Enter The Number Of Students: ");
        int st=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=st;i++)
        {
            System.out.println("Student "+i);
            System.out.print("Enter The Student Name: ");
            String name=sc.next();
            System.out.print("Enter The Number Of Subjects: ");
            int sub=sc.nextInt();
            int total=0;
            int fs=0;
            for(int j=1;j<=sub;j++)
            {
                System.out.println("Enter Subject "+j);
                int mks=sc.nextInt();
                if(mks<0 && mks>100)
                {
                    System.out.println("Invaild Marks,Enter Again");
                    j--;
                    continue;
                }
                if(mks==0)
                {
                    System.out.println("Student Score Zero.Stopping Subject Entry");
                    break;
                }
                total=total+mks;
                if(mks<40)
                    fs++;
            }
            double per=(double)total/sub;
            System.out.println("-----Result-----");
            System.out.println("Name: "+name);
            System.out.println("Total MArks: "+total);
            System.out.println("Percentage: "+per);
            System.out.println("Failed Subject: "+fs);
            if(per>=90 &&fs==0)
            {
                System.out.println("Grade: A+");
                System.out.println("Status: pass");
            }
            else if(per>=80 &&fs==0)
            {
                System.out.println("Grade: B+");
                System.out.println("Status: pass");
            }
            else if(per>=70 &&fs==0)
            {
                System.out.println("Grade: C+");
                System.out.println("Status: pass");
            }
            else if(per>=60 &&fs==0)
            {
                System.out.println("Grade: D+");
                System.out.println("Status: pass");
            }
            else if(per>=50 &&fs==0)
            {
                System.out.println("Grade: E+");
                System.out.println("Status: pass");
            }
            else
            {
                System.out.println("Grade: F");
                System.out.println("Status: fail");
            }
        }
        System.out.println("-----Student Attendence-----");
        System.out.print("Enter the attendance Pecentage: ");
        float attend=sc.nextFloat();
        while(attend>100 ||attend<0)
        {
            System.out.println("Invaild Attendence");
            System.out.println("Enter the attendance Pecentage: ");
            attend=sc.nextFloat();
        }
        if(attend>=75)
        {
            System.out.println("Attendence Status: Eligible");
        }
        else
        {
            System.out.println("Attendence Status: Not Eligible");
        }
        int ch;
        do
        {
            System.out.println("-----Menu-----");
            System.out.println("1.display Message");
            System.out.println("2.printing Number(1 to 5)");
            System.out.println("3.Exit");
            System.out.print("Enter the Choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Welcome to Session 5");
                    break;
                case 2:
                    for(int n=1;n<=5;n++)
                    {
                        if(n==3)
                        {
                            System.out.println("Breaking the loop");
                            continue;
                        }
                        System.out.println(n);
                    }
                    break;
                case 3:
                    System.out.println("Thanks");
                    break;
                default:
                    System.out.println("Invaild Input");
            }
        }while(ch!=3);

    }
}