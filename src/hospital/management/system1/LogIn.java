package hospital.management.system1;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {

    Connection con2 = null;
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    ResultSet rs2 = null;
    PreparedStatement pst2 = null;
    ResultSet rs3 = null;
    PreparedStatement pst3 = null;

    public LogIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        bCancel = new javax.swing.JButton();
        bOk = new javax.swing.JButton();
        bChangePassword = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cSpecialization = new javax.swing.JComboBox();
        txtUserName = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Log In");
        setBounds(new java.awt.Rectangle(350, 100, 0, 0));
        setResizable(false);

        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("User Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 90, 90, 24);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 132, 90, 24);

        txtPassword.setBackground(new java.awt.Color(153, 153, 255));
        txtPassword.setForeground(new java.awt.Color(51, 51, 255));
        txtPassword.setName("txtPassword"); // NOI18N
        jPanel1.add(txtPassword);
        txtPassword.setBounds(147, 136, 180, 20);

        bCancel.setBackground(new java.awt.Color(153, 153, 255));
        bCancel.setText("Cancel");
        bCancel.setName("bCancel"); // NOI18N
        bCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCancelMouseClicked(evt);
            }
        });
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });
        jPanel1.add(bCancel);
        bCancel.setBounds(167, 231, 147, 23);

        bOk.setBackground(new java.awt.Color(153, 153, 255));
        bOk.setText("Ok");
        bOk.setName("bOk"); // NOI18N
        bOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bOkMouseClicked(evt);
            }
        });
        bOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOkActionPerformed(evt);
            }
        });
        jPanel1.add(bOk);
        bOk.setBounds(10, 231, 147, 23);

        bChangePassword.setBackground(new java.awt.Color(153, 153, 255));
        bChangePassword.setText("Change Password");
        bChangePassword.setName("bChangePassword"); // NOI18N
        bChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bChangePasswordActionPerformed(evt);
            }
        });
        jPanel1.add(bChangePassword);
        bChangePassword.setBounds(328, 231, 150, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Specialization");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 167, 90, 24);

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
        cSpecialization.setBounds(147, 170, 180, 22);

        txtUserName.setBackground(new java.awt.Color(153, 153, 255));
        txtUserName.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.add(txtUserName);
        txtUserName.setBounds(147, 100, 180, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system1/122.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(-6, 0, 540, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bCancelActionPerformed

    private void bOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOkActionPerformed

        if (txtUserName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter user name", "Error", JOptionPane.ERROR_MESSAGE);
            return;

        }
        String Password = String.valueOf(txtPassword.getPassword());
        if (Password.equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter password", "Error", JOptionPane.ERROR_MESSAGE);
            return;

        }
        con = Connect.ConnectDB();
        String sql = "select * from Users where UserName= '" + txtUserName.getText() + "' and Password ='" + txtPassword.getText() + "' and Specialization='" + cSpecialization.getSelectedItem().toString() + "'";
        String sql2 = "select Specialization from Users where UserName= '" + txtUserName.getText().toString() + "'";

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            pst2 = con.prepareStatement(sql2);
            rs2 = pst2.executeQuery();
            if (rs.next()) {

                if (cSpecialization.getSelectedItem().toString().equals("Admin")) {
                   
                    this.hide();

                    Home frm = new Home();
                    frm.setVisible(true);
                    frm.mReception.setEnabled(false);
                    frm.mDoctor.setEnabled(false);
                    frm.mNurse.setEnabled(false);
                    frm.mPharmacy.setEnabled(false);
                    frm.mAccountancy.setEnabled(false);
                    frm.mLab.setEnabled(false);
                    frm.mXray.setEnabled(false);
                } else if (cSpecialization.getSelectedItem().toString().equals("Receptionist")) {

                    this.hide();
                    Home frm = new Home();
                    frm.setVisible(true);
                    frm.mAdmin.setEnabled(false);
                    frm.mDoctor.setEnabled(false);
                    frm.mNurse.setEnabled(false);
                    frm.mPharmacy.setEnabled(false);
                    frm.mAccountancy.setEnabled(false);
                    frm.mLab.setEnabled(false);
                    frm.mXray.setEnabled(false);
                } else if (cSpecialization.getSelectedItem().toString().equals("Doctor")) {
                    this.hide();
                    Home frm = new Home();
                    frm.setVisible(true);
                    frm.mReception.setEnabled(false);
                    frm.mAdmin.setEnabled(false);
                    frm.mNurse.setEnabled(false);
                    frm.mPharmacy.setEnabled(false);
                    frm.mAccountancy.setEnabled(false);
                    frm.mLab.setEnabled(false);
                    frm.mXray.setEnabled(false);
                } else if (cSpecialization.getSelectedItem().toString().equals("Nurse")) {
                    this.hide();
                    Home frm = new Home();
                    frm.setVisible(true);
                    frm.mReception.setEnabled(false);
                    frm.mDoctor.setEnabled(false);
                    frm.mAdmin.setEnabled(false);
                    frm.mPharmacy.setEnabled(false);
                    frm.mAccountancy.setEnabled(false);
                    frm.mLab.setEnabled(false);
                    frm.mXray.setEnabled(false);
                } else if (cSpecialization.getSelectedItem().toString().equals("Pharmacist")) {
                    this.hide();
                    Home frm = new Home();
                    frm.setVisible(true);
                    frm.mReception.setEnabled(false);
                    frm.mDoctor.setEnabled(false);
                    frm.mNurse.setEnabled(false);
                    frm.mAdmin.setEnabled(false);
                    frm.mAccountancy.setEnabled(false);
                    frm.mLab.setEnabled(false);
                    frm.mXray.setEnabled(false);
                } else if (cSpecialization.getSelectedItem().toString().equals("Accountant")) {
                    this.hide();
                    Home frm = new Home();
                    frm.setVisible(true);
                    frm.mReception.setEnabled(false);
                    frm.mDoctor.setEnabled(false);
                    frm.mNurse.setEnabled(false);
                    frm.mPharmacy.setEnabled(false);
                    frm.mAdmin.setEnabled(false);
                    frm.mLab.setEnabled(false);
                    frm.mXray.setEnabled(false);
                }
                 else if (cSpecialization.getSelectedItem().toString().equals("Lab")) {
                    this.hide();
                    Home frm = new Home();
                    frm.setVisible(true);
                    frm.mReception.setEnabled(false);
                    frm.mDoctor.setEnabled(false);
                    frm.mNurse.setEnabled(false);
                    frm.mPharmacy.setEnabled(false);
                    frm.mAdmin.setEnabled(false);
                    frm.mXray.setEnabled(false);
                    frm.mLab.setEnabled(true);
                    frm.mAccountancy.setEnabled(false);

              
                }
                 else if (cSpecialization.getSelectedItem().toString().equals("X-Ray")) {
                    this.hide();
                    Home frm = new Home();
                    frm.setVisible(true);
                    frm.mReception.setEnabled(false);
                    frm.mDoctor.setEnabled(false);
                    frm.mNurse.setEnabled(false);
                    frm.mPharmacy.setEnabled(false);
                    frm.mAdmin.setEnabled(false);
                    frm.mLab.setEnabled(false);
                    frm.mXray.setEnabled(true);
                    frm.mAccountancy.setEnabled(false);


              
                }


            }         
            else {

                JOptionPane.showMessageDialog(null, "Login Failed..Try again !", "Access denied", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);

        }



    }//GEN-LAST:event_bOkActionPerformed
    private void bChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChangePasswordActionPerformed
        ChangePassword f = new ChangePassword();
        f.setVisible(true);



    }//GEN-LAST:event_bChangePasswordActionPerformed

    private void bOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bOkMouseClicked
    }//GEN-LAST:event_bOkMouseClicked

    private void bCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCancelMouseClicked

        System.exit(0);


    }//GEN-LAST:event_bCancelMouseClicked

    private void cSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cSpecializationActionPerformed
    }//GEN-LAST:event_cSpecializationActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bChangePassword;
    private javax.swing.JButton bOk;
    private javax.swing.JComboBox cSpecialization;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtUserName;
    // End of variables declaration//GEN-END:variables
}
