import javax.swing.JTextField;
import java.sql.CallableStatement;
import javax.swing.JOptionPane;

public class CInsert extends CTask {

    public void InsertTask(JTextField paramTaskTextField, JTextField paramDescriptionTextField) {

        String consult = "INSERT INTO `taskslist` (taskName, taskDescription) values (?,?)";

        CConnection con = new CConnection();

        if (!paramTaskTextField.getText().isEmpty() && !paramDescriptionTextField.getText().isEmpty()) {

            try {
                CallableStatement cs = con.Connection().prepareCall(consult);

                cs.setString(1, paramTaskTextField.getText());
                cs.setString(2, paramDescriptionTextField.getText());
                cs.executeUpdate();
                JOptionPane.showMessageDialog(null, "It was added correctly");
                paramTaskTextField.setText("");
                paramDescriptionTextField.setText("");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "It wasn't added correctly" + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Add text");
        }
    }
}
