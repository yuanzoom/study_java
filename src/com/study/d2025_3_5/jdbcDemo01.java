package study.d2025_3_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo01 {
    public static void main(String[] args) throws  SQLException {
        

        //连接数据库
        String url="jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
        String username="root";
        String password="123456";
        Connection connection = DriverManager.getConnection(url,username,password);

        //获得连接对象
        Statement statement = connection.createStatement();
        //写入sql
        String sql="insert into user values(4,'a',20)";
        int i = statement.executeUpdate(sql);
        if(i>0){
            System.out.println("成功");
        }
        statement.close();
        connection.close();
    }
}
