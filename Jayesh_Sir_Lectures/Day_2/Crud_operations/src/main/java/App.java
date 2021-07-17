import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class App {
    public static void main(String[] args) {
        //try with resource. no need of the finally block.
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mu_students","root","")) {
//            String sql = "insert into students (roll_no,name,email) values (?,?,?)";
//            PreparedStatement prepStat = conn.prepareStatement(sql);
//
//            prepStat.setInt(1,23);
//            prepStat.setString(2,"Hit Bhalodia");
//            prepStat.setString(3,"hit.bhalodia@gmail.com");
//
//            int updatedRows1 = prepStat.executeUpdate();
//            if(updatedRows1 > 0){
//                System.out.println("Insert Succesfull");
//            }
//
//            prepStat.setInt(1,24);
//            prepStat.setString(2,"Karan Doshi");
//            prepStat.setString(3,"karan.doshi@gmail.com");
//
//            int updatedRows2 = prepStat.executeUpdate();
//            if(updatedRows2 > 0){
//                System.out.println("Insert Succesfull");
//            }
//
//            prepStat.setInt(1,13);
//            prepStat.setString(2,"Meet Tank");
//            prepStat.setString(3,"Meet.Tank@gmail.com");
//
//            int updatedRows3 = prepStat.executeUpdate();
//
//            if(updatedRows3 > 0){
//                System.out.println("Insert Succesfull");
//            }

            String sql = "select * from students";
            PreparedStatement prepStat = conn.prepareStatement(sql);

            ResultSet res = prepStat.executeQuery();

            while(res.next()){
                System.out.println("|-----------------------------------------------------|");
                System.out.println("    Roll No : "+res.getString("roll_no"));
                System.out.println("    Name : "+res.getString("name"));
                System.out.println("    Email : "+res.getString("email"));
                System.out.println("|-----------------------------------------------------|");
            }
        }catch(Exception e ){
            System.err.println("Error While Connecting DB");
            e.printStackTrace();
        }
    }
}
