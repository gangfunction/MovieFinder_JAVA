package dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dto {
    public static Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/finalwork", "root", "1234");
    }
}
