public class ArmstrongNumber {
    public static void main(String[] args) {
        int number=153;
        int rem,resut=0;
        int copyNumber;
        copyNumber=number;
        while (copyNumber!=0){
            rem=copyNumber%10;
            resut +=Math.pow(rem,3);
            copyNumber/=10;
        }
        if (resut==number)
            System.out.println("this is my Armstrong Numbe");
            else
            System.out.println("this is not armstrong Number");

    }
}
