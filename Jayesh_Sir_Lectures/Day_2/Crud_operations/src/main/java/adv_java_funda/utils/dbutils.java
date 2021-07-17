package adv_java_funda.utils;

import java.sql.*;

public class dbutils {
    //get Conenection
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mu_students";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    private static final String DB_CREATE = "insert into students (roll_no,name,email) values (?,?,?)";
    private static final String DB_SELECT = "select * from students";

    public static String create_sql_query(){
        return DB_CREATE;
    }

    public static String select_sql_query(){
        return DB_SELECT;
    }

    public static Connection getConnection() throws SQLException {
        Connection connection=null;
        try{
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            return connection;
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("Error While Connecting DB : "+e);
        }
        return null;
    }

    public static int createEntry(Connection connection , String sql , String name , String email , int roll_no) throws SQLException{
        PreparedStatement prepStat = connection.prepareStatement(sql);

        prepStat.setInt(1,roll_no);
        prepStat.setString(2,name);
        prepStat.setString(3,email);

        return prepStat.executeUpdate();
    }

    public static ResultSet readEntries(Connection connection, String sql) throws SQLException {
        PreparedStatement prepStat = connection.prepareStatement(sql);

        return prepStat.executeQuery();
    }

    public static void print_all(ResultSet res) throws SQLException {
        while(res.next()){
            System.out.println("|--------------------------------------------------------|");
            System.out.println("|   Name : "+ res.getString("name"));
            System.out.println("|   Email : "+res.getString("email"));
            System.out.println("|   Roll : "+res.getString("roll_no"));
            System.out.println("|--------------------------------------------------------|");
        }
    }
}
