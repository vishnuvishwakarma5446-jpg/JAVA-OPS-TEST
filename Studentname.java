public class Studentname {

        int roll_no;
        int id;
        String name;

        // Parameterized Constructor
        Studentname(int roll_no, int id, String name) {
            this.roll_no = roll_no;
            this.id = id;
            this.name = name;
        }

        // Method to display student details
        void display() {
            System.out.println("Roll No: " + roll_no);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("--");
        }

        // Main method
        public static void main(String[] args) {


            Studentname s1 = new Studentname(1, 101, "Vishnu");


            s1.display();

        }
    }

