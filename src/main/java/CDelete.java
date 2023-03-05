import javax.swing.*;
import java.sql.CallableStatement;

public class CDelete extends CMethods {

    public void DeleteTask(JTextField paramTaskId) {

        setId(Integer.parseInt(paramTaskId.getText()));

        Connect();

        String consult = "DELETE FROM taskslist WHERE taskslist.taskID = ?";

        try {
            CallableStatement cs = con.Connection().prepareCall(consult);
            cs.setInt(1, getId());
            cs.execute();

            JOptionPane.showMessageDialog(null, "It was deleted correctly");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "It couldn't be deleted" + e.toString());
        }
    }
}
