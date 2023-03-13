package cn.itcast.jdbc.example;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Bty
 * Date: 2023-03-14
 * Time: 1:01
 * 用于读取数据库中的user表，并将结果输出至控制台
 */
public class Example01 {
    public static void main(String[] args) {
     Statement stmt = null;
     ResultSet rs = null;
     Connection conn = null;
     try{
         //1.注册数据库驱动
         Class.forName("com.mysql.cj.jdbc.Driver");
         //2.通过DriverManger获取数据库连接
         String url = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=GMT%2B8&useSSL=false";
         String username = "root";
         String password = "root";
         conn = DriverManager.getConnection(url,username,password);
         //3.通过Connection对象获取Statement对象
         stmt = conn.createStatement();
         //4.使用Statement执行SQL语句。
         String sql ="select * from users";
         rs = stmt.executeQuery(sql);
         //5.操作ResultSet结果集
         System.out.println("id  |  name   |    password" + "|    email    |    birthday");
         while(rs.next()){
             int id = rs.getInt("Int")//通过列名获取指定字段的值
             String name =

         }

     } catch (ClassNotFoundException | SQLException e) {
         e.printStackTrace();
     }
    }
}
