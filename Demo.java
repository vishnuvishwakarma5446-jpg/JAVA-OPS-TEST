class Demo {
    static int x = 30;

    public static void main(String args[]) {

        Demo d1 = new Demo();
        System.out.println(Demo.x);
        Demo.x= 50;
        System.out.println(Demo.x);
        Demo.x =60;
        System.out.println(Demo.x);
        Demo.x =70;
        System.out.println(Demo.x);
    }
}


