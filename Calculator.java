
        import java.util.Scanner;

        public class Calculator {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                char choice;

                do {
                    System.out.println("\n--- Simple Calculator ---");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.println("5. Modulo");
                    System.out.print("Enter your choice (5-1): ");
                    int ch = sc.nextInt();

                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();

                    switch (ch) {
                        case 1:
                            System.out.println("Result = " + (a + b));
                            break;

                        case 2:
                            System.out.println("Result = " + (a - b));
                            break;

                        case 3:
                            System.out.println("Result = " + (a * b));
                            break;

                        case 4:
                            if (b != 0)
                                System.out.println("Result = " + (a / b));
                            else
                                System.out.println("Cannot divide by zero");
                            break;

                       case 5:
                            if (b != 0)
                                System.out.println("Result = " + (a % b));
                            else
                                System.out.println("Cannot modulo by zero");
                           // break;

                        default:
                            System.out.println("Invalid Choice!");
                    }

                    System.out.print("\nDo you want to continue? (y/n): ");
                    choice = sc.next().charAt(0);

                } while (choice == 'y' || choice == 'Y');

                System.out.println("Calculator Closed.");

            }
        }


