package Object.JDBC;

import java.sql.*;

/**
 * @author 摩西摩西
 * @date 2021/8/1  10:21
 **/
public class TestJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/sa_layout?characterEncoding=UTF-8","root","root");
            Statement s=connection.createStatement();
        ){
            String sql="select * from atest";
            ResultSet rs=s.executeQuery(sql);
            while (rs.next()){
                String name=rs.getString("name");
                int age=rs.getInt("age");
                System.out.println(name+":"+age);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
