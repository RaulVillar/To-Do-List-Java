import javax.swing.*;

public class CSelection extends CMethods {

    public void selectTask(JList <CMethods> paramTaskList, JTextField paramTaskId, JTextField paramTaskName, JTextField paramTaskDescription) {

        try {

            CMethods selectedTask = paramTaskList.getSelectedValue();

            paramTaskId.setText(String.valueOf(selectedTask.getId()));
            paramTaskName.setText(selectedTask.getName());
            paramTaskDescription.setText(selectedTask.getDescription());


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Couldn't be selected" + e.toString());
        }
    }
}
