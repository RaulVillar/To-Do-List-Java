import Connection.ConnectionMySQL;
import javax.swing.*;
import java.sql.Connection;
import java.sql.Statement;

public class CConnection extends ConnectionMySQL {

    public Connection Connection(){

        ConnectionMySQL connectionMySQL = new ConnectionMySQL();
        Connection con = null;

        try {
            con = connectionMySQL.getConnection();
//            Statement stmt = con.createStatement();
//            stmt.executeUpdate("insert into `taskslist` values(2, 'Buy new clothes', 'Gotta go to Zara to buy new clothes')");
//            stmt.executeUpdate("insert into `taskslist` values(3, 'Buy new books', 'Gotta go to CasalDelLibro to buy new clothes')");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse" + e.toString());
        }
        return con;
    }
}



