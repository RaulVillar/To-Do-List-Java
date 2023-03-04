import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
    private JList taskList;

    public JPanel getMainPanel() {
        return taskForm;
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

        String[] items = {"A", "B", "C"};
        JList list = new JList(items);
        taskList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JList list = (JList)e.getSource();
                if (e.getClickCount() == 2) {

                    int index = list.locationToIndex(e.getPoint());
                } else if (e.getClickCount() == 3) {

                    int index = list.locationToIndex(e.getPoint());
                }
            }
        });
    }
}

