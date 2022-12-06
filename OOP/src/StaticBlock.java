// This is the demo of static variable initialization.

public class StaticBlock {

    static int a = 5;
    static int b;
    int c;

//    b = 1;  // Can't initialize static varible like this
    void fun(){
     b = 2;
     System.out.println("b = "+b);
    }
    // Static block will execute only once when the class is loaded and will initialize the static variable.
    // It will execute even before main method.
    static{
        System.out.println("Inside static block");
//        b = 44;
//        a = 99;
    }


    // The first thing JVM searches is main method without this the program will not execute.

    public static void main(String[] args){


      StaticBlock obj1 = new StaticBlock();
        System.out.println(b);
        System.out.println(a);

//        StaticBlock obj2 = new StaticBlock();
        obj1.fun();
        System.out.println("b = "+b);

        b += 3;
        System.out.println(b);

        b = 99;

    }
}
