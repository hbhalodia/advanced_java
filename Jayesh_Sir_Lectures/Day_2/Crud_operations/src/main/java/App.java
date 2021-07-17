import adv_java_funda.utils.dbutils;

import java.sql.*;

public class App {
    public static void main(String[] args) throws SQLException {
        //try with resource. no need of the finally block.
        Connection connection=null;
        try  {
            String sql = "insert into students (roll_no,name,email) values (?,?,?)";
            connection = dbutils.getConnection();

            if(connection!=null){
                int updatedRows = dbutils.createEntry(connection,sql,"Soham Patel","soham.patel@gmail.com",46);
                if(updatedRows > 0){
                    System.out.println("Insert Success");
                }
            }
            else{
                System.out.println("Please check the Credential and try again");
            }

//            String sql = "select * from students";
//            PreparedStatement prepStat = conn.prepareStatement(sql);
//
//            ResultSet res = prepStat.executeQuery();
//
//            while(res.next()){
//                System.out.println("|-----------------------------------------------------|");
//                System.out.println("    Roll No : "+res.getString("roll_no"));
//                System.out.println("    Name : "+res.getString("name"));
//                System.out.println("    Email : "+res.getString("email"));
//                System.out.println("|-----------------------------------------------------|");
//            }
        }catch(Exception e ){
            System.err.println("Error While Connecting DB");
            e.printStackTrace();
        }
        finally {
            connection.close();
        }
    }
}
