/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;


/**
 *
 * @author Sandeep
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "Nosmile@3243");
//            if(con!=null){
//                System.out.println("Successfully Connected");
//            }
            return con;
        }
        catch(Exception e){
//            System.out.println(e);
//            System.out.println("Not Connected");
            return null;
        }
    }
}

