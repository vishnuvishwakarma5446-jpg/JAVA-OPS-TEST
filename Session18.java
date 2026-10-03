/*
what is inheritance
why inheritance required
parent class/base class
child class/derived class
extends
code reusability
single inheritance
mutilevel inhertance
hierachical inhertitance
java not supports multiple inheritance
super keyword
constructer execuation



class Animal{
    void eat(){
        System.out.println("ANIMAL IS EATING");
    }
}
class dog extends Animal{
    void bark(){
        System.out.print("DOG IS BARKING");
    }
}
public class Session18  {
    public static void main(String[] args) {
        dog a1=new dog();
        a1.eat();
        a1.bark();
    }
}
class Employee{
    String name="ADITYA";

}
class Language extends Employee{
    String l="python";

}
class Session18{
    public static void main(String[] args){
        Language l1=new Language();
        System.out.println(l1.name);
        System.out.println(l1.l);


    }
}


class employ{
    void login(){
        System.out.println("EMPLOYEE LOGIN");
    }
}
class manager extends employ{
    void manage(){
        System.out.println("MANAGER MANAGED TEAM");
    }
}
class SM extends manager{
    void approve(){
        System.out.println("SENIOR MANAGER APPROVE BUDGET");
    }
}
class Session18{
    public static void main(String[] args){
        SM s1=new SM();
        s1.login();
        s1.manage();
        s1.approve();

    }
}*/
/*
class Employee{
    String roll="EMPLOYEE";

}
class developer extends Employee{
    String roll="DEVELOPER";
    void display(){
        System.out.println(super.roll);
    }
}
class Session18{
    public static void main(String[] args){
        developer d1=new developer();
        System.out.println(d1.roll);
        d1.display();
    }
}*/
