package NestedClass;

public class StaticNestedClass {
    private int out_x = 10;
    static private int out_y = 20;
    static int out_z = 30;



    static class NestedCLass{

        void display(){

//            System.out.println(out_x); // Can't access non-static member.

              System.out.println(out_y);

              System.out.println(out_z);
        }
    }
}

class demo{
    public static void main(String[] args) {

        // Here we do not need to create the object of outer class.
       StaticNestedClass.NestedCLass nestedObj = new StaticNestedClass.NestedCLass();

       nestedObj.display();
    }
}
