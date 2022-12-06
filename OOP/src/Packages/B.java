package Packages;

public class B {
    String name;

    public B(String name){
        this.name = name;
    }


    // Overriding the toString()
//    @Override
    public String toString(){
        return name;
    }


    public static void main(String[] args) {
        A obj = new A();
        obj.getNum();

//        obj.a;    // You can't just access a variable of another class like 'obj.a'
                    // You need to store it somewhere.

        int b = obj.a;
        System.out.println("b = "+b);

        obj.a = 9;
        obj.getNum();

        // This will print the hash value(default) of the object as our object or class does not have their own .toString() method.
        // Internally println() calls String.valueOf() & then it calls .toString()
        System.out.println(obj);


        // In this case it will not print the default hash value.
        B obj1 = new B("Pranay");
        System.out.println(obj1);



    }
}
