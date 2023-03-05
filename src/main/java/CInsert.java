import javax.swing.JTextField;
import java.sql.CallableStatement;
import javax.swing.JOptionPane;

public class CInsert extends CMethods {

    public void InsertTask(JTextField paramTaskName, JTextField paramTaskDescription) {

        String consult = "INSERT INTO `taskslist` (taskName, taskDescription) values (?,?)";

        Connect();

        if (!paramTaskName.getText().isEmpty() && !paramTaskDescription.getText().isEmpty()) {

            try {
                CallableStatement cs = con.Connection().prepareCall(consult);

                cs.setString(1, paramTaskName.getText());
                cs.setString(2, paramTaskDescription.getText());
                cs.executeUpdate();
                JOptionPane.showMessageDialog(null, "It was added correctly");
                paramTaskName.setText("");
                paramTaskDescription.setText("");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "It wasn't added correctly" + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "You must add text");
        }
    }
}
