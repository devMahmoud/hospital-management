package hospital.management.system1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.text.html.CSS;
import sun.security.pkcs11.Secmod;
import net.proteanit.sql.DbUtils;

public class StaffInfoTable extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public StaffInfoTable() {


        initComponents();
        // GetData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        bSearch = new javax.swing.JButton();
        cSpecialization = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Staff Information");
        setBounds(new java.awt.Rectangle(120, 0, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jTable1.setBackground(new java.awt.Color(102, 255, 255));
        jTable1.setToolTipText("");
        jTable1.setName("tabStaffInfo"); // NOI18N
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("ID");

        txtId.setBackground(new java.awt.Color(153, 153, 255));
        txtId.setForeground(new java.awt.Color(51, 51, 255));

        bSearch.setBackground(new java.awt.Color(153, 153, 255));
        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });

        cSpecialization.setBackground(new java.awt.Color(153, 153, 255));
        cSpecialization.setForeground(new java.awt.Color(0, 0, 255));
        cSpecialization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Doctor", "Nurse", "Pharmacist", "Receptionist", "Accountant", "Lab", "X-Ray", "" }));
        cSpecialization.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSearch)
                .addContainerGap(487, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSearch)
                    .addComponent(cSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
   
        if(cSpecialization.getSelectedItem().toString().equals("Admin")){
        try {
            con = Connect.ConnectDB();
            int row = jTable1.getSelectedRow();
            String table_click = jTable1.getModel().getValueAt(row, 0).toString();
            String sql = "select * from Admin where AdminId = '" + table_click + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                this.hide();
                AddStaffInfo frm = new AddStaffInfo();
                frm.setVisible(true);
                String add1 = rs.getString("AdminId");
                frm.txtStaffId.setText(add1);
                String add2 = rs.getString("Name");
                frm.txtName.setText(add2);
                String add3 = rs.getString("FatherName");
                frm.txtFatherName.setText(add3);
                String add4 = rs.getString("FamilyName");
                frm.txtFamilyName.setText(add4);
                String add5 = rs.getString("Mobile");
                frm.txtMobile.setText(add5);
                String add6 = rs.getString("Email");
                frm.txtEmail.setText(add6);
                String add7 = rs.getString("Address");
                frm.txtAddress.setText(add7);
                String add8 = rs.getString("DateOfJoining");
                frm.txtDateOfJoining.setText(add8);
                String add9 = rs.getString("Specialization");
                frm.cSpecialization.setSelectedItem(add9);
                String add10 = rs.getString("Gender");
                frm.cGender.setSelectedItem(add10);
                String add11 = rs.getString("BloodGroup");
                frm.cBloodGroup.setSelectedItem(add11);
                frm.bUpdate.setEnabled(true);
                frm.bDelete.setEnabled(true);
                frm.bSave.setEnabled(false);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        }
         if(cSpecialization.getSelectedItem().toString().equals("Doctor")){
        try {
            con = Connect.ConnectDB();
            int row = jTable1.getSelectedRow();
            String table_click = jTable1.getModel().getValueAt(row, 0).toString();
            String sql = "select * from Doctor where DoctorId = '" + table_click + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                this.hide();
                AddStaffInfo frm = new AddStaffInfo();
                frm.setVisible(true);
                String add1 = rs.getString("DoctorId");
                frm.txtStaffId.setText(add1);
                String add2 = rs.getString("Name");
                frm.txtName.setText(add2);
                String add3 = rs.getString("FatherName");
                frm.txtFatherName.setText(add3);
                String add4 = rs.getString("FamilyName");
                frm.txtFamilyName.setText(add4);
                String add5 = rs.getString("Mobile");
                frm.txtMobile.setText(add5);
                String add6 = rs.getString("Email");
                frm.txtEmail.setText(add6);
                String add7 = rs.getString("Address");
                frm.txtAddress.setText(add7);
                String add8 = rs.getString("DateOfJoining");
                frm.txtDateOfJoining.setText(add8);
                String add9 = rs.getString("Specialization");
                frm.cSpecialization.setSelectedItem(add9);
                String add10 = rs.getString("Gender");
                frm.cGender.setSelectedItem(add10);
                String add11 = rs.getString("BloodGroup");
                frm.cBloodGroup.setSelectedItem(add11);
                frm.bUpdate.setEnabled(true);
                frm.bDelete.setEnabled(true);
                frm.bSave.setEnabled(false);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        }
      if(cSpecialization.getSelectedItem().toString().equals("Nurse")){
        try {
            con = Connect.ConnectDB();
            int row = jTable1.getSelectedRow();
            String table_click = jTable1.getModel().getValueAt(row, 0).toString();
            String sql = "select * from Nurse where NurseId = '" + table_click + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                this.hide();
                AddStaffInfo frm = new AddStaffInfo();
                frm.setVisible(true);
                String add1 = rs.getString("NurseId");
                frm.txtStaffId.setText(add1);
                String add2 = rs.getString("Name");
                frm.txtName.setText(add2);
                String add3 = rs.getString("FatherName");
                frm.txtFatherName.setText(add3);
                String add4 = rs.getString("FamilyName");
                frm.txtFamilyName.setText(add4);
                String add5 = rs.getString("Mobile");
                frm.txtMobile.setText(add5);
                String add6 = rs.getString("Email");
                frm.txtEmail.setText(add6);
                String add7 = rs.getString("Address");
                frm.txtAddress.setText(add7);
                String add8 = rs.getString("DateOfJoining");
                frm.txtDateOfJoining.setText(add8);
                String add9 = rs.getString("Specialization");
                frm.cSpecialization.setSelectedItem(add9);
                String add10 = rs.getString("Gender");
                frm.cGender.setSelectedItem(add10);
                String add11 = rs.getString("BloodGroup");
                frm.cBloodGroup.setSelectedItem(add11);
                frm.bUpdate.setEnabled(true);
                frm.bDelete.setEnabled(true);
                frm.bSave.setEnabled(false);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        }
       if(cSpecialization.getSelectedItem().toString().equals("Receptionist")){
        try {
            con = Connect.ConnectDB();
            int row = jTable1.getSelectedRow();
            String table_click = jTable1.getModel().getValueAt(row, 0).toString();
            String sql = "select * from Receptionist where ReceptionistId = '" + table_click + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                this.hide();
                AddStaffInfo frm = new AddStaffInfo();
                frm.setVisible(true);
                String add1 = rs.getString("ReceptionistId");
                frm.txtStaffId.setText(add1);
                String add2 = rs.getString("Name");
                frm.txtName.setText(add2);
                String add3 = rs.getString("FatherName");
                frm.txtFatherName.setText(add3);
                String add4 = rs.getString("FamilyName");
                frm.txtFamilyName.setText(add4);
                String add5 = rs.getString("Mobile");
                frm.txtMobile.setText(add5);
                String add6 = rs.getString("Email");
                frm.txtEmail.setText(add6);
                String add7 = rs.getString("Address");
                frm.txtAddress.setText(add7);
                String add8 = rs.getString("DateOfJoining");
                frm.txtDateOfJoining.setText(add8);
                String add9 = rs.getString("Specialization");
                frm.cSpecialization.setSelectedItem(add9);
                String add10 = rs.getString("Gender");
                frm.cGender.setSelectedItem(add10);
                String add11 = rs.getString("BloodGroup");
                frm.cBloodGroup.setSelectedItem(add11);
                frm.bUpdate.setEnabled(true);
                frm.bDelete.setEnabled(true);
                frm.bSave.setEnabled(false);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        }
        if(cSpecialization.getSelectedItem().toString().equals("Pharmacist")){
        try {
            con = Connect.ConnectDB();
            int row = jTable1.getSelectedRow();
            String table_click = jTable1.getModel().getValueAt(row, 0).toString();
            String sql = "select * from Pharmacist where PharmacistId = '" + table_click + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                this.hide();
                AddStaffInfo frm = new AddStaffInfo();
                frm.setVisible(true);
                String add1 = rs.getString("PharmacistId");
                frm.txtStaffId.setText(add1);
                String add2 = rs.getString("Name");
                frm.txtName.setText(add2);
                String add3 = rs.getString("FatherName");
                frm.txtFatherName.setText(add3);
                String add4 = rs.getString("FamilyName");
                frm.txtFamilyName.setText(add4);
                String add5 = rs.getString("Mobile");
                frm.txtMobile.setText(add5);
                String add6 = rs.getString("Email");
                frm.txtEmail.setText(add6);
                String add7 = rs.getString("Address");
                frm.txtAddress.setText(add7);
                String add8 = rs.getString("DateOfJoining");
                frm.txtDateOfJoining.setText(add8);
                String add9 = rs.getString("Specialization");
                frm.cSpecialization.setSelectedItem(add9);
                String add10 = rs.getString("Gender");
                frm.cGender.setSelectedItem(add10);
                String add11 = rs.getString("BloodGroup");
                frm.cBloodGroup.setSelectedItem(add11);
                frm.bUpdate.setEnabled(true);
                frm.bDelete.setEnabled(true);
                frm.bSave.setEnabled(false);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        }
         if(cSpecialization.getSelectedItem().toString().equals("Accountant")){
        try {
            con = Connect.ConnectDB();
            int row = jTable1.getSelectedRow();
            String table_click = jTable1.getModel().getValueAt(row, 0).toString();
            String sql = "select * from Accountant where AccountantId = '" + table_click + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                this.hide();
                AddStaffInfo frm = new AddStaffInfo();
                frm.setVisible(true);
                String add1 = rs.getString("AccountantId");
                frm.txtStaffId.setText(add1);
                String add2 = rs.getString("Name");
                frm.txtName.setText(add2);
                String add3 = rs.getString("FatherName");
                frm.txtFatherName.setText(add3);
                String add4 = rs.getString("FamilyName");
                frm.txtFamilyName.setText(add4);
                String add5 = rs.getString("Mobile");
                frm.txtMobile.setText(add5);
                String add6 = rs.getString("Email");
                frm.txtEmail.setText(add6);
                String add7 = rs.getString("Address");
                frm.txtAddress.setText(add7);
                String add8 = rs.getString("DateOfJoining");
                frm.txtDateOfJoining.setText(add8);
                String add9 = rs.getString("Specialization");
                frm.cSpecialization.setSelectedItem(add9);
                String add10 = rs.getString("Gender");
                frm.cGender.setSelectedItem(add10);
                String add11 = rs.getString("BloodGroup");
                frm.cBloodGroup.setSelectedItem(add11);
                frm.bUpdate.setEnabled(true);
                frm.bDelete.setEnabled(true);
                frm.bSave.setEnabled(false);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        }
          if(cSpecialization.getSelectedItem().toString().equals("Lab")){
        try {
            con = Connect.ConnectDB();
            int row = jTable1.getSelectedRow();
            String table_click = jTable1.getModel().getValueAt(row, 0).toString();
            String sql = "select * from Lap where LabId = '" + table_click + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                this.hide();
                AddStaffInfo frm = new AddStaffInfo();
                frm.setVisible(true);
                String add1 = rs.getString("LabId");
                frm.txtStaffId.setText(add1);
                String add2 = rs.getString("Name");
                frm.txtName.setText(add2);
                String add3 = rs.getString("FatherName");
                frm.txtFatherName.setText(add3);
                String add4 = rs.getString("FamilyName");
                frm.txtFamilyName.setText(add4);
                String add5 = rs.getString("Mobile");
                frm.txtMobile.setText(add5);
                String add6 = rs.getString("Email");
                frm.txtEmail.setText(add6);
                String add7 = rs.getString("Address");
                frm.txtAddress.setText(add7);
                String add8 = rs.getString("DateOfJoining");
                frm.txtDateOfJoining.setText(add8);
                String add9 = rs.getString("Specialization");
                frm.cSpecialization.setSelectedItem(add9);
                String add10 = rs.getString("Gender");
                frm.cGender.setSelectedItem(add10);
                String add11 = rs.getString("BloodGroup");
                frm.cBloodGroup.setSelectedItem(add11);
                frm.bUpdate.setEnabled(true);
                frm.bDelete.setEnabled(true);
                frm.bSave.setEnabled(false);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        }
           if(cSpecialization.getSelectedItem().toString().equals("X-Ray")){
        try {
            con = Connect.ConnectDB();
            int row = jTable1.getSelectedRow();
            String table_click = jTable1.getModel().getValueAt(row, 0).toString();
            String sql = "select * from Xray where XrayId = '" + table_click + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                this.hide();
                AddStaffInfo frm = new AddStaffInfo();
                frm.setVisible(true);
                String add1 = rs.getString("XrayId");
                frm.txtStaffId.setText(add1);
                String add2 = rs.getString("Name");
                frm.txtName.setText(add2);
                String add3 = rs.getString("FatherName");
                frm.txtFatherName.setText(add3);
                String add4 = rs.getString("FamilyName");
                frm.txtFamilyName.setText(add4);
                String add5 = rs.getString("Mobile");
                frm.txtMobile.setText(add5);
                String add6 = rs.getString("Email");
                frm.txtEmail.setText(add6);
                String add7 = rs.getString("Address");
                frm.txtAddress.setText(add7);
                String add8 = rs.getString("DateOfJoining");
                frm.txtDateOfJoining.setText(add8);
                String add9 = rs.getString("Specialization");
                frm.cSpecialization.setSelectedItem(add9);
                String add10 = rs.getString("Gender");
                frm.cGender.setSelectedItem(add10);
                String add11 = rs.getString("BloodGroup");
                frm.cBloodGroup.setSelectedItem(add11);
                frm.bUpdate.setEnabled(true);
                frm.bDelete.setEnabled(true);
                frm.bSave.setEnabled(false);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //this.hide(); 

        AddStaffInfo frm = new AddStaffInfo();



       frm.setVisible(true);    }//GEN-LAST:event_formWindowClosing

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
     if(cSpecialization.getSelectedItem().toString().equals("Admin")){
        try {

            con = Connect.ConnectDB();
            String sql = "select * from Admin  where AdminId = '" + txtId.getText() + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
     }
     if(cSpecialization.getSelectedItem().toString().equals("Doctor")){
        try {

            con = Connect.ConnectDB();
            String sql = "select * from Doctor  where DoctorId = '" + txtId.getText() + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
     }
     
if(cSpecialization.getSelectedItem().toString().equals("Nurse")){
        try {

            con = Connect.ConnectDB();
            String sql = "select * from Nurse  where NurseId = '" + txtId.getText() + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
     }     
if(cSpecialization.getSelectedItem().toString().equals("Receptionist")){
        try {

            con = Connect.ConnectDB();
            String sql = "select * from Receptionist  where ReceptionistId = '" + txtId.getText() + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
     }
if(cSpecialization.getSelectedItem().toString().equals("Pharmacist")){
        try {

            con = Connect.ConnectDB();
            String sql = "select * from Pharmacist  where PharmacistId = '" + txtId.getText() + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
     }
if(cSpecialization.getSelectedItem().toString().equals("Accountant")){
        try {

            con = Connect.ConnectDB();
            String sql = "select * from Accountant  where AccountantId = '" + txtId.getText() + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
     }
  if(cSpecialization.getSelectedItem().toString().equals("Lab")){
        try {

            con = Connect.ConnectDB();
            String sql = "select * from Lap  where LabId = '" + txtId.getText() + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
     }
    if(cSpecialization.getSelectedItem().toString().equals("X-Ray")){
        try {

            con = Connect.ConnectDB();
            String sql = "select * from Xray  where XrayId = '" + txtId.getText() + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
     }
     
    }//GEN-LAST:event_bSearchActionPerformed
    /*
     private void GetData() {
     String sql = "select *from Staff ";
     try {

     con = Connect.ConnectDB();
     pst = con.prepareStatement(sql);
     rs = pst.executeQuery();
     jTable1.setModel(DbUtils.resultSetToTableModel(rs));
     } catch (Exception e) {
     JOptionPane.showMessageDialog(null, e.getMessage());

     }
     }
     * */

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
            java.util.logging.Logger.getLogger(StaffInfoTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffInfoTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffInfoTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffInfoTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffInfoTable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSearch;
    private javax.swing.JComboBox cSpecialization;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
