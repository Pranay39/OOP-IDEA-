package StaticEx;

public class Main1 {

    static int a = 99;          // Static variables must be declared at class level scope as it is static.
    public static void main(String[] args){
        Human obj1 = new Human(21, "Pranay");
        Human obj2 = new Human(18, "Ash");
//
        System.out.println(Human.population); // Right convention to access static var
        System.out.println(obj2.population);  // This will also work but not the right way.

//       Main1 m = new Main1();
//        m.fun();


        // Accessing without any object as it doesn't require that. It belongs to class.
//        fun1();     // Can call method without class name.
//        System.out.println(Main1.a);
//
//    }
//    static void fun1(){
//
//        // Accessing the methods using objects of the class.
//        // We can not access a non-static field inside a static block/method without referencing it i.e without object.
//        Main1 m1 = new Main1();
//        System.out.println("Inside fun1");
//        m1.fun();
//
//    }
//
//    void fun(){
//        System.out.println("Inside fun");
//        greeting();
//    }
//
//    void greeting(){
//        System.out.println("HELLO");
    }
}
