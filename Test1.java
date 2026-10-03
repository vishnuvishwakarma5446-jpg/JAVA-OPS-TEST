 /*
 write a program fibonacci series 
  */

public class Test1 {
    public static void main(String[] args) {
        int n=10;
        int a=0,b=1;
        System.out.println("fibonacci series ");
        int i;
        for(i=1; i<= n; i++){
            System.out.println(a +" ");
            int c= a+b;
            a=b;
            b=c;
            
        }
    }
    
}

