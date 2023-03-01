import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class taskList extends JFrame{
 private JPanel taskForm;
 private JTextField taskTextField;
 private JTextField descriptionTextField;
 private JTextField idTextField;
 private JButton addButton;
 private JButton deleteButton;
 private JButton updateButton;
 private JButton exitButton;
 private JButton BtnAdd;

 public taskList (){
  super("Example of ToDoList");
  setContentPane(taskForm);

  addButton.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent e) {
     JOptionPane.showConfirmDialog(null, "Hola");
   }
  });

  exitButton.addActionListener(new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent e) {
   dispose();
   System.exit(0);
   }
  });
 }
}

