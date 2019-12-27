package club.banyuan.dayHomework;


//1.对于学生表添加学员信息(学员编号,学员姓名,学员成绩,学员住址,学员的入学日期) 多几条方便操作
//2.根据指定的学生姓名进行删除
//3.修改指定编号的学员
//4.查找所有名字带 ’花’ 字的学员
//5.修改’周’姓学员的学员成绩,所有人的成绩增加5分


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {


    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/student";
            Connection con= DriverManager.getConnection(url,"root","MyNewPass@123" );
            //String sql= "insert into students values (2,'王五',12,'北京','2019')" ;
            //String sql= "insert into students values (3,'礼花',12,'北京','2019')" ;
            //String sql= "insert into students values (4,'赵六',12,'广州','2019')" ;


             Statement st = con.createStatement();
             st.executeUpdate(del(1));
             st.close();
             con.close();


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static String  del(int i){
        String sql="delete from students where id="+i;
        return sql;
    }

    /*public static String update(int i){
        String sql ="update students set ";
    }
*/
}
