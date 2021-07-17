import adv_java_funda.utils.dbutils;

import java.sql.*;

public class App {
    public static void main(String[] args) throws SQLException {
        //try with resource. no need of the finally block.
        Connection connection=null;
//        try  {
//            String db_create = dbutils.create_sql_query();
//            connection = dbutils.getConnection();
//
//            if(connection!=null){
//                int updatedRows = dbutils.createEntry(connection,db_create,"Soham Patel","soham.patel@gmail.com",46);
//                if(updatedRows > 0){
//                    System.out.println("Insert Success");
//                }
//            }
//            else{
//                System.out.println("Please check the Credential and try again");
//            }
//
//        }catch(Exception e ){
//            System.err.println("Error While Connecting DB");
//            e.printStackTrace();
//        }
//        finally {
//            connection.close();
//        }
        try {
            String db_create = dbutils.select_sql_query();
            connection = dbutils.getConnection();

            ResultSet res = dbutils.readEntries(connection,db_create);

            dbutils.print_all(res);

        }catch (Exception e){
            System.err.println("Error While Perfoming DB");
            e.printStackTrace();
        }
        finally {
            connection.close();
        }
    }
}
