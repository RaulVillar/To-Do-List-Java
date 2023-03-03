import Connection.ConnectionMySQL;

import javax.swing.*;
import java.sql.Connection;

public class CConnection extends ConnectionMySQL {

    public Connection Connection() {

        ConnectionMySQL connectionMySQL = new ConnectionMySQL();
        Connection con = null;

        try {
            con = connectionMySQL.getConnection();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Could not connect" + e.toString());
        }
        return con;
    }
}



