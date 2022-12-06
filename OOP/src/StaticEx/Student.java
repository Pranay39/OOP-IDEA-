package StaticEx;

public class Student {
    String name;
    int rollno;
    static String clg_name;

    static int counter = 0;

    public Student(String name){
        this.name = name;
        this.rollno = set_roll();
        Student.clg_name = set_clg();
    }

    static int set_roll(){
        counter += 1;
        return counter;
    }

    static String set_clg(){
        clg_name = "A.B.C";
        return clg_name;
    }

    void getStudInfo(){
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(clg_name);
    }

    public static void main(String[] args){
        Student s1 = new Student("Pranay");
        s1.getStudInfo();

        Student s2 = new Student("Vaibhav");
        s2.getStudInfo();
    }
}
