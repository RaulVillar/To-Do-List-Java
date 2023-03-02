//import com.mysql.cj.jdbc.CallableStatement;
//
//import javax.swing.*;
//
//public class CMethods {
//    int id;
//    String name;
//    String description;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public void InsertTask(JtextField taskTextField, JTextField descriptionTextField) {
//        setName(taskTextField.getText());
//        setDescription(descriptionTextField.getText());
//
//        String consult = "insert into `tasklist` (taskName, taskDescription) values (?,?).";
//
//        try {
//            CallableStatement cStmt = objetoConnection.establishedConnection().prepareCall(consult);
//
//            cStmt.setString(1, getName());
//            cStmt.setString(2, getDescription());
//            cStmt.executeUpdate();
//
//            JOptionPane.showMessageDialog(null, "It was added correctly");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "It wasn't added correctly");
//        }
//    }
//}
