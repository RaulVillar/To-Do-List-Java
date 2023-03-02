import javax.swing.*;

public class CMainPanel extends taskList {
    public CMainPanel (){

//        idTextField().setEnabled(false);
        JPanel mainPanel = getMainPanel();
        JFrame frame = new taskList();
        frame.setSize(500,300);
        frame.setVisible(true);
    }
}


