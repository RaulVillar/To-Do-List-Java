import javax.swing.*;
import java.sql.CallableStatement;

public class CDelete extends CTask {

    public void DeleteTask(JTextField paramIdTextField) {

        setId(Integer.parseInt(paramIdTextField.getText()));

        CConnection con = new CConnection();

        String consult = "DELETE FROM `taskslist` WHERE taskslist.taskID = ?";

        try {
            CallableStatement cs = con.Connection().prepareCall(consult);
            cs.setInt(1, getId());
            cs.execute();

            JOptionPane.showMessageDialog(null, "It was deleted correctly");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "It could not be deleted" + e.toString());
        }
    }
}
