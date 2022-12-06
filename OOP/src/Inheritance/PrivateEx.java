package Inheritance;

class PrivateEx {
    private int a;
    int b;

    public void get_a(){
        a = 12;
        b = a;
    }
}

class test extends PrivateEx{
    void test1(){
//        System.out.println(a);
        System.out.println(b);
    }
}

class TestPrivateEx{
    public static void main(String[] args) {
        test t1 = new test();
//        t1.get_a();
        t1.test1();
    }
}
