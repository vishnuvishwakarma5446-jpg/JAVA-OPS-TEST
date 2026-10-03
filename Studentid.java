class Studentid {
    int id;
    String name;
    int age;

    Studentid() {
        id = 0;
        name = "n";
        age = 0;
    }

    Studentid(int i, String n) {
        id = i;
        name = n;
        age = 18;
    }

    Studentid(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("----------------------");
    }
        public static void main (String[]args){


            Student s1 = new Student();

            Student s2 = new Student(101, "vishnu");

            Student s3 = new Student(102, "deepak", 20);

            // Displaying details
            s1.display();
            s2.display();
            s3.display();
        }

}