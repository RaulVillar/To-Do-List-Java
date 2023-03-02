package Connection;
import javax.swing.*;
import java.sql.Connection;


public class ConnectionMySQL {
    public static Connection getConnection(){
        Connection con = null;
        String name = "root";
        String url = "jdbc:mysql://localhost:3306/ToDoList";
        String psw = "10021002";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,name,psw);
            System.out.println("Connected to the database taskDataBase");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse" + e.toString());
        }
        return con;
    }
}
