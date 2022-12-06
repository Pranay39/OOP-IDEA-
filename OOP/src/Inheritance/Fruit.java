package Inheritance;

// Program to demonstrate parent class & child class refers to same object.

public class Fruit {

    Fruit(){
        System.out.println("Super class constructor invoked");

        System.out.println("Super class object hashcode = "+this.hashCode());

        System.out.println(this.getClass().getName());
    }
}

class Apple extends Fruit{

    Apple(){
        System.out.println("Sub class constructor invoked");

        System.out.println("Sub class object hashcode = "+this.hashCode()+" Super class hashcode = "+super.hashCode());

        System.out.println(this.getClass().getName()+" "+ super.getClass().getName());
    }
}

class TestFruit{
    public static void main(String[] args) {
        Apple obj1 = new Apple();
    }
}