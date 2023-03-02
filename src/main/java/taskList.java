import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class taskList extends JFrame{
 public JPanel taskForm;
 public JTextField taskTextField;
 public JTextField descriptionTextField;
 public JTextField idTextField;
 public JButton addButton;
 public JButton deleteButton;
 public JButton updateButton;
 public JButton exitButton;

 public JPanel getMainPanel() {
  return taskForm;
 }
 public taskList (){
  super("Example of ToDoList");
  setContentPane(taskForm);

  addButton.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent e) {
    CInsert add = new CInsert();
    add.InsertTask(taskTextField, descriptionTextField);
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

   }
  });
 }
}

