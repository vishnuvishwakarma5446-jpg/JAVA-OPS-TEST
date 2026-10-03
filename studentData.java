
import java.util.Scanner;
class StudentData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name ");
        String name = sc.nextLine();

        System.out.println("Enter Fees ");
        float fees = sc.nextFloat();

        System.out.println("Enter Salary ");
        double salary = sc.nextDouble();

        System.out.println("Enter ID  ");
        byte id = sc.nextByte();
        System.out.println("\n--- Entered Details ---");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Fees: " + fees);
        System.out.println("Salary: " + salary);
        System.out.println("ID: " + id);

        sc.close();
    }
}
