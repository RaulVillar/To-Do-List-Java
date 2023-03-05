import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CForm extends JFrame {
    public JPanel taskForm;
    public JTextField taskTextField;
    public JTextField descriptionTextField;
    public JTextField idTextField;
    public JButton addButton;
    public JButton deleteButton;
    public JButton updateButton;
    public JList taskList;
    private JButton readButton;

    public void CShowTable() {

        this.setSize(730, 400);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        idTextField.setEnabled(false);
    }

    public CForm() {
        super("To-Do List");
        setContentPane(taskForm);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CInsert add = new CInsert();
                add.InsertTask(taskTextField, descriptionTextField);
                CRead reader = new CRead();
                reader.ReadTasks(taskList);
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CDelete delete = new CDelete();
                delete.DeleteTask(idTextField);
                CRead reader = new CRead();
                reader.ReadTasks(taskList);
            }
        });
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CUpdate update = new CUpdate();
                update.UpdateTask(idTextField, taskTextField, descriptionTextField);
                CRead reader = new CRead();
                reader.ReadTasks(taskList);
            }
        });

        readButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CRead reader = new CRead();
                reader.ReadTasks(taskList);
            }
        });

        taskList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                CSelection select = new CSelection();
                select.selectTask(taskList, idTextField, taskTextField, descriptionTextField);
            }
        });
    }
}

