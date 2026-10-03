
    import java.util.Scanner;

    public class Grade {
        public static void main(String[] args) {
            Scanner nlv = new Scanner(System.in);

            System.out.print("Enter percentage: ");
            int percentage = nlv.nextInt();

            if (percentage >= 91) {
                System.out.println("Grade: A");
            } else if (percentage >= 81) {
                System.out.println("Grade: B");
            } else if (percentage >= 71) {
                System.out.println("Grade: C");
            } else if (percentage >= 61) {
                System.out.println("Grade: D");
            } else if (percentage >= 51) {
                System.out.println("Grade: E");
            } else {
                System.out.println("Grade: F");
            }


        }
    }


