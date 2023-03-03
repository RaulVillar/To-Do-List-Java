import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class taskList extends JFrame {
    public JPanel taskForm;
    public JTextField taskTextField;
    public JTextField descriptionTextField;
    public JTextField idTextField;
    public JButton addButton;
    public JButton deleteButton;
    public JButton updateButton;
    public JButton exitButton;
    private JList taskList;

    public JPanel getMainPanel() {
        return taskForm;
    }

    public void MyForm() {
        taskList = new JList();
        taskList.setBounds(10, 10, 500, 300);
        add(taskList);
        CRead reader = new CRead();
        reader.ReadTasks(taskList);
    }

    public taskList() {
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

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
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
    }
}

