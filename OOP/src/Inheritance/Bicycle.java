package Inheritance;

// Inheritance Program No : 1

class Bicycle {

    int gears;
    int speed;
//    private int a = 100;  // Extended/Child classes can't access the private variables & methods.
    int a = 100;
    private int c = 1;

    public Bicycle(int gears, int speed){
        this.gears = gears;
        this.speed = speed;
    }

    public String toString(){
        return ("No. of gears = "+this.gears+ " Speed = "+this.speed);
    }
}

class MTB extends Bicycle{
    int a = 1000;
    int seatHeight;
    int b;

    public MTB(int gears, int speed, int seatHeight){

        super(gears, speed);
        this.seatHeight = seatHeight;
    }

    public String toString(){
         b = super.a;
        // When parent class and child class have the same method name,
        // we have to use super keyword to access parent class method to avoid ambiguity.
        return (super.toString() + " Seat height = "+this.seatHeight);

    }
}

class TestBicycle {

    public static void main(String[] args){
        MTB obj1 = new MTB(6,25, 27);

        System.out.println(obj1.toString());

        System.out.println(obj1.speed);

        System.out.println(obj1.a);
        System.out.println(obj1.b);


        //In the above program, when an object of MTB class is created,
        // a copy of all methods and fields of the superclass acquire memory in this object.
        // That is why by using the object of the subclass we can also access the members of a superclass.


    }

    }



