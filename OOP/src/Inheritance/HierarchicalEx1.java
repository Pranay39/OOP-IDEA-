package Inheritance;

public class HierarchicalEx1 {
        public void print_A(){
            System.out.println("Class A");
        }
    }
class B extends HierarchicalEx1{
    public void print_B(){
        System.out.println("Class B");
    }
}

class C extends HierarchicalEx1{
    public void print_C(){
        System.out.println("Class C");
    }
}

class D extends HierarchicalEx1{
    public void print_D(){
        System.out.println("Class D");
    }
}

class TestHierarchical{
    public static void main(String[] args) {
        B objB = new B();
        objB.print_A();
        objB.print_B();

        C objC = new C();
        objC.print_A();
        objC.print_C();

        D objD = new D();
        objD.print_A();
        objD.print_D();
    }
}