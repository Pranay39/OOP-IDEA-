public class ClassEx1 {
    public static void main(String[] args) {

//        This change demonstrate github update.

//        Student Pranay = new Student();

//        Student Pranay; // Declared reference to object & it happens at compile-time.
//        Pranay = new Student();     // Allocates a student object to ref. variable Pranay. This happens at run-time.
//
//        Student Rahul = new Student(15, "rahul", 88.9f);
//        System.out.println(Rahul.rno);
//        System.out.println(Rahul.name);
//        System.out.println(Rahul.marks);
//
//
//        Student random = new Student(Pranay);  // It will call the empty constructor.
//        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.rno);
        System.out.println(random2.name);
        System.out.println(random2.marks);

        Student one = new Student();
        Student two = one;

        one.name = "ONE";
        System.out.println(two.name);
        System.out.println("Hello!");

//        Pranay.changeName("3P");
//        Pranay.greeting();

//        Pranay.rno = 39;
//        Pranay.name = "Pranay Patil";
//        Pranay.marks = 90.0f;

//        System.out.println(Pranay.rno);
//        System.out.println(Pranay.name);
//        System.out.println(Pranay.marks);

//        System.out.println(Rahul.name);

    }

     static class Student{
        int rno;
        String name;
        float marks;

        Student(Student other){
            this.name = other.name;
            this.rno = other.rno;
            marks = other.marks;
        }

        Student(){

            // this keyword is just replacing reference variable
            // As class is a template we can't use reference variable in the class.

//            this.rno = 39;       // Similar to Pranay.rno
//            this.name = "Pranay Patil";
//            this.marks = 90.0f;

            // This is how you call a constructor from another constructor.
            this(99, "Random", 33.5f);  // It is calling the constructor with parameters.
        }

        Student(int roll, String name, float marks){
            rno = roll;
            this.name = name;
            this.marks = marks;
        }

        void greeting(){
            System.out.println("Hello! My name is "+ this.name);
        }

        void changeName(String newName){
            name = newName;
        }
    }
}
