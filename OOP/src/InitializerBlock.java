public class InitializerBlock {

//    Initializer block
{
    System.out.println("This will execute before constructors!");
}


    InitializerBlock(){
        System.out.println("Default Constructor");
    }

    InitializerBlock(int i){
        System.out.println("Parameterized Constructor");
    }



    public static void main(String[] args){
        InitializerBlock b1, b2;
        b1 = new InitializerBlock();
        b2 = new InitializerBlock(99);
    }

}
