package study.d2025_3_7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcDemo01 {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/zzetable?serverTimezone=UTC";
        String name="root";
        String password="123456";
        Connection connection = DriverManager.getConnection(url, name, password);
        Statement statement = connection.createStatement();
        //添加
        //String sql="insert into users(username, email, password) values('john', 'joh123n@example.com', 'password123456')";
        //修改
        //String sql="update users set username='1111',email='34456' where user_id=6";
        //删除
        //String sql="delete from users where user_id=6";
        //查询
        String sql="select * from users";
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            int id=resultSet.getInt("user_id");
            String username=resultSet.getString("username");
            System.out.println(id+"   "+username);
        }
        statement.close();
        connection.close();
    }
}
