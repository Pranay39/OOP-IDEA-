package Inheritance;

public class SuperEX1 {
    int b = 1;
    int c = 102;
     int d = 99;
    private int x = 1;
    SuperEX1() {
        System.out.println("Super class constructor invoked");
    }

    SuperEX1(int x){}

    void fun(){
        System.out.println("Inside fun()");
    }
}

class child extends SuperEX1{
    int b = 9;


    child(){

        // If child class does not explicitly call the constructor of super class,
        // Java will automatically call a no-argument(default) constructor of super/parent class.
        super(3);    // Call to super must be first statement
//       System.out.println(x);
//        c = 101;
        System.out.println("Child class constructor invoked");
        System.out.println(b);
        System.out.println("C = "+c);
        fun();  // Methods of parent which don't have same names as child methods can call directly without super keyword.
    }


}

class TestSuperEx{
    public static void main(String[] args){
        child obj1 = new child();
        System.out.println(obj1.b);
        System.out.println();


        SuperEX1 se = new SuperEX1();
       System.out.println("d = "+se.d);

    }
}