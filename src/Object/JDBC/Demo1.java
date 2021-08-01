package Object.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author 摩西摩西
 * @date 2021/7/28  17:15
 **/
public class Demo1 {

    public static void main(String[] args) {
//        execute("insert into atest values('唐',27)");
        execute("delete from atest where age='18'");
    }
    public static void execute(String sql){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
       try( Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sa_layout?characterEncoding=UTF-8","root","root");
            Statement statement=connection.createStatement()
       ){
           statement.execute(sql);
           System.out.println("操作成功");
       } catch (SQLException e) {
           e.printStackTrace();
       }
    }

}
