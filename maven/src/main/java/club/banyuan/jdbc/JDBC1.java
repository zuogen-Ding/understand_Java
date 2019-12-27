package club.banyuan.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/ding";
            DriverManager.getConnection(url,"root","MyNewPass@123" );

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
