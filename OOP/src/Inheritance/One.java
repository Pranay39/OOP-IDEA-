package Inheritance;
class One {
    public void fun1(){
        System.out.println("fun1()");
    }
}

class Two extends One{
    public void fun2(){
        System.out.println("fun2()");
    }
}

class Three extends Two{
    public void fun3(){
        System.out.println("fun3()");
    }
}

class TestOne{
    public static void main(String[] args) {
        Three obj1 = new Three();
        obj1.fun1();
        obj1.fun2();
        obj1.fun3();
    }
}