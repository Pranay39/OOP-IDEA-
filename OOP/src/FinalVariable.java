public class FinalVariable {
    final int i;    // #1
    static int a = 10;
    static final  int j = a;

    {
        i = 33;


        System.out.println("i = "+i);
    }

//    final int j = 1234;   // #2
//    System.out.println("j = "+j1);

    final int k;

    FinalVariable(){
        k = 0;
        System.out.println("k = "+k);

    }


    public static void main(String[] args){
        FinalVariable V = new FinalVariable();

    }
}
