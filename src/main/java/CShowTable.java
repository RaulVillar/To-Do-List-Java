import javax.swing.*;

public class CShowTable extends CForm {
    public CShowTable() {

        idTextField.setEnabled(false);
        JPanel mainPanel = getMainPanel();
        JFrame frame = new CForm();
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}


