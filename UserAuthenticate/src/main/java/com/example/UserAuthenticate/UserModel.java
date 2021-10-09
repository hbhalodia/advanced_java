package com.example.UserAuthenticate;

import java.io.PrintWriter;
import java.sql.*;

public class UserModel {

    public static long nextPk() {
        long pk = 0;
        Connection conn;

        try {
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java?serverTimezone=UTC","root","");
            PreparedStatement stmt = conn.prepareStatement("select Max(id) from user1");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                pk = rs.getLong(1);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block


            e.printStackTrace();
        }
        return pk+1;

    }


    public static long addUser(UserBeans user) {
        int i = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java?serverTimezone=UTC","root","");
            PreparedStatement stmt = conn.prepareStatement("insert into user1 values(?,?,?,?,?,?,?)");
            stmt.setLong(1, nextPk());
            stmt.setString(2 , user.getFirstName() );
            stmt.setString(3 , user.getLastName() );
            stmt.setString(4 , user.getLogin() );
            stmt.setString(5 , user.getPassword() );
            stmt.setDate(6 , Date.valueOf("12-12-12"));
            stmt.setString(7 , user.getMobileNo() );
            i =   stmt.executeUpdate();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return i;
    }

    public static UserBeans  UserLogin(String login,String password) {
        Connection con;
        UserBeans user = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java?serverTimezone=UTC","root","");
            PreparedStatement stmt = con.prepareStatement("Select * from user1 where login=? and password = ?");
            stmt.setString(1,login);
            stmt.setString(2,password);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                user = new UserBeans();
                System.out.println("ID: "+rs.getLong("id"));
                user.setId(rs.getLong("id"));
                user.setFirstName(rs.getString("fname"));
                user.setLastName(rs.getString("lname"));
                user.setLogin(rs.getString("login"));
                user.setPassword(rs.getString("password"));
                user.setDob(rs.getDate("dob"));
                user.setMobileNo(rs.getString("mobile"));
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return user;
    }
}
