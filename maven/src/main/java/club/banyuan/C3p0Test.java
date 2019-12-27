package club.banyuan;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.SQLException;

public class C3p0Test {
    public static void main(String[] args) {


        ComboPooledDataSource ds =new ComboPooledDataSource();
        try {
            System.out.println(ds.getJdbcUrl()+ds.getDriverClass());
            ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
