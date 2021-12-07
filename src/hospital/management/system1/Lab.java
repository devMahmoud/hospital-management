package hospital.management.system1;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Lab extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement stmt;

    public Lab() {
        initComponents();
        txtRemarkFromDoctor.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtDiease = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReamarkToDoctor = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRemarkFromDoctor = new javax.swing.JTextArea();
        bGetData = new javax.swing.JButton();
        bNew = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lab");
        setBounds(new java.awt.Rectangle(300, 0, 0, 0));
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Patient ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 57, 118, 22);

        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 85, 118, 22);

        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Disease");
        jLabel6.setName(""); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 113, 118, 20);

        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Remark From  Doctor ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 151, 138, 22);

        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Remark To Doctor");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 313, 118, 22);

        txtPatientId.setBackground(new java.awt.Color(153, 153, 255));
        txtPatientId.setForeground(new java.awt.Color(51, 51, 255));
        txtPatientId.setName("txtPatientId"); // NOI18N
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtPatientId);
        txtPatientId.setBounds(152, 58, 226, 20);

        txtName.setBackground(new java.awt.Color(153, 153, 255));
        txtName.setForeground(new java.awt.Color(51, 51, 255));
        txtName.setName("txtName"); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName);
        txtName.setBounds(152, 86, 226, 20);

        txtDiease.setBackground(new java.awt.Color(153, 153, 255));
        txtDiease.setForeground(new java.awt.Color(51, 51, 255));
        txtDiease.setName("txtDisease"); // NOI18N
        txtDiease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDieaseActionPerformed(evt);
            }
        });
        jPanel1.add(txtDiease);
        txtDiease.setBounds(152, 113, 226, 20);

        txtReamarkToDoctor.setBackground(new java.awt.Color(153, 153, 255));
        txtReamarkToDoctor.setColumns(20);
        txtReamarkToDoctor.setForeground(new java.awt.Color(51, 51, 255));
        txtReamarkToDoctor.setRows(5);
        txtReamarkToDoctor.setName("txtRemarkToDoctor"); // NOI18N
        jScrollPane1.setViewportView(txtReamarkToDoctor);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(152, 313, 226, 143);

        txtRemarkFromDoctor.setBackground(new java.awt.Color(153, 153, 255));
        txtRemarkFromDoctor.setColumns(20);
        txtRemarkFromDoctor.setForeground(new java.awt.Color(51, 51, 255));
        txtRemarkFromDoctor.setRows(5);
        txtRemarkFromDoctor.setName("txtRemarkFromDoctor"); // NOI18N
        jScrollPane2.setViewportView(txtRemarkFromDoctor);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(150, 154, 227, 143);

        bGetData.setBackground(new java.awt.Color(153, 153, 255));
        bGetData.setText("Get Data");
        bGetData.setName("bGetDate"); // NOI18N
        bGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGetDataActionPerformed(evt);
            }
        });
        jPanel1.add(bGetData);
        bGetData.setBounds(410, 90, 138, 23);

        bNew.setBackground(new java.awt.Color(153, 153, 255));
        bNew.setText("New");
        bNew.setName("bNew"); // NOI18N
        bNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewActionPerformed(evt);
            }
        });
        jPanel1.add(bNew);
        bNew.setBounds(410, 120, 138, 23);

        bUpdate.setBackground(new java.awt.Color(153, 153, 255));
        bUpdate.setText("Send Message");
        bUpdate.setName("bUpdate"); // NOI18N
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(bUpdate);
        bUpdate.setBounds(410, 60, 138, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system1/lap1.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-6, 0, 700, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtDieaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDieaseActionPerformed
    }//GEN-LAST:event_txtDieaseActionPerformed

    private void bGetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGetDataActionPerformed
      this.hide();
        PatientInfoTableForLap f = new PatientInfoTableForLap();
        f.setVisible(true);
    }//GEN-LAST:event_bGetDataActionPerformed

    private void bNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewActionPerformed

        reset();
    }//GEN-LAST:event_bNewActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed

        try {
            
             if (txtPatientId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter patient id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter patient  name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            
            con = Connect.ConnectDB();
            String sql = "update Patient0 set RemarkToDoctorFromLab ='" + txtReamarkToDoctor.getText().toString() + "' where PatientId='" + txtPatientId.getText().toString() + "'";

            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Successfully updated", "Patient0 Record", JOptionPane.INFORMATION_MESSAGE);
            bUpdate.setEnabled(false);

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_bUpdateActionPerformed
    private void reset() {
        txtPatientId.setText("");
        txtName.setText("");
        txtDiease.setText("");
        txtRemarkFromDoctor.setText("");
        txtReamarkToDoctor.setText("");
        bUpdate.setEnabled(false);
        txtPatientId.requestDefaultFocus();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bGetData;
    public javax.swing.JButton bNew;
    public javax.swing.JButton bUpdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField txtDiease;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtPatientId;
    public javax.swing.JTextArea txtReamarkToDoctor;
    public javax.swing.JTextArea txtRemarkFromDoctor;
    // End of variables declaration//GEN-END:variables
}
