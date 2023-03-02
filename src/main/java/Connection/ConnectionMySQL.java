package Connection;
import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionMySQL {
    public static Connection getConnection(){
        Connection con = null;
        String name = "root";
        String url = "jdbc:mysql://localhost:3306/taskdatabase";
        String psw = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,name,psw);
            System.out.println("Connected to the database taskDataBase");
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        return con;
    }
}
