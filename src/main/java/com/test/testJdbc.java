package com.test;

import com.springDemo.model.User;

import java.sql.*;

/**
 * Created by huyingxiang on 17/7/5.
 */

/**step
 * 使用jdbc编程需要连接数据库,注册驱动和数据库信息
 * 操作Connection,打开Statement对象
 * 通过Statecoment执行sql,返回结果到ResultSet对象
 * 使用ResulSet读取数据,通过代码转换诶具体的POJO对象
 * 关闭数据库资源
 */


public class testJdbc {
    public static void main(String[] args){
        Connection connection;
        String driver = "com.mysql.jdbc.Driver";
        String url =  "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String pwd = "123456";
        try {
            Class.forName(driver);
            System.out.println("*************成功加载*************");
            connection = DriverManager.getConnection(url,user,pwd);
            if(connection!=null){
                String sql = "SELECT * from user where userId = 1";
                System.out.println("************* connect success *************");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                System.out.println("*************"+resultSet+"*************");
                while (resultSet.next()){
                    User user1 = new User();
                    user1.setUserName(resultSet.getString("userName"));
                    user1.setPassword(resultSet.getString("password"));
                    System.out.println(user1.getUserName());
                }
                resultSet.close();
                statement.close();
                connection.close();
            }
            else {
                System.out.println("************* connect faliar *************");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("*************"+e+"*************");
        }

    }
}