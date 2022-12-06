package Constructor;

public class CopyConstructor {

    int a;
    int b;

    CopyConstructor(int a, int b){
        this.a = a;
        this.b = b;
    }

    // Copy Constructor
    CopyConstructor(CopyConstructor C){
        this.a = C.a;
        this.b = C.b;
    }

//    public String toString(){
//        return "("+a+", "+b+")";
//    }
}
// class Child extends CopyConstructor{
//    int x;
//
    // Here we can pass the child obj to parent constructor as parent will take it as its own type of obj
    //that's why we can only access members of parent even if we passed the child's object
    // Parent class has no idea about below it & that is also reason for initializing parent first in child via super.
//    Child(Child D){
//        super(D);
//        x = D.x;
//    }
// }

 class TestCopyConstructor{
    public static void main(String[] args){
       CopyConstructor c1 = new CopyConstructor(10, 15);
       CopyConstructor c2 = new CopyConstructor(c1);            // Invoking copy constructor by passing parameter of type object
       System.out.println(c2);  // Here though the members gets copied from one object to the other
        // but the ref variable will point to 2 different objects.

        System.out.println(c1);

       CopyConstructor c3 = c1; // Here these 2 ref variable points the same object.
       System.out.println(c3);
    }
 }