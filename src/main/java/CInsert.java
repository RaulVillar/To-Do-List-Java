import com.mysql.cj.jdbc.CallableStatement;
import javax.swing.*;
import java.sql.PreparedStatement;

public class CInsert extends CTask{

    public void InsertTask (JTextField paramTaskTextField, JTextField paramDescriptionTextField) {

            setName(paramTaskTextField.getText());
            setDescription(paramDescriptionTextField.getText());

            String consult = "INSERT INTO `taskslist` (taskName, taskDescription) values (?,?).";

            CConnection con = new CConnection();
            con.getConnection();

            try {
                PreparedStatement cStmt = con.getConnection().prepareCall(consult);

                cStmt.setString(1, getName());
                cStmt.setString(2, getDescription());
                cStmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "It was added correctly");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "It wasn't added correctly");
            }
    }
}
