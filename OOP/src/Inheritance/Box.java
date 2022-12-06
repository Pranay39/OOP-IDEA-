package Inheritance;

public class Box {
    int l, w;
    Box(int l, int w){
        this.l = l;
        this.w = w;
    }
}
class BoxWeight extends Box{
    int weight;
    BoxWeight(int w, int l, int weight){
        super(12, 10);
        this.weight = 100;
    }
}

class TestBox{
    public static void main(String[] args) {
        // Initially below values get initialized but later the values get updated with values from super()
        // as ref variable b1 is pointing object of BoxWeight.
        Box b1 = new BoxWeight(1, 2, 3);

//
//        System.out.println(b1.l+""+ b1.w + "" + b1.weight);   // Here we can't access weight variable as it is member of BoxWeight.

        System.out.println(b1.l+" "+b1.w);          // Accessing only those members which are of Superclass-Box.

        // The opposite of above is not valid.
        // Here the object itself is of type Parent class, how we will call the constructor of the child class BoxWeight
        // as from their these members would have been initialised.
//        BoxWeight bw1 = new Box(3, 4);
    }
}