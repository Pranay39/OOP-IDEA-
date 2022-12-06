package NestedClass;

public class InnerClassEx {       // Outer Class
    private int out_x = 10;
    static private int out_y = 20;
    static int out_z = 30;


//    {System.out.println(z);}      // Can't access inner class members in outer class.


    class InnerClass{
        // static int a = 10;    // Can't declare static variables inside the nested inner class.
        int z = 99;
        void display(){
            System.out.println(out_x);

            System.out.println(out_y);

            System.out.println(out_z);
        }
    }
}

class demo1{
    public static void main(String[] args) {
        InnerClassEx outer_obj = new InnerClassEx();        // First created obj of outer class.

        // Then with using outer class obj created inner class obj with which accessed nested inner class members.
        InnerClassEx.InnerClass inner_obj = outer_obj.new InnerClass();

        inner_obj.display();

        System.out.println(inner_obj);

    }
}
