import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CForm extends JFrame {
    public JPanel taskForm;
    public JTextField taskTextField;
    public JTextField descriptionTextField;
    public JTextField idTextField;
    public JButton addButton;
    public JButton deleteButton;
    public JButton updateButton;
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

        taskList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });
    }
}

