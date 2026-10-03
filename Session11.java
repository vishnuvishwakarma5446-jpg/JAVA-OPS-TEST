/*
understand the why array are needed
create an array
store multiple values in an array
take array input
display array elements
find sum,avg max,min of array elements
search an element in an array
understand enhanced for loop
understand 2D array
work with strings

*/
 import java.util.*;

public class Session11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Studentname , Course;
        System.out.println("enter Student name :   ");
        Studentname=sc.nextLine();
        System.out.println("enter the student course");
        Course=sc.nextLine();
        String Subject[]={"DM","DS","PP","DBMS","CP"};
        int[] marks=new int[5];
        System.out.println("enter the marks ");
        for(int i=0; i<5; i++){
            System.out.print(Subject[i]+" : ");
            marks[i]=sc.nextInt();

        }
        System.out.println("--------student marks report------------");
        System.out.println("Name : "+ Studentname);
        System.out.println("Name : "+ Course);
        //System.out.println("Name : "+ Subject marks );
        for(int i=0; i<5; i++){
            System.out.println(Subject[i]+" : "+ marks[i] );
        }

        //advanced for loop
        // for(int x: marks){
           //  System.out.println(x);
        // }
          int total=0;
         for(int m: marks){
             total=total+m; //m behaves like loop iteration follow in
         }
         // System.out.println("total marks : "+total);
        double per=(double)total/5.0;   // (datatype) variable
        int max=marks[0],min=marks[0];
        for(int j=0; j<=4; j++){
            if(min>marks[j]);
            min=marks[j];
            if(max<=marks[j]);
            max=marks[j];

        }
        System.out.println("highest marks : "+max);
        System.out.println("lowest marks  :  "+min);
        System.out.println("total marks   :  "+total);
        System.out.println("percentage    :  "+per);
        System.out.println("enter marks to search");
        int scr=sc.nextInt();
         boolean flag=false;

        for(int i=0; i<=4; i++){
            if(scr==marks[i]){
                System.out.println("found at "+i+"index");
                flag=true;
                break;

            }


        }
        if(!flag){
                System.out.println("not found");
        }
    }


}

