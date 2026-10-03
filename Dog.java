import java.util.Scanner;

public class Dog {

    //String name;
    int hight;

public int sleep(int sleep){
    System.out.println("my dog sleep time is:  "+sleep);
 return sleep;
}
    public int sleep(int sleep,String name){
        System.out.println("my dog sleep time is:  "+sleep);
        return sleep;
    }

    public String Bark( String name,int weight){
        System.out.println("this dog is brark  "+name);
        return name;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Name Dog ");
        String name=scanner.nextLine();

        StringBuffer st=new StringBuffer("");

        Scanner scanner3=new Scanner(System.in);// input user
        System.out.println("Enter your dog weight ");// message
        int weightDog =scanner3.nextInt();//type input user
        Dog tommay =new Dog();
            tommay.Bark(name,weightDog);// call

        Dog sleepTime1=new Dog();// new object declear
        Scanner scanner1=new Scanner(System.in);// input user
        System.out.println("Enter how many your dog is sleep ");// message
        int sleepTime =scanner1.nextInt();//type input user
        sleepTime1.sleep(sleepTime);//call
    }
}
