package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionSQL {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String name,pass,url;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            url="jdbc:mysql://localhost:3306/taskdatabase";
            name="root";
            pass="";
            con = DriverManager.getConnection(url,name,pass);
            System.out.println("Connected to the database taskDataBase");

//            Statement stmt = con.createStatement();
//            stmt.executeUpdate("insert into `taskslist` values(2, 'Buy new clothes', 'Gotta go to Zara to buy new clothes')");
//            stmt.executeUpdate("insert into `taskslist` values(3, 'Buy new books', 'Gotta go to CasalDelLibro to buy new clothes')");
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
