

// Outside classes can not be static.
public class InnerClasses {

    static class test{                 // Without static this class will not be able to
                                    // create its objects as it itself depends on object of outer class.
        String name;

        public test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args){

        // Though static members does not need objects of a class.
        // They can have references of each other.
        test t1 = new test("Pranay");
        test t2 = new test("Ash");

        System.out.println(t1.name);
        System.out.println(t2.name);
    }

}
