package Packages;

import static java.lang.System.*;

public class StaticImport {

    public static void main(String[] args) {
        out.println("No need to specify class");
        // System is a class.
        // 'out' is a object of PrintStream class.
        // 'println()' is a method of PrintStream class which we are accessing using out object of that class.
    }
}
