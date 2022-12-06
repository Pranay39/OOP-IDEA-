package Singleton;

//import static Singleton.SingletonEx2.getInstanceOf;

public class SingletonEx2 {

    private SingletonEx2(){

    }

    static private SingletonEx2 instance;

    public static SingletonEx2 getInstanceOf(){
        if(instance == null){
          instance = new SingletonEx2();
        }
        return instance;
    }
}

class test{
    public static void main(String[] args){
//        SingletonEx2 obj = new SingletonEx2();  // Can't create the new object as SingletonEx2() constructor is declared private above.
        SingletonEx2 obj1 = SingletonEx2.getInstanceOf();

        SingletonEx2 obj2 = SingletonEx2.getInstanceOf();

        SingletonEx2 obj3 = SingletonEx2.getInstanceOf();

        System.out.println(obj1 + " \n "+obj2+" \n "+obj3);
    }
}
