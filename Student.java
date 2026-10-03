class Student {
    int id;
    String name;
    int age;

    // Default constructor
    Student() {
        id = 0;
        name = "Not Given";
        age = 0;
    }
    // Parameterized constructor (2 arguments)
    Student(int i, String n) {
        id = i;
        name = n;
        age = 18; // default age
    }
    // Parameterized constructor (3 arguments)
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }
    // Display method
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {

        // Using different constructors
        Student s1 = new Student();
        Student s2 = new Student(101, "Vishnu");
        Student s3 = new Student(102, "sonu", 20);

        // Display data
        s1.display();
        s2.display();
        s3.display();
    }
}
