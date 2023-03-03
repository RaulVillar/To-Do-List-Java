import javax.swing.*;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRead extends CMethods {
    public void ReadTasks(JList paramTaskList) {

        DefaultListModel model = new DefaultListModel();

        paramTaskList.setModel(model);

        CConnection con = new CConnection();
        try {
            Statement stmt = con.Connection().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM taskslist");

            while (rs.next()) {
                model.addElement(rs.getString(1) + ") " + rs.getString(2) + " -> " + rs.getString(3) + "\n");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Could not connect to the database: " + e.toString());
        }
    }
}
