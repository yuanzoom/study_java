package study.d2025_3_7;

import java.sql.*;

public class jdbcDemo02 {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/zzetable?serverTimezone=UTC";
        String name="root";
        String password="123456";
        Connection connection = DriverManager.getConnection(url, name, password);
        //增加
        //String sql="insert into users(username, email, password) values(?, ?, ?)";
        //修改
        //String sql="update users set username=?,email=? where user_id=?";
        //删除
//        String sql="delete from users where user_id=?";
        //查询
        String sql="select * from users where user_id=?";
        PreparedStatement ps = connection.prepareStatement(sql);
//        ps.setString(1,"22222");
//        ps.setString(2,"33333");
//        ps.setString(3,"4444");
//        ps.setString(1,"22415222");
//        ps.setString(2,"3373");
//        ps.setInt(3,2);
        ps.setInt(1,2);
        ResultSet resultSet = ps.executeQuery();
        while(resultSet.next()){
            int id=resultSet.getInt("user_id");
            System.out.println(id);
        }
        //ps.setInt(1,7);
//        int i=ps.executeUpdate();
//        if(i>0){
//            System.out.println("成功");
//        }
        ps.close();
        connection.close();
    }
}
