package hospital.management.system1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class PatientInfoTableforReception extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    ResultSet rs2 = null;
    PreparedStatement pst2 = null;

    public PatientInfoTableforReception() {
        initComponents();
        // GetData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        bSearch = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patient Info");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jTable1.setBackground(new java.awt.Color(102, 255, 255));
        jTable1.setToolTipText("");
        jTable1.setName("tabPatientInfo"); // NOI18N
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("ID");

        bSearch.setBackground(new java.awt.Color(153, 153, 255));
        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });

        txtID.setBackground(new java.awt.Color(153, 153, 255));
        txtID.setForeground(new java.awt.Color(51, 51, 255));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1539, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSearch)))
                .addGap(148, 148, 148))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

      Reception f=new Reception();
      f.setVisible(true);
    

    }//GEN-LAST:event_formWindowClosing

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        try {
            con = Connect.ConnectDB();
            int row = jTable1.getSelectedRow();
            String table_click = jTable1.getModel().getValueAt(row, 0).toString();
            
       // String sql = "select Patient0.PatientId, Patient0.Name ,Patient0.FatherName ,Patient0.Department ,Patient0.FamilyName ,Patient0.Mobile  , Patient0.Email,Patient0.Address ,Patient0.Age ,Patient0.Gender ,Patient0.BloodGroup ,Patient0.RemarkFromDoctorToReception ,Patient0.RemarkToReceptionFromAccountant ,Patient0.RoomNumber ,Patient0.PatientStatus ,Patient0.DateOfJoining,Room.Department,Room.Type , Patient0.Disease ,Room.Cost,Patient0.Disease ,Room.Department from Patient0,Room where Patient0.PatientId = '" + table_click +"'";

           String sql = "select * from Patient0 where PatientId = '" + table_click + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                this.hide();
                Reception frm = new Reception();
                frm.setVisible(true);
                String add1 = rs.getString("Patient0.PatientId");
                frm.txtPatientId.setText(add1);
                String add2 = rs.getString("Patient0.Name");
                frm.txtName.setText(add2);
                String add3 = rs.getString("Patient0.FatherName");
                frm.txtFatherName.setText(add3);
                String add4 = rs.getString("Patient0.FamilyName");
                frm.txtFamilyName.setText(add4);
                String add5 = rs.getString("Patient0.Mobile");
                frm.txtMobile.setText(add5);
                String add6 = rs.getString("Patient0.Email");
                frm.txtEmail.setText(add6);
                String add7 = rs.getString("Patient0.Address");
                frm.txtAddress.setText(add7);
                String add8 = rs.getString("Patient0.Age");
                frm.txtAge.setText(add8);
                String add9 = rs.getString("Patient0.Gender");
                frm.cGender.setSelectedItem(add9);
                String add10 = rs.getString("Patient0.BloodGroup");
                frm.cBloodGroup.setSelectedItem(add10);
                String add11 = rs.getString("Patient0.PatientStatus");
                frm.txtPatientStatus.setText(add11);
                String add12 = rs.getString("Patient0.RemarkFromDoctorToReception");
                frm.txtRemarkFromDoctor.setText(add12);
                String add13 = rs.getString("Patient0.RemarkToReceptionFromAccountant");
                frm.txtRemarkFromAccountancy.setText(add13);
                String add14 = rs.getString("Patient0.RoomNumber");
                frm.txtRoomNumber.setText(add14);
                 String add15 = rs.getString("Patient0.Department");
                frm.cDepartment.setSelectedItem(add15);
               // String add15 = rs.getString("Room.Department");
               // frm.cDepartment.setSelectedItem(add15);
                String add16 = rs.getString("Patient0.DateOfJoining");
                frm.txtDateOfJoining.setText(add16);
               // String add17 = rs.getString("Room.Type");
                //frm.cRoomType.setSelectedItem(add17);
               // String add18 = rs.getString("Room.Cost");
                //frm.txtRoomCost.setText(add18);
                String add19 = rs.getString("Patient0.Disease");
                frm.txtDisease.setText(add19);
                frm.bUpdate.setEnabled(true);
                frm.bSave.setEnabled(false);


            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed


      //  String sql = "select Patient0.PatientId as'Patient ID', Patient0.Name as'Name',Patient0.FatherName as'Father Name' ,Patient0.FamilyName as'Family Name' ,Patient0.Mobile as'Mobile' , Patient0.Email as'Email',Patient0.Address as'Address' ,Patient0.Age as'Age',Patient0.Gender as'Gender' ,Patient0.BloodGroup as'Blood Group',Patient0.RemarkFromDoctorToReception as'Remark From Doctor To Reception' ,Patient0.RemarkToReceptionFromAccountant as'Remark To Reception From Accountant',Patient0.RoomNumber as'Room Number',Patient0.PatientStatus as'Patient Status' ,Patient0.DateOfJoining  as 'Date Of Joining',Room.Department as'Department',Room.Type as'Type', Patient0.Disease as 'Disease',Room.Cost as'Cost' from Patient0,Room where Patient0.PatientId = '" + txtID.getText().toString()+ "'";
       String sql = "select Patient0.PatientId as'Patient ID', Patient0.Name as'Name',Patient0.Department as'Department',Patient0.FatherName as'Father Name' ,Patient0.FamilyName as'Family Name' ,Patient0.Mobile as'Mobile' , Patient0.Email as'Email',Patient0.Address as'Address' ,Patient0.Age as'Age',Patient0.Gender as'Gender' ,Patient0.BloodGroup as'Blood Group',Patient0.RemarkFromDoctorToReception as'Remark From Doctor To Reception' ,Patient0.RemarkToReceptionFromAccountant as'Remark To Reception from Accountant',Patient0.RoomNumber as'Room Number',Patient0.PatientStatus as'Patient Status' ,Patient0.DateOfJoining  as 'Date Of Joining', Patient0.Disease as 'Disease' from Patient0 where Patient0.PatientId = '" + txtID.getText().toString()+ "'";

        try {
            con = Connect.ConnectDB();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_bSearchActionPerformed

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
            java.util.logging.Logger.getLogger(PatientInfoTableforReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientInfoTableforReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientInfoTableforReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientInfoTableforReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientInfoTableforReception().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSearch;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
