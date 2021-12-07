
package hospital.management.system1;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class AddStaffInfo extends javax.swing.JFrame {
     
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    Statement stmt;
    public AddStaffInfo() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtStaffId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtFatherName = new javax.swing.JTextField();
        txtFamilyName = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        cSpecialization = new javax.swing.JComboBox();
        cGender = new javax.swing.JComboBox();
        cBloodGroup = new javax.swing.JComboBox();
        bSave = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bNew = new javax.swing.JButton();
        bGetData = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cYear = new javax.swing.JComboBox();
        cMounth = new javax.swing.JComboBox();
        cDay = new javax.swing.JComboBox();
        txtDateOfJoining = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Staff Info");
        setBounds(new java.awt.Rectangle(250, 0, 0, 0));
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Staff ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 57, 118, 22);

        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 86, 118, 22);

        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Father's Nmae");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 115, 118, 22);

        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Family's Name");
        jLabel6.setName(""); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 144, 118, 22);

        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Mobile");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 173, 118, 22);

        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Email");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 202, 118, 22);

        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Address");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 230, 118, 22);

        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Specialization");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 286, 118, 22);

        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Date Of Joining");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 258, 118, 22);

        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Gender");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 314, 118, 22);

        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Blood Group");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 346, 118, 22);

        txtStaffId.setBackground(new java.awt.Color(153, 153, 255));
        txtStaffId.setForeground(new java.awt.Color(51, 51, 255));
        txtStaffId.setName("txtStaffId"); // NOI18N
        txtStaffId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStaffIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtStaffId);
        txtStaffId.setBounds(152, 58, 226, 20);

        txtName.setBackground(new java.awt.Color(153, 153, 255));
        txtName.setForeground(new java.awt.Color(51, 51, 255));
        txtName.setName("txtName"); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName);
        txtName.setBounds(152, 87, 226, 20);

        txtFatherName.setBackground(new java.awt.Color(153, 153, 255));
        txtFatherName.setForeground(new java.awt.Color(51, 51, 255));
        txtFatherName.setName("txtFatherNmae"); // NOI18N
        txtFatherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFatherNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtFatherName);
        txtFatherName.setBounds(152, 116, 226, 20);

        txtFamilyName.setBackground(new java.awt.Color(153, 153, 255));
        txtFamilyName.setForeground(new java.awt.Color(51, 51, 255));
        txtFamilyName.setName("txtFamilyName"); // NOI18N
        txtFamilyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFamilyNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtFamilyName);
        txtFamilyName.setBounds(152, 145, 226, 20);

        txtMobile.setBackground(new java.awt.Color(153, 153, 255));
        txtMobile.setForeground(new java.awt.Color(51, 51, 255));
        txtMobile.setName("txtMobile"); // NOI18N
        txtMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileActionPerformed(evt);
            }
        });
        jPanel1.add(txtMobile);
        txtMobile.setBounds(152, 174, 226, 20);

        txtEmail.setBackground(new java.awt.Color(153, 153, 255));
        txtEmail.setForeground(new java.awt.Color(51, 51, 255));
        txtEmail.setName("txtEmail"); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail);
        txtEmail.setBounds(152, 203, 226, 20);

        txtAddress.setBackground(new java.awt.Color(153, 153, 255));
        txtAddress.setForeground(new java.awt.Color(51, 51, 255));
        txtAddress.setName("txtAddress"); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel1.add(txtAddress);
        txtAddress.setBounds(152, 231, 226, 20);

        cSpecialization.setBackground(new java.awt.Color(153, 153, 255));
        cSpecialization.setForeground(new java.awt.Color(51, 51, 255));
        cSpecialization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Doctor", "Nurse", "Pharmacist", "Receptionist", "Accountant", "Lab", "X-Ray" }));
        cSpecialization.setSelectedIndex(-1);
        cSpecialization.setName("cSpecialization"); // NOI18N
        cSpecialization.setRequestFocusEnabled(false);
        cSpecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cSpecializationActionPerformed(evt);
            }
        });
        jPanel1.add(cSpecialization);
        cSpecialization.setBounds(152, 286, 230, 22);

        cGender.setBackground(new java.awt.Color(153, 153, 255));
        cGender.setForeground(new java.awt.Color(51, 51, 255));
        cGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mail", "Femail" }));
        cGender.setSelectedIndex(-1);
        cGender.setName("txtGender"); // NOI18N
        cGender.setRequestFocusEnabled(false);
        cGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cGenderActionPerformed(evt);
            }
        });
        jPanel1.add(cGender);
        cGender.setBounds(152, 314, 230, 22);

        cBloodGroup.setBackground(new java.awt.Color(153, 153, 255));
        cBloodGroup.setForeground(new java.awt.Color(51, 51, 255));
        cBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        cBloodGroup.setSelectedIndex(-1);
        cBloodGroup.setName("cBloodGroup"); // NOI18N
        cBloodGroup.setRequestFocusEnabled(false);
        cBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBloodGroupActionPerformed(evt);
            }
        });
        jPanel1.add(cBloodGroup);
        cBloodGroup.setBounds(152, 346, 230, 22);

        bSave.setBackground(new java.awt.Color(153, 153, 255));
        bSave.setText("Save");
        bSave.setName("bSave"); // NOI18N
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });
        jPanel1.add(bSave);
        bSave.setBounds(498, 57, 138, 23);

        bDelete.setBackground(new java.awt.Color(153, 153, 255));
        bDelete.setText("Delete");
        bDelete.setName("bDelete"); // NOI18N
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(bDelete);
        bDelete.setBounds(498, 86, 138, 23);

        bUpdate.setBackground(new java.awt.Color(153, 153, 255));
        bUpdate.setText("Update");
        bUpdate.setName("bUpdate"); // NOI18N
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(bUpdate);
        bUpdate.setBounds(498, 115, 138, 23);

        bNew.setBackground(new java.awt.Color(153, 153, 255));
        bNew.setText("New");
        bNew.setName("bNew"); // NOI18N
        bNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewActionPerformed(evt);
            }
        });
        jPanel1.add(bNew);
        bNew.setBounds(498, 144, 138, 23);

        bGetData.setBackground(new java.awt.Color(153, 153, 255));
        bGetData.setText("Get Data");
        bGetData.setName("bGetDate"); // NOI18N
        bGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGetDataActionPerformed(evt);
            }
        });
        jPanel1.add(bGetData);
        bGetData.setBounds(498, 173, 138, 23);

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(520, 40, 402, 230);

        cYear.setBackground(new java.awt.Color(153, 153, 255));
        cYear.setForeground(new java.awt.Color(51, 51, 255));
        cYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014-", "2015-", "2016-", "2017-", "2018-", "2020-", "2021-", "2022-", "2023-", "2024-", "2025-", "2026-", "2027-", "2028-", "2029-", "2030-" }));
        cYear.setSelectedIndex(-1);
        jPanel1.add(cYear);
        cYear.setBounds(150, 260, 80, 20);

        cMounth.setBackground(new java.awt.Color(153, 153, 255));
        cMounth.setForeground(new java.awt.Color(51, 51, 255));
        cMounth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1-", "2-", "3-", "4-", "5-", "6-", "7-", "8-", "9-", "10-", "11-", "12-" }));
        cMounth.setSelectedIndex(-1);
        jPanel1.add(cMounth);
        cMounth.setBounds(240, 260, 60, 20);

        cDay.setBackground(new java.awt.Color(153, 153, 255));
        cDay.setForeground(new java.awt.Color(51, 51, 255));
        cDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        cDay.setSelectedIndex(-1);
        jPanel1.add(cDay);
        cDay.setBounds(310, 260, 60, 20);

        txtDateOfJoining.setBackground(new java.awt.Color(153, 153, 255));
        txtDateOfJoining.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.add(txtDateOfJoining);
        txtDateOfJoining.setBounds(380, 260, 170, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system1/staff1.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-5, 0, 790, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStaffIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStaffIdActionPerformed
    }//GEN-LAST:event_txtStaffIdActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtFatherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFatherNameActionPerformed
    }//GEN-LAST:event_txtFatherNameActionPerformed

    private void txtFamilyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFamilyNameActionPerformed
    }//GEN-LAST:event_txtFamilyNameActionPerformed

    private void txtMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileActionPerformed
    }//GEN-LAST:event_txtMobileActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
    }//GEN-LAST:event_txtAddressActionPerformed

    private void cSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cSpecializationActionPerformed
    }//GEN-LAST:event_cSpecializationActionPerformed

    private void cGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cGenderActionPerformed
    }//GEN-LAST:event_cGenderActionPerformed

    private void cBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBloodGroupActionPerformed
    }//GEN-LAST:event_cBloodGroupActionPerformed

    private void bGetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGetDataActionPerformed
        this.hide();
        StaffInfoTable f = new StaffInfoTable();
        f.setVisible(true);
    }//GEN-LAST:event_bGetDataActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
           if(cSpecialization.getSelectedItem().toString().equals("Admin")){
        try{
            con=Connect.ConnectDB();
            if (txtStaffId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Admin id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Admin name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtFatherName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Father's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             if (txtFamilyName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Family's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
             }
              if (txtMobile.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter mobile number","Error", JOptionPane.ERROR_MESSAGE);
                return;
              }
                if (txtEmail.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter email","Error", JOptionPane.ERROR_MESSAGE);
                return;
              }
            if (txtAddress.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
   
       
       String sql1="Select AdminId from Admin where AdminId= '" + txtStaffId.getText() + "'";
      stmt= con.createStatement();
       rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Admin ID already exists","Error", JOptionPane.ERROR_MESSAGE);
        txtStaffId.setText("");
        txtStaffId.requestDefaultFocus();
       return;
      }
            String sql= "insert into Admin(AdminId,Name,FatherName,FamilyName,Mobile,Email,Address,DateOfJoining,Specialization,Gender,BloodGroup)values('"+ txtStaffId.getText() + "','"+ txtName.getText() + "','"+ txtFatherName.getText() + "','"+ txtFamilyName.getText() + "','"+ txtMobile.getText() + "','"+ txtEmail.getText() + "','"+ txtAddress.getText() + "','"+ cYear.getSelectedItem().toString()+cMounth.getSelectedItem().toString()+cDay.getSelectedItem().toString() + "','"+ cSpecialization.getSelectedItem().toString()+ "','" + cGender.getSelectedItem().toString() + "','"+ cBloodGroup.getSelectedItem().toString() + "' )";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully saved","Admin Record",JOptionPane.INFORMATION_MESSAGE);
            bSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_bSaveActionPerformed
    
    
     if(cSpecialization.getSelectedItem().toString().equals("Doctor")){
        try{
            con=Connect.ConnectDB();
            if (txtStaffId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter doctor id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter doctor name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtFatherName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Father's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             if (txtFamilyName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Family's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
             }
              if (txtMobile.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter mobile number","Error", JOptionPane.ERROR_MESSAGE);
                return;
              }
                if (txtEmail.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter email","Error", JOptionPane.ERROR_MESSAGE);
                return;
              }
            if (txtAddress.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
   
       
       String sql1="Select DoctorId from Doctor where DoctorId= '" + txtStaffId.getText() + "'";
      stmt= con.createStatement();
       rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Doctor ID already exists","Error", JOptionPane.ERROR_MESSAGE);
        txtStaffId.setText("");
        txtStaffId.requestDefaultFocus();
       return;
      }
            String sql= "insert into Doctor(DoctorId,Name,FatherName,FamilyName,Mobile,Email,Address,DateOfJoining,Specialization,Gender,BloodGroup)values('"+ txtStaffId.getText() + "','"+ txtName.getText() + "','"+ txtFatherName.getText() + "','"+ txtFamilyName.getText() + "','"+ txtMobile.getText() + "','"+ txtEmail.getText() + "','"+ txtAddress.getText() + "','"+ cYear.getSelectedItem().toString()+cMounth.getSelectedItem().toString()+cDay.getSelectedItem().toString()  + "','"+ cSpecialization.getSelectedItem().toString()+ "','" + cGender.getSelectedItem().toString() + "','"+ cBloodGroup.getSelectedItem().toString() + "' )";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully saved","Doctor Record",JOptionPane.INFORMATION_MESSAGE);
            bSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }              
     
     if(cSpecialization.getSelectedItem().toString().equals("Nurse")){
        try{
            con=Connect.ConnectDB();
            if (txtStaffId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter nurse id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter nurse name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtFatherName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Father's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             if (txtFamilyName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Family's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
             }
              if (txtMobile.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter mobile number","Error", JOptionPane.ERROR_MESSAGE);
                return;
              }
                if (txtEmail.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter email","Error", JOptionPane.ERROR_MESSAGE);
                return;
              }
            if (txtAddress.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
   
       
       String sql1="Select NurseId from Nurse where NurseId= '" + txtStaffId.getText() + "'";
      stmt= con.createStatement();
       rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Nurse ID already exists","Error", JOptionPane.ERROR_MESSAGE);
        txtStaffId.setText("");
        txtStaffId.requestDefaultFocus();
       return;
      }
            String sql= "insert into Nurse(NurseId,Name,FatherName,FamilyName,Mobile,Email,Address,DateOfJoining,Specialization,Gender,BloodGroup)values('"+ txtStaffId.getText() + "','"+ txtName.getText() + "','"+ txtFatherName.getText() + "','"+ txtFamilyName.getText() + "','"+ txtMobile.getText() + "','"+ txtEmail.getText() + "','"+ txtAddress.getText() + "','"+ cYear.getSelectedItem().toString()+cMounth.getSelectedItem().toString()+cDay.getSelectedItem().toString() + "','"+ cSpecialization.getSelectedItem().toString()+ "','" + cGender.getSelectedItem().toString() + "','"+ cBloodGroup.getSelectedItem().toString() + "' )";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully saved","nurse Record",JOptionPane.INFORMATION_MESSAGE);
            bSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }           
     if(cSpecialization.getSelectedItem().toString().equals("Receptionist")){
        try{
            con=Connect.ConnectDB();
            if (txtStaffId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter receptionist id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter receptionist name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtFatherName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Father's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             if (txtFamilyName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Family's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
             }
              if (txtMobile.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter mobile number","Error", JOptionPane.ERROR_MESSAGE);
                return;
              }
                if (txtEmail.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter email","Error", JOptionPane.ERROR_MESSAGE);
                return;
              }
            if (txtAddress.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
   
       
       String sql1="Select ReceptionistId from Receptionist where ReceptionistId= '" + txtStaffId.getText() + "'";
      stmt= con.createStatement();
       rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Receptionist ID already exists","Error", JOptionPane.ERROR_MESSAGE);
        txtStaffId.setText("");
        txtStaffId.requestDefaultFocus();
       return;
      }
            String sql= "insert into Receptionist(ReceptionistId,Name,FatherName,FamilyName,Mobile,Email,Address,DateOfJoining,Specialization,Gender,BloodGroup)values('"+ txtStaffId.getText() + "','"+ txtName.getText() + "','"+ txtFatherName.getText() + "','"+ txtFamilyName.getText() + "','"+ txtMobile.getText() + "','"+ txtEmail.getText() + "','"+ txtAddress.getText() + "','"+ cYear.getSelectedItem().toString()+cMounth.getSelectedItem().toString()+cDay.getSelectedItem().toString() + "','"+ cSpecialization.getSelectedItem().toString()+ "','" + cGender.getSelectedItem().toString() + "','"+ cBloodGroup.getSelectedItem().toString() + "' )";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully saved","receptionist Record",JOptionPane.INFORMATION_MESSAGE);
            bSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }
     if(cSpecialization.getSelectedItem().toString().equals("Pharmacist")){
        try{
            con=Connect.ConnectDB();
            if (txtStaffId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter pharmacist id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter pharmacist name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtFatherName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Father's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             if (txtFamilyName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Family's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
             }
              if (txtMobile.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter mobile number","Error", JOptionPane.ERROR_MESSAGE);
                return;
              }
                if (txtEmail.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter email","Error", JOptionPane.ERROR_MESSAGE);
                return;
              }
            if (txtAddress.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
   
       
       String sql1="Select PharmacistId from Pharmacist where PharmacistId= '" + txtStaffId.getText() + "'";
      stmt= con.createStatement();
       rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Pharmacist ID already exists","Error", JOptionPane.ERROR_MESSAGE);
        txtStaffId.setText("");
        txtStaffId.requestDefaultFocus();
       return;
      }
            String sql= "insert into Pharmacist(PharmacistId,Name,FatherName,FamilyName,Mobile,Email,Address,DateOfJoining,Specialization,Gender,BloodGroup)values('"+ txtStaffId.getText() + "','"+ txtName.getText() + "','"+ txtFatherName.getText() + "','"+ txtFamilyName.getText() + "','"+ txtMobile.getText() + "','"+ txtEmail.getText() + "','"+ txtAddress.getText() + "','"+ cYear.getSelectedItem().toString()+cMounth.getSelectedItem().toString()+cDay.getSelectedItem().toString() + "','"+ cSpecialization.getSelectedItem().toString()+ "','" + cGender.getSelectedItem().toString() + "','"+ cBloodGroup.getSelectedItem().toString() + "' )";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully saved","pharmacist Record",JOptionPane.INFORMATION_MESSAGE);
            bSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }      
     if(cSpecialization.getSelectedItem().toString().equals("Accountant")){
        try{
            con=Connect.ConnectDB();
            if (txtStaffId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Accountant id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Accountant name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtFatherName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Father's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             if (txtFamilyName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Family's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
             }
              if (txtMobile.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter mobile number","Error", JOptionPane.ERROR_MESSAGE);
                return;
              }
                if (txtEmail.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter email","Error", JOptionPane.ERROR_MESSAGE);
                return;
              }
            if (txtAddress.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
   
       
       String sql1="Select AccountantId from Accountant where AccountantId= '" + txtStaffId.getText() + "'";
      stmt= con.createStatement();
       rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Accountant ID already exists","Error", JOptionPane.ERROR_MESSAGE);
        txtStaffId.setText("");
        txtStaffId.requestDefaultFocus();
       return;
      }
            String sql= "insert into Accountant(AccountantId,Name,FatherName,FamilyName,Mobile,Email,Address,DateOfJoining,Specialization,Gender,BloodGroup)values('"+ txtStaffId.getText() + "','"+ txtName.getText() + "','"+ txtFatherName.getText() + "','"+ txtFamilyName.getText() + "','"+ txtMobile.getText() + "','"+ txtEmail.getText() + "','"+ txtAddress.getText() + "','"+ cYear.getSelectedItem().toString()+cMounth.getSelectedItem().toString()+cDay.getSelectedItem().toString()  + "','"+ cSpecialization.getSelectedItem().toString()+ "','" + cGender.getSelectedItem().toString() + "','"+ cBloodGroup.getSelectedItem().toString() + "' )";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully saved","accountant Record",JOptionPane.INFORMATION_MESSAGE);
            bSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
     }
        if(cSpecialization.getSelectedItem().toString().equals("Lab")){
        try{
            con=Connect.ConnectDB();
            if (txtStaffId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Lab id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Lab name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtFatherName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Father's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             if (txtFamilyName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Family's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
             }
              if (txtMobile.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter mobile number","Error", JOptionPane.ERROR_MESSAGE);
                return;
              }
                if (txtEmail.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter email","Error", JOptionPane.ERROR_MESSAGE);
                return;
              }
            if (txtAddress.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
   
       
       String sql1="Select LabId from Lap where LabId= '" + txtStaffId.getText() + "'";
      stmt= con.createStatement();
       rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Lab ID already exists","Error", JOptionPane.ERROR_MESSAGE);
        txtStaffId.setText("");
        txtStaffId.requestDefaultFocus();
       return;
      }
            String sql= "insert into Lap(LabId,Name,FatherName,FamilyName,Mobile,Email,Address,DateOfJoining,Specialization,Gender,BloodGroup)values('"+ txtStaffId.getText() + "','"+ txtName.getText() + "','"+ txtFatherName.getText() + "','"+ txtFamilyName.getText() + "','"+ txtMobile.getText() + "','"+ txtEmail.getText() + "','"+ txtAddress.getText() + "','"+ cYear.getSelectedItem().toString()+cMounth.getSelectedItem().toString()+cDay.getSelectedItem().toString()  + "','"+ cSpecialization.getSelectedItem().toString()+ "','" + cGender.getSelectedItem().toString() + "','"+ cBloodGroup.getSelectedItem().toString() + "' )";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully saved","Lab Record",JOptionPane.INFORMATION_MESSAGE);
            bSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        }
        if(cSpecialization.getSelectedItem().toString().equals("X-Ray")){
        try{
            con=Connect.ConnectDB();
            if (txtStaffId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter X-Ray id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter X-Ray name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtFatherName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Father's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             if (txtFamilyName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Family's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
             }
              if (txtMobile.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter mobile number","Error", JOptionPane.ERROR_MESSAGE);
                return;
              }
                if (txtEmail.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter email","Error", JOptionPane.ERROR_MESSAGE);
                return;
              }
            if (txtAddress.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
   
       
       String sql1="Select XrayId from Xray where XrayId= '" + txtStaffId.getText() + "'";
      stmt= con.createStatement();
       rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "X-Ray ID already exists","Error", JOptionPane.ERROR_MESSAGE);
        txtStaffId.setText("");
        txtStaffId.requestDefaultFocus();
       return;
      }
            String sql= "insert into Xray(XrayId,Name,FatherName,FamilyName,Mobile,Email,Address,DateOfJoining,Specialization,Gender,BloodGroup)values('"+ txtStaffId.getText() + "','"+ txtName.getText() + "','"+ txtFatherName.getText() + "','"+ txtFamilyName.getText() + "','"+ txtMobile.getText() + "','"+ txtEmail.getText() + "','"+ txtAddress.getText() + "','"+ cYear.getSelectedItem().toString()+cMounth.getSelectedItem().toString()+cDay.getSelectedItem().toString()  + "','"+ cSpecialization.getSelectedItem().toString()+ "','" + cGender.getSelectedItem().toString() + "','"+ cBloodGroup.getSelectedItem().toString() + "' )";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully saved","Xray Record",JOptionPane.INFORMATION_MESSAGE);
            bSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        }
                    
                
     
    }
    
    
    
    
    
    

    
    private void bNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewActionPerformed
        
        reset();
    }//GEN-LAST:event_bNewActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
 
        if(cSpecialization.getSelectedItem().toString().equals("Admin")){
        
        try{
       if (txtStaffId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Admin id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from Admin where AdminId = '" + txtStaffId.getText() + "'";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        }
        if(cSpecialization.getSelectedItem().toString().equals("Doctor")){
        
        try{
       if (txtStaffId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Doctor id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from Doctor where DoctorId = '" + txtStaffId.getText() + "'";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }}
        if(cSpecialization.getSelectedItem().toString().equals("Nurse")){
        
        try{
       if (txtStaffId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Nurse id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from Nurse where NurseId = '" + txtStaffId.getText() + "'";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }}
        if(cSpecialization.getSelectedItem().toString().equals("Receptionist")){
        
        try{
       if (txtStaffId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter receptionist id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from Receptionist where ReceptionistId = '" + txtStaffId.getText() + "'";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }}
            if(cSpecialization.getSelectedItem().toString().equals("Pharmacist")){
        
        try{
       if (txtStaffId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Pharmacist id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from Pharmacist where PharmacistId = '" + txtStaffId.getText() + "'";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }}
        if(cSpecialization.getSelectedItem().toString().equals("Accountant")){
        
        try{
       if (txtStaffId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Accountant id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from Accountant where AccountantId = '" + txtStaffId.getText() + "'";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        }
        if(cSpecialization.getSelectedItem().toString().equals("Lab")){
        
        try{
       if (txtStaffId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Lab id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from Lap where LabId = '" + txtStaffId.getText() + "'";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        }
        if(cSpecialization.getSelectedItem().toString().equals("X-Ray")){
        
        try{
       if (txtStaffId.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter X-Ray id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=Connect.ConnectDB();
                String sql= "delete from Xray where XrayId = '" + txtStaffId.getText() + "'";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        
        
        
        
        }    }//GEN-LAST:event_bDeleteActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed

        
       if(cSpecialization.getSelectedItem().toString().equals("Admin")) {
        try{
            con=Connect.ConnectDB();
            String sql= "update Admin set Name='"+ txtName.getText() + "',FatherName='"+ txtFatherName.getText() +"',FamilyName='"+ txtFamilyName.getText()+ "',Mobile='"+ txtMobile.getText()+"',Email='"+ txtEmail.getText() + "',Address='"+ txtAddress.getText()  + "' where AdminId='" + txtStaffId.getText() + "'";

           pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","admin Record",JOptionPane.INFORMATION_MESSAGE);
            bUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }    }//GEN-LAST:event_bUpdateActionPerformed
 
    if(cSpecialization.getSelectedItem().toString().equals("Doctor")) {
        try{
            con=Connect.ConnectDB();
            String sql= "update Doctor set Name='"+ txtName.getText() + "',FatherName='"+ txtFatherName.getText() +"',FamilyName='"+ txtFamilyName.getText()+ "',Mobile='"+ txtMobile.getText()+"',Email='"+ txtEmail.getText() + "',Address='"+ txtAddress.getText() + "' where DoctorId='" + txtStaffId.getText() + "'";

           pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","doctor Record",JOptionPane.INFORMATION_MESSAGE);
            bUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }    }  
    
    if(cSpecialization.getSelectedItem().toString().equals("Nurse")) {
        try{
            con=Connect.ConnectDB();
            String sql= "update Nurse set Name='"+ txtName.getText() + "',FatherName='"+ txtFatherName.getText() +"',FamilyName='"+ txtFamilyName.getText()+ "',Mobile='"+ txtMobile.getText()+"',Email='"+ txtEmail.getText() + "',Address='"+ txtAddress.getText() + "' where NurseId='" + txtStaffId.getText() + "'";

           pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","nurse Record",JOptionPane.INFORMATION_MESSAGE);
            bUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }    }  
    
    
    
    if(cSpecialization.getSelectedItem().toString().equals("Receptionist")) {
        try{
            con=Connect.ConnectDB();
            String sql= "update Receptionist set Name='"+ txtName.getText() + "',FatherName='"+ txtFatherName.getText() +"',FamilyName='"+ txtFamilyName.getText()+ "',Mobile='"+ txtMobile.getText()+"',Email='"+ txtEmail.getText() + "',Address='"+ txtAddress.getText() + "' where ReceptionistId='" + txtStaffId.getText() + "'";

           pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","receptionist Record",JOptionPane.INFORMATION_MESSAGE);
            bUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }    }  
    
    
    if(cSpecialization.getSelectedItem().toString().equals("Pharmacist")) {
        try{
            con=Connect.ConnectDB();
            String sql= "update Pharmacist set Name='"+ txtName.getText() + "',FatherName='"+ txtFatherName.getText() +"',FamilyName='"+ txtFamilyName.getText()+ "',Mobile='"+ txtMobile.getText()+"',Email='"+ txtEmail.getText() + "',Address='"+ txtAddress.getText()  + "' where PharmacistId='" + txtStaffId.getText() + "'";

           pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","pharmacist Record",JOptionPane.INFORMATION_MESSAGE);
            bUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }    }  
    
    if(cSpecialization.getSelectedItem().toString().equals("Accountant")) {
        try{
            con=Connect.ConnectDB();
            String sql= "update Accountant set Name='"+ txtName.getText() + "',FatherName='"+ txtFatherName.getText() +"',FamilyName='"+ txtFamilyName.getText()+ "',Mobile='"+ txtMobile.getText()+"',Email='"+ txtEmail.getText() + "',Address='"+ txtAddress.getText() + "' where AccountantId='" + txtStaffId.getText() + "'";

           pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","accountant Record",JOptionPane.INFORMATION_MESSAGE);
            bUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }
            
       if(cSpecialization.getSelectedItem().toString().equals("Lab")) {
        try{
            con=Connect.ConnectDB();
            String sql= "update Lap set Name='"+ txtName.getText() + "',FatherName='"+ txtFatherName.getText() +"',FamilyName='"+ txtFamilyName.getText()+ "',Mobile='"+ txtMobile.getText()+"',Email='"+ txtEmail.getText() + "',Address='"+ txtAddress.getText()  + "' where LabId='" + txtStaffId.getText() + "'";

           pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","Lab Record",JOptionPane.INFORMATION_MESSAGE);
            bUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        } 
         
    
    }
           
       if(cSpecialization.getSelectedItem().toString().equals("X-Ray")) {
        try{
            con=Connect.ConnectDB();
            String sql= "update Xray set Name='"+ txtName.getText() + "',FatherName='"+ txtFatherName.getText() +"',FamilyName='"+ txtFamilyName.getText()+ "',Mobile='"+ txtMobile.getText()+"',Email='"+ txtEmail.getText() + "',Address='"+ txtAddress.getText() + "' where XrayId='" + txtStaffId.getText() + "'";

           pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","Xray Record",JOptionPane.INFORMATION_MESSAGE);
            bUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        } }
    }


private void reset(){
     txtStaffId.setText("");
    txtName.setText("");
    txtFatherName.setText("");
    txtFamilyName.setText("");
    txtMobile.setText("");
    txtEmail.setText("");
    txtDateOfJoining.setText("");
    txtAddress.setText("");
    cYear.setSelectedIndex(-1);
    cMounth.setSelectedIndex(-1);
    cDay.setSelectedIndex(-1);
    cSpecialization.setSelectedIndex(-1);
    cGender.setSelectedIndex(-1);
    cBloodGroup.setSelectedIndex(-1);
    bSave.setEnabled(true);
    bUpdate.setEnabled(false);
    bDelete.setEnabled(false);
    txtStaffId.requestDefaultFocus();
}
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStaffInfo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bDelete;
    public javax.swing.JButton bGetData;
    public javax.swing.JButton bNew;
    public javax.swing.JButton bSave;
    public javax.swing.JButton bUpdate;
    public javax.swing.JComboBox cBloodGroup;
    private javax.swing.JComboBox cDay;
    public javax.swing.JComboBox cGender;
    private javax.swing.JComboBox cMounth;
    public javax.swing.JComboBox cSpecialization;
    private javax.swing.JComboBox cYear;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtAddress;
    public javax.swing.JTextField txtDateOfJoining;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtFamilyName;
    public javax.swing.JTextField txtFatherName;
    public javax.swing.JTextField txtMobile;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtStaffId;
    // End of variables declaration//GEN-END:variables
}
