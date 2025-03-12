package study.d2025_3_7;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class jdbcDemo03 {
    public static void main(String[] args) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        System.out.println("Driver Class: " + dataSource.getDriverClass());
        System.out.println("JDBC URL: " + dataSource.getJdbcUrl());
        System.out.println("User: " + dataSource.getUser());
        System.out.println("Password: " + dataSource.getPassword());

 /*      //创建连接池对象
        ComboPooledDataSource cpd = new ComboPooledDataSource();
        //创建连接对象
//        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
//        String name = "root";
//        String password = "123456";
        Connection connection = cpd.getConnection();
        String sql = " insert into user(id,age) values(?,?) ";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, 6);
        ps.setInt(2, 45);
        //Statement statement = connection.createStatement();
        int i = ps.executeUpdate();
        if (i > 0) {
            System.out.println("chenggon");
        }
        ps.close();
        connection.close();
*/
    }
}
