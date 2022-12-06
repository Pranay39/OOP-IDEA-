package Packages;

//import java.util.Date;
import java.sql.*;

public class NamingConflicts {
    public static void main(String[] args){
        java.util.Date deadline = new java.util.Date();     //Date deadline = new Date();

        System.out.println(deadline);

        java.sql.Date today = new java.sql.Date(3);

        System.out.println(today);
    }
}
