package StaticEx;

public class Human {

    int age;
    String name;
    static long population;


    public Human(int age, String name) {
        this.age = age;
        this.name = name;
//        this.population = population;

        //Right convention to access a static var is with its class name instead with 'this'.
        Human.population += 1;

    }
}