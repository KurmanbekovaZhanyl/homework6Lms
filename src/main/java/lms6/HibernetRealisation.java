package lms6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HibernetRealisation {
    public static final String url = "jdbc:postgresql://localhost:5432/postgres";
    public static final String user = "postgres";
    public static final String password = "Bilet2022";

    public static Connection connection() {
        Connection connection = null;
        try {
             connection = DriverManager.getConnection(url,user,password);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }

}
