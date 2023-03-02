import Connection.ConnectionMySQL;
import java.sql.Connection;
import java.sql.Statement;

public class CConnection extends ConnectionMySQL {

    public static void main(String[] args) throws Exception {

        ConnectionMySQL connectionMySQL = new ConnectionMySQL();
        Connection con = connectionMySQL.getConnection();
//        Statement stmt = con.createStatement();
//        stmt.executeUpdate("insert into `taskslist` values(2, 'Buy new clothes', 'Gotta go to Zara to buy new clothes')");
//        stmt.executeUpdate("insert into `taskslist` values(3, 'Buy new books', 'Gotta go to CasalDelLibro to buy new clothes')");
        con.close();
    }
}
