package hospital.management.system1;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class NewUser extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement stmt;

    public NewUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cSpecialization = new javax.swing.JComboBox();
        txtUserName = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        bSave = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bNew = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();
        txtPassword1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New User");
        setBounds(new java.awt.Rectangle(350, 0, 0, 0));
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 117, 118, 22);

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("User Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 79, 118, 22);

        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Confirm Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 150, 118, 22);

        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Specialization");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 183, 118, 22);

        cSpecialization.setBackground(new java.awt.Color(153, 153, 255));
        cSpecialization.setForeground(new java.awt.Color(51, 51, 255));
        cSpecialization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Doctor", "Nurse", "Pharmacist", "Receptionist", "Accountant", "Lab", "X-Ray", " " }));
        cSpecialization.setSelectedIndex(-1);
        cSpecialization.setName("cQualification"); // NOI18N
        cSpecialization.setRequestFocusEnabled(false);
        cSpecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cSpecializationActionPerformed(evt);
            }
        });
        jPanel1.add(cSpecialization);
        cSpecialization.setBounds(170, 183, 154, 22);

        txtUserName.setBackground(new java.awt.Color(153, 153, 255));
        txtUserName.setForeground(new java.awt.Color(51, 51, 255));
        txtUserName.setName("txtOldPassword"); // NOI18N
        jPanel1.add(txtUserName);
        txtUserName.setBounds(170, 80, 154, 20);

        txtConfirmPassword.setBackground(new java.awt.Color(153, 153, 255));
        txtConfirmPassword.setForeground(new java.awt.Color(51, 51, 255));
        txtConfirmPassword.setName("txtConformPassword"); // NOI18N
        jPanel1.add(txtConfirmPassword);
        txtConfirmPassword.setBounds(170, 151, 154, 20);

        bSave.setBackground(new java.awt.Color(153, 153, 255));
        bSave.setText("Save");
        bSave.setName("bSave"); // NOI18N
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });
        jPanel1.add(bSave);
        bSave.setBounds(390, 80, 138, 23);

        bDelete.setBackground(new java.awt.Color(153, 153, 255));
        bDelete.setText("Delete");
        bDelete.setName("bCancel"); // NOI18N
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(bDelete);
        bDelete.setBounds(390, 110, 138, 23);

        bNew.setBackground(new java.awt.Color(153, 153, 255));
        bNew.setText("New");
        bNew.setName("bCancel"); // NOI18N
        bNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewActionPerformed(evt);
            }
        });
        jPanel1.add(bNew);
        bNew.setBounds(390, 140, 138, 23);

        bCancel.setBackground(new java.awt.Color(153, 153, 255));
        bCancel.setText("Cancel");
        bCancel.setName("bCancel"); // NOI18N
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });
        jPanel1.add(bCancel);
        bCancel.setBounds(390, 170, 138, 23);

        txtPassword1.setBackground(new java.awt.Color(153, 153, 255));
        txtPassword1.setForeground(new java.awt.Color(51, 51, 255));
        txtPassword1.setName("txtOldPassword"); // NOI18N
        jPanel1.add(txtPassword1);
        txtPassword1.setBounds(170, 118, 154, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system1/user.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(-6, 0, 650, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cSpecializationActionPerformed
    }//GEN-LAST:event_cSpecializationActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        try {
            con = Connect.ConnectDB();
            if (txtUserName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter user name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String Password = String.valueOf(txtPassword1.getPassword());
            if (Password.equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter password", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtConfirmPassword.getText().toString().equals("")) {

                JOptionPane.showMessageDialog(this, "Please enter a confirm password", "Error", JOptionPane.ERROR_MESSAGE);

                return;
            }

            if (!Password.equals(String.valueOf(txtConfirmPassword.getText()))) {

                JOptionPane.showMessageDialog(this, " Password doesn't match with Confirmed Password", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (txtPassword1.getText().toString().length() < 5) {

                JOptionPane.showMessageDialog(this,
                        "Password Should be  Atleast 5 Characters",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cSpecialization.getSelectedItem().toString().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Specialization ", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }




            stmt = con.createStatement();
            String sql1 = "Select username from Users where Username= '" + txtUserName.getText() + "'";
            rs = stmt.executeQuery(sql1);
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "User name already exists", "Error", JOptionPane.ERROR_MESSAGE);
                txtUserName.setText("");
                txtUserName.requestDefaultFocus();
                return;
            }
            String Password1 = String.valueOf(txtUserName.getPassword());
            String sql = "insert into Users(UserName,Password,Specialization)values('" + txtUserName.getText() + "','" + txtPassword1.getText().toString() + "','" + cSpecialization.getSelectedItem().toString() + "')";

            pst = con.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(this, "Successfully Registered", "User", JOptionPane.INFORMATION_MESSAGE);
            bSave.setEnabled(false);
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_bSaveActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed

        try {
            if (bDelete.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter user name.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }
            int P = JOptionPane.showConfirmDialog(null, " Are you sure want to delete ?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (P == 0) {
                con = Connect.ConnectDB();

                String sql = "delete from Users where Username = '" + txtUserName.getText() + "'";
                pst = con.prepareStatement(sql);
                pst.execute();

                JOptionPane.showMessageDialog(this, "Successfully deleted", "Record", JOptionPane.INFORMATION_MESSAGE);
                reset();
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

    }//GEN-LAST:event_bDeleteActionPerformed

    private void bNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewActionPerformed
      reset();
    }//GEN-LAST:event_bNewActionPerformed

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelActionPerformed

    private void reset() {
        txtUserName.setText("");
        txtPassword1.setText("");
        txtConfirmPassword.setText("");
        cSpecialization.setSelectedIndex(-1);
        bSave.setEnabled(true);
        bDelete.setEnabled(true);
        txtUserName.requestDefaultFocus();

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUser().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bNew;
    private javax.swing.JButton bSave;
    private javax.swing.JComboBox cSpecialization;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JPasswordField txtUserName;
    // End of variables declaration//GEN-END:variables
}
