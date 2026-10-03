/*class Employee
{
    void login()
    {
        System.out.println("Employee login");
    }
}
class Manager extends Employee
{
    void manage()
    {
        System.out.println("Manager manage team");
    }
}
class SeniorMan extends Manager
{
   void approve()
   {
    System.out.println("Senior Manager Approval Budget");
   }
}
class Session18
{
    public static void main(String[] args) {
        SeniorMan obj=new SeniorMan();
        obj.login();
        obj.manage();
        obj.approve();
    }
}*/
/*class Employee {
    String role = "Employee";
}

class Developer extends Employee {
    String role = "Developer";

    void display() {
        System.out.println(role);
        System.out.println(super.role);
    }
}

public class Session18 {
    public static void main(String[] args) {
        Developer obj = new Developer();

        System.out.println(obj.role);
        obj.display();
    }
}*/
/*class Employee
{
    Employee()
    {
        System.out.println("I am in parent class");
    }
}
class Manager extends Employee
{
    Manager(int a)
    {
        System.out.println("I am in child class");
    }
}
class Session18
{
    public static void main(String args[])
    {
        Manager obj=new Manager(10);

    }
}
    */
class User
{
    String name,mobile;
    User(String name,String mobile)
    {
        this.name=name;
        this.mobile=mobile;
    }
    void login()
    {
        System.out.println(name+" Logged In");
    }
    void displayUser()
    {
        System.out.println("Name:"+name);
        System.out.println("Mobile:"+mobile);
    }
}
class Delivery extends User
{
    String city;
    public Delivery(String name,String mobile,String city)
    {
        super(name,mobile);//calling parent constructor
        this.city=city;
    }
    void displayLocation()
    {
        System.out.println("City:"+city);
    }
}
class Customer extends Delivery
{
    String address;
    public Customer(String name,String mobile,String city,String address)
    {
        super(name,mobile,city);
        this.address=address;
    }
    void placeOrder()
    {
        System.out.println(name+" Placed a food order");
    }
    void displayCustomer()
    {
        displayUser();
        displayLocation();
        System.out.println("Address:"+address);
    }
}
class DeliveryAgent extends Delivery
{
    String vehicleNo;
    public DeliveryAgent(String name,String mobile,String city,String vehicleNo)
    {
        super(name,mobile,city);
        this.vehicleNo=vehicleNo;
    }
    void deliverOrder()
    {
        System.out.println(name+" Is Delivering the order");
    }
    void displayAgent()
    {
        displayUser();
        displayLocation();
        System.out.println("Vehicle No:"+vehicleNo);
    }
}
class SeniorAgent extends DeliveryAgent
{
    int exp;
    SeniorAgent(String name,String mobile,String city,String vehicleNo,int exp)
    {
        super(name,mobile,city,vehicleNo);
        this.exp=exp;
    }
    void trainnewagent()
    {
        System.out.println(name+" Is training new Delivery Agent");
    }
}
class Session19c
{
    public static void main(String args[])
    {
        System.out.println("\n-----------------Customer----------------\n");
        Customer c=new Customer("Trinad","9876543210","Navi Mumbai","Sanpada");
        c.login();
        c.displayCustomer();
        c.placeOrder();
        System.out.println("\n-----------------Delivery Agent----------------\n");
        DeliveryAgent d=new DeliveryAgent("Ramesh","9876543210","Mumbai","9856");
        d.login();
        d.displayAgent();
        d.deliverOrder();
        System.out.println("\n-----------------Senior Delivery Agent----------------\n");
        SeniorAgent s=new SeniorAgent("Suresh","9876543210","Navi Mumbai","1234",5);
        s.login();
        s.displayAgent();
        s.trainnewagent();
    }

}