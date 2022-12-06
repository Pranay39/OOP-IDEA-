package ObjectAsReturnType;

public class Test {
    int x;

    Test(int x){
        this.x = x;
    }

    Test updateObject(){
        Test temp = new Test(x + 15);
        return temp;
    }
}

class demo{
    public static void main(String[] args) {
        Test t1 = new Test(10);
        System.out.println("Before updating object x = "+t1.x);

        t1 = t1.updateObject();
        System.out.println("After updating object x = "+t1.x);


        Test t2 = new Test(100);

        // We can't do this because updateObject will return/give obj of type Test class.
        // And here we are trying to store Test type into integer variable.
//        int a = t2.updateObject();
    }
}