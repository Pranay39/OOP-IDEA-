package ObjectAsReturnType;

public class Test1 {
    int  a;

    Test1(int i){
        this.a = i;
    }

    Test1 inc(){
        Test1 t1 = new Test1(a + 100);
        return t1;
    }

    public static void main(String[] args) {
        Test1 obj1 = new Test1(2);
        Test1 obj2;
        obj2 = obj1.inc();

        System.out.println(obj1.a);
        System.out.println(obj2.a);
    }
}

