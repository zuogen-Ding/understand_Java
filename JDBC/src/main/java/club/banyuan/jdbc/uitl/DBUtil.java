package club.banyuan.jdbc.uitl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {


    static Connection con=null;

    public static Connection getConnection() {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/student";
            con= DriverManager.getConnection(url,"root","MyNewPass@123" );
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return con;
    }


    public static void closeCon(){
        try {

            if(con!=null) {
                con.close();
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            con=null;
        }

    }
}
