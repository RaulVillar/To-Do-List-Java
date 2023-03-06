import javax.swing.*;
import java.sql.CallableStatement;

public class CUpdate extends CMethods {
    public void UpdateTask(JTextField paramTaskId, JTextField paramTaskName, JTextField paramTaskDescription) {

        setId(Integer.valueOf(paramTaskId.getText()));
        setName(paramTaskName.getText());
        setDescription(paramTaskDescription.getText());

        String consult = "UPDATE taskslist SET taskName = ?, taskDescription = ? WHERE taskID = ?";

        if (!paramTaskName.getText().isEmpty() && !paramTaskDescription.getText().isEmpty()) {
            try {
                CallableStatement cs = con.Connection().prepareCall(consult);

                cs.setString(1, getName());
                cs.setString(2, getDescription());
                cs.setInt(3, getId());
                cs.executeUpdate();
                JOptionPane.showMessageDialog(null, "It was updated correctly");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "It wasn't updated correctly" + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "You must add text");
        }
    }
}
