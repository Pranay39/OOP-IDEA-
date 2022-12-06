package Inheritance;

// Multilevel Inheritance

class GrandParent {
    public void print(){
        System.out.println("GrandParent's Print()");
    }
}

class Parent extends GrandParent{
    public void print(){
        super.print();
        System.out.println("Parent's Print()");
    }
}

// Child directly can't access the grandparent properties.
class Child extends Parent{
    public void print(){
        super.print();
        System.out.println("Child's Print()");
    }
}

class TestGrandParent{
    public static void main(String[] args){
        Child C1 = new Child();
        C1.print();

    }
}