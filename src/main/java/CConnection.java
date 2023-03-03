import Connection.ConnectionMySQL;
import javax.swing.*;
import java.sql.Connection;

public class CConnection extends ConnectionMySQL {

    public Connection Connection(){

        ConnectionMySQL connectionMySQL = new ConnectionMySQL();
        Connection con = null;

        try {
            con = connectionMySQL.getConnection();
//            Statement stmt = con.createStatement();
//            stmt.executeUpdate("insert into `taskslist` values(1, 'Buy new clothes', 'Gotta go to Zara to buy new clothes')");
//            ((Statement) stmt).executeUpdate("insert into `taskslist` values(2, 'Buy new books', 'Gotta go to CasalDelLibro to buy new clothes')");

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Could not connect" + e.toString());
        }
        return con;
    }
}



