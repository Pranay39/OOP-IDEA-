package Singleton;

public class Singleton1 {

        private Singleton1(){

        }

    private static Singleton1 obj;

    public static Singleton1 getObj() {
        if(obj == null){

            obj = new Singleton1();
        }
        return obj;
    }

    }



