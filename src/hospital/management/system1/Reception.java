package hospital.management.system1;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Reception extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement stmt;
    PreparedStatement pst2 = null;

    public Reception() {
        initComponents();
        txtDisease.setEnabled(false);
        txtRemarkFromDoctor.setEnabled(false);
       // txtRoomNumber.setEnabled(false);
        txtRemarkFromAccountancy.setEnabled(false);
        txtDateOfJoining.setEnabled(false);
        
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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtFatherName = new javax.swing.JTextField();
        txtFamilyName = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        cGender = new javax.swing.JComboBox();
        cBloodGroup = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPatientStatus = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtRemarkFromAccountancy = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtRoomNumber = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDisease = new javax.swing.JTextField();
        bGetData = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        cDepartment = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        cRoomType = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRemarkFromDoctor = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        txtDateOfJoining = new javax.swing.JTextField();
        bSave2 = new javax.swing.JButton();
        cYear = new javax.swing.JComboBox();
        cMounth = new javax.swing.JComboBox();
        cDay = new javax.swing.JComboBox();
        bSave = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bNew = new javax.swing.JButton();
        bGetdata = new javax.swing.JButton();
        bSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Patient Info");
        setBounds(new java.awt.Rectangle(300, 0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Patient ID");
        jLabel3.setName("txtPatientId"); // NOI18N

        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Name");

        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Father's Nmae");

        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Family's Name");
        jLabel6.setName(""); // NOI18N

        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Mobile");

        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Email");

        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Address");

        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Patient Status");

        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Gender");

        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Blood Group");

        txtPatientId.setBackground(new java.awt.Color(153, 153, 255));
        txtPatientId.setForeground(new java.awt.Color(51, 51, 255));
        txtPatientId.setName("txtStaffId"); // NOI18N
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        txtName.setBackground(new java.awt.Color(153, 153, 255));
        txtName.setForeground(new java.awt.Color(51, 51, 255));
        txtName.setName("txtName"); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtFatherName.setBackground(new java.awt.Color(153, 153, 255));
        txtFatherName.setForeground(new java.awt.Color(51, 51, 255));
        txtFatherName.setName("txtFatherNmae"); // NOI18N
        txtFatherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFatherNameActionPerformed(evt);
            }
        });

        txtFamilyName.setBackground(new java.awt.Color(153, 153, 255));
        txtFamilyName.setForeground(new java.awt.Color(51, 51, 255));
        txtFamilyName.setName("txtFamilyName"); // NOI18N
        txtFamilyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFamilyNameActionPerformed(evt);
            }
        });

        txtMobile.setBackground(new java.awt.Color(153, 153, 255));
        txtMobile.setForeground(new java.awt.Color(51, 51, 255));
        txtMobile.setName("txtMobile"); // NOI18N
        txtMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileActionPerformed(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(153, 153, 255));
        txtEmail.setForeground(new java.awt.Color(51, 51, 255));
        txtEmail.setName("txtEmail"); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtAddress.setBackground(new java.awt.Color(153, 153, 255));
        txtAddress.setForeground(new java.awt.Color(51, 51, 255));
        txtAddress.setName("txtAddress"); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

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

        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Age");

        txtAge.setBackground(new java.awt.Color(153, 153, 255));
        txtAge.setForeground(new java.awt.Color(51, 51, 255));
        txtAge.setName("txtAge"); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtPatientStatus.setBackground(new java.awt.Color(153, 153, 255));
        txtPatientStatus.setColumns(20);
        txtPatientStatus.setForeground(new java.awt.Color(51, 51, 255));
        txtPatientStatus.setRows(5);
        txtPatientStatus.setName("txtPatientStatus"); // NOI18N
        jScrollPane1.setViewportView(txtPatientStatus);

        jLabel21.setForeground(new java.awt.Color(0, 0, 255));
        jLabel21.setText("Remark From Accountancy");
        jLabel21.setName(""); // NOI18N

        txtRemarkFromAccountancy.setBackground(new java.awt.Color(153, 153, 255));
        txtRemarkFromAccountancy.setColumns(20);
        txtRemarkFromAccountancy.setForeground(new java.awt.Color(51, 51, 255));
        txtRemarkFromAccountancy.setRows(5);
        txtRemarkFromAccountancy.setName("txtRemark"); // NOI18N
        jScrollPane4.setViewportView(txtRemarkFromAccountancy);

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));

        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Disease");
        jLabel7.setName(""); // NOI18N

        txtRoomNumber.setBackground(new java.awt.Color(153, 153, 255));
        txtRoomNumber.setForeground(new java.awt.Color(51, 51, 255));
        txtRoomNumber.setName("txtRoomNumber"); // NOI18N
        txtRoomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomNumberActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Room Number");
        jLabel15.setName(""); // NOI18N

        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setText("Remark From Doctor");
        jLabel16.setName(""); // NOI18N

        txtDisease.setBackground(new java.awt.Color(153, 153, 255));
        txtDisease.setForeground(new java.awt.Color(51, 51, 255));
        txtDisease.setName("txtDisease"); // NOI18N
        txtDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiseaseActionPerformed(evt);
            }
        });

        bGetData.setBackground(new java.awt.Color(153, 153, 255));
        bGetData.setText("Get Data");
        bGetData.setName("bGetDate"); // NOI18N
        bGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGetDataActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(0, 0, 255));
        jLabel17.setText("Department");
        jLabel17.setName("cDepartment"); // NOI18N

        cDepartment.setBackground(new java.awt.Color(153, 153, 255));
        cDepartment.setForeground(new java.awt.Color(51, 51, 255));
        cDepartment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Orthopedic Surgery", "Cardiac Surgery", "Dermatology", "Chest Diseases", "Obstetrics and Gynecology", "Ophthalmology", "Dental ", "Internal Medicine" }));
        cDepartment.setSelectedIndex(-1);
        cDepartment.setName("cDepartment"); // NOI18N

        jLabel18.setForeground(new java.awt.Color(0, 0, 255));
        jLabel18.setText("Room Type");
        jLabel18.setName("cDepartment"); // NOI18N

        cRoomType.setBackground(new java.awt.Color(153, 153, 255));
        cRoomType.setForeground(new java.awt.Color(51, 51, 255));
        cRoomType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "4", "6" }));
        cRoomType.setSelectedIndex(-1);
        cRoomType.setName("cRoomType"); // NOI18N

        txtRemarkFromDoctor.setBackground(new java.awt.Color(153, 153, 255));
        txtRemarkFromDoctor.setColumns(20);
        txtRemarkFromDoctor.setForeground(new java.awt.Color(51, 51, 255));
        txtRemarkFromDoctor.setRows(5);
        txtRemarkFromDoctor.setName("txtRemark"); // NOI18N
        jScrollPane3.setViewportView(txtRemarkFromDoctor);

        jLabel19.setForeground(new java.awt.Color(0, 0, 255));
        jLabel19.setText("Date Of Joining");
        jLabel19.setName("cDepartment"); // NOI18N

        txtDateOfJoining.setBackground(new java.awt.Color(153, 153, 255));
        txtDateOfJoining.setForeground(new java.awt.Color(51, 51, 255));
        txtDateOfJoining.setName("txtRoomNumber"); // NOI18N
        txtDateOfJoining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfJoiningActionPerformed(evt);
            }
        });

        bSave2.setBackground(new java.awt.Color(153, 153, 255));
        bSave2.setText("Save");
        bSave2.setName("bSave"); // NOI18N
        bSave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSave2ActionPerformed(evt);
            }
        });

        cYear.setBackground(new java.awt.Color(153, 153, 255));
        cYear.setForeground(new java.awt.Color(51, 51, 255));
        cYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014-", "2015-", "2016-", "2017-", "2018-", "2020-", "2021-", "2022-", "2023-", "2024-", "2025-", "2026-", "2027-", "2028-", "2029-", "2030-" }));
        cYear.setSelectedIndex(-1);

        cMounth.setBackground(new java.awt.Color(153, 153, 255));
        cMounth.setForeground(new java.awt.Color(51, 51, 255));
        cMounth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1-", "2-", "3-", "4-", "5-", "6-", "7-", "8-", "9-", "10-", "11-", "12-" }));
        cMounth.setSelectedIndex(-1);

        cDay.setBackground(new java.awt.Color(153, 153, 255));
        cDay.setForeground(new java.awt.Color(51, 51, 255));
        cDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        cDay.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bGetData))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cRoomType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cDepartment, 0, 158, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bSave2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cYear, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cMounth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDateOfJoining, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDisease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGetData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bSave2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cMounth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDateOfJoining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(212, 212, 212))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        bSave.setBackground(new java.awt.Color(153, 153, 255));
        bSave.setText("Save");
        bSave.setName("bSave"); // NOI18N
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        bDelete.setBackground(new java.awt.Color(153, 153, 255));
        bDelete.setText("Check Out");
        bDelete.setName("bUpdate"); // NOI18N
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bUpdate.setBackground(new java.awt.Color(153, 153, 255));
        bUpdate.setText("Update");
        bUpdate.setName("bUpdate"); // NOI18N
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bNew.setBackground(new java.awt.Color(153, 153, 255));
        bNew.setText("New");
        bNew.setName("bNew"); // NOI18N
        bNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewActionPerformed(evt);
            }
        });

        bGetdata.setBackground(new java.awt.Color(153, 153, 255));
        bGetdata.setText("Get Data");
        bGetdata.setName("bGetDate"); // NOI18N
        bGetdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGetdataActionPerformed(evt);
            }
        });

        bSearch.setBackground(new java.awt.Color(153, 153, 255));
        bSearch.setText("Search");
        bSearch.setName("bGetDate"); // NOI18N
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cBloodGroup, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cGender, javax.swing.GroupLayout.Alignment.LEADING, 0, 225, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFamilyName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bGetdata, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bNew, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bSave, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(129, 129, 129)))
                .addGap(344, 344, 344))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFamilyName)
                    .addComponent(bNew))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGetdata))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSearch))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cGender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
    }//GEN-LAST:event_txtPatientIdActionPerformed

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

    private void cGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cGenderActionPerformed
    }//GEN-LAST:event_cGenderActionPerformed

    private void cBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBloodGroupActionPerformed
    }//GEN-LAST:event_cBloodGroupActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiseaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiseaseActionPerformed

    private void txtRoomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomNumberActionPerformed

    private void bGetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGetDataActionPerformed
        this.hide();
        RoomInfoForReceptionist f = new RoomInfoForReceptionist();
        f.setVisible(true);
    }//GEN-LAST:event_bGetDataActionPerformed

    private void bGetdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGetdataActionPerformed
        this.hide();
        PatientInfoTableforReception f = new PatientInfoTableforReception();
        f.setVisible(true);
    }//GEN-LAST:event_bGetdataActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed

        try {
            con = Connect.ConnectDB();
            if (txtPatientId.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Patient id", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter patient name", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtFatherName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Father's name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtFamilyName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Family's name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtMobile.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter mobile number", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtEmail.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter email", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtAddress.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter address", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtAge.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter age", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cGender.getSelectedItem().toString().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter gender", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cBloodGroup.getSelectedItem().toString().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter blood group", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtPatientStatus.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Patient Status", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }


            stmt = con.createStatement();
            String sql1 = "Select patientId from Patient0 where PatientId= '" + txtPatientId.getText().toString() + "'";
            rs = stmt.executeQuery(sql1);
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Patient ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                txtPatientId.setText("");
                txtPatientId.requestDefaultFocus();
                return;
            }
            String sql = "insert into Patient0(PatientId,Name,FatherName,FamilyName,Mobile,Email,Address,Age,Gender,BloodGroup, PatientStatus)values('" + txtPatientId.getText().toString() + "','" + txtName.getText().toString() + "','" + txtFatherName.getText().toString() + "','" + txtFamilyName.getText().toString() + "','" + txtMobile.getText() + "','" + txtEmail.getText().toString() + "','" + txtAddress.getText().toString() + "','" + txtAge.getText().toString() + "','" + cGender.getSelectedItem().toString() + "','" + cBloodGroup.getSelectedItem().toString() + "','" + txtPatientStatus.getText().toString() + "' )";

            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Successfully saved", "Patient Record", JOptionPane.INFORMATION_MESSAGE);
            bSave.setEnabled(false);

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }










    }//GEN-LAST:event_bSaveActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed

        try {
            int P = JOptionPane.showConfirmDialog(null, " Are you sure want to delete ?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (P == 0) {
                con = Connect.ConnectDB();
                //String sql = "delete from Patient0 where PatientId = '" + txtPatientId.getText().toString() + "'";
                //pst = con.prepareStatement(sql);
                //pst.execute();
                String s="Empty";
                String p="0";
                String n="NULL";
                String m="";
    String sql1 = "update Patient0 set  DateOfJoining='"+m+"',RoomNumber='"+m+"',RemarkFromDoctorToReception='"+m+"',TotalOfPay='"+p+"' ,RemarkToNurseFromDoctor='"+m+"',RemarkToDoctorFromNurse='"+m+"',RemarkToPharmacyFromDoctor='"+m+"',RemarkToDoctorFromPharmacy='"+m+"',RemarkToReceptionFromAccountant='"+m+"' where PatientId='"+txtPatientId.getText().toString()+"'";

                //String sql1 = "update Patient0 set  DateOfJoining='"+m+"',RemarkFromDoctorToReception='"+m+"',TotalOfPay='"+p+"' ,RemarkToNurseFromDoctor='"+m+"',RemarkToDoctorFromNurse='"+m+"',RemarkToPharmacyFromDoctor='"+m+"',RemarkToDoctorFromPharmacy='"+m+"',RemarkToReceptionFromAccountant='"+m+"',RemarkToDoctorFromLap='"+m+"',RemarkToDoctorFromX-ray='"+m+"',RemarkFromDoctorToLap='"+m+"',RemarkFromDoctorToX-ray='"+m+"'  where PatientId='"+txtPatientId.getText().toString()+"'";
                String sql2 = "update Room set Status='" + s+"',PatientId='"+m+"' where RoomNumber='"+txtRoomNumber.getText()+"' and Department='"+cDepartment.getSelectedItem().toString()+"'";
                pst = con.prepareStatement(sql1);
                pst.execute();

                 pst2 = con.prepareStatement(sql2);
                pst2.execute();
                JOptionPane.showMessageDialog(this, "Successfully deleted", "Record", JOptionPane.INFORMATION_MESSAGE);

                reset();
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }


    }//GEN-LAST:event_bDeleteActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed

        try {
            con = Connect.ConnectDB();
            String sql = "update Patient0 set Name='" + txtName.getText().toString() + "',FatherName='" + txtFatherName.getText().toString() + "',FamilyName='" + txtFamilyName.getText().toString() + "',Mobile='" + txtMobile.getText().toString() + "',Email='" + txtEmail.getText().toString() + "',Address='" + txtAddress.getText().toString() + "',Age='" + txtAge.getText().toString() + "',Gender='" + cGender.getSelectedItem().toString() + "',BloodGroup='" + cBloodGroup.getSelectedItem().toString() + "',PatientStatus='" + txtPatientStatus.getText().toString() + "' where PatientId='" + txtPatientId.getText().toString() + "'";
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Successfully updated", "Staff Record", JOptionPane.INFORMATION_MESSAGE);
            bUpdate.setEnabled(false);

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

    }//GEN-LAST:event_bUpdateActionPerformed

    private void bNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewActionPerformed

        reset();
    }//GEN-LAST:event_bNewActionPerformed

    private void txtDateOfJoiningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfJoiningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfJoiningActionPerformed

    private void bSave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSave2ActionPerformed

     try {
            con = Connect.ConnectDB();
            if (txtPatientId.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Patient id", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
           
             if (txtRoomNumber.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Room Number", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
              if (cDepartment.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Department", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
               if (cRoomType.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter room  type", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
                if (cYear.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter year ", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
                if (cMounth.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter mounth ", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
                if (cDay.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter day ", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             
         
      String department=(cDepartment.getSelectedItem().toString()) ;
     int PatientId=Integer.parseInt(txtPatientId.getText().toString()) ;
     String sql = "update Patient0 set RoomNumber ='" + txtRoomNumber.getText() + "',DateOfJoining='"+cYear.getSelectedItem().toString()+cMounth.getSelectedItem().toString()+cDay.getSelectedItem().toString()+"',Department='"+cDepartment.getSelectedItem().toString()+"' where PatientId='" + PatientId + "'";
          String stt="Non-Empty";
       String sql2 = "update Room set Status ='" + stt + "',PatientId='"+txtPatientId.getText().toString()+"' where RoomNumber='" + txtRoomNumber.getText() + "' and Department='"+cDepartment.getSelectedItem().toString()+"'";
         pst = con.prepareStatement(sql);
            pst.execute();
           pst2 = con.prepareStatement(sql2);
            pst2.execute();
            JOptionPane.showMessageDialog(this, "Successfully saved", "Patient Record", JOptionPane.INFORMATION_MESSAGE);
            bSave2.setEnabled(false);

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }










    }                                     
/*
    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                        

        try {
            int P = JOptionPane.showConfirmDialog(null, " Are you sure want to delete ?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (P == 0) {
                con = Connect.ConnectDB();
                String sql = "delete from Patient where PatientId = '" + txtPatientId.getText().toString() + "'";
                pst = con.prepareStatement(sql);
                pst.execute();
                String s="True";
                //تعديل 
                String sql2 = "update Room set Status='" + s+ "' where RoomNumber='"+txtRoomNumber.getText().toString()+"' ";
                pst = con.prepareStatement(sql2);
                pst.execute();
                
                JOptionPane.showMessageDialog(this, "Successfully deleted", "Record", JOptionPane.INFORMATION_MESSAGE);

                reset();
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_bSave2ActionPerformed
*/
    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed

        try {
            con = Connect.ConnectDB();
            String sql = "select RoomNumber,Department ,DateOfJoining from Patient0 where Name='" + txtName.getText().toString() + "'and FatherName='" + txtFatherName.getText().toString() + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("DateOfJoining");
                txtDateOfJoining.setText(add1);
                String add3 = rs.getString("RoomNumber");
                txtRoomNumber.setText(add3);
                String add4 = rs.getString("Department");
                cDepartment.setSelectedItem(add4);
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_bSearchActionPerformed

    private void reset() {
        txtPatientId.setText("");
        txtName.setText("");
        txtFamilyName.setText("");
        txtFatherName.setText("");
        txtMobile.setText("");
        txtEmail.setText("");
        txtAddress.setText("");
        txtAge.setText("");
        cGender.setSelectedIndex(-1);
        cBloodGroup.setSelectedIndex(-1);
        txtPatientStatus.setText("");
        txtRemarkFromAccountancy.setText("");
        txtRemarkFromDoctor.setText("");
        txtRoomNumber.setText("");
        cDepartment.setSelectedIndex(-1);
        cRoomType.setSelectedIndex(-1);
        bSave.setEnabled(true);
        bUpdate.setEnabled(false);
        bDelete.setEnabled(false);
        txtDateOfJoining.setText("");
        
        txtDisease.setText("");
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
            java.util.logging.Logger.getLogger(Reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reception().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bDelete;
    public javax.swing.JButton bGetData;
    public javax.swing.JButton bGetdata;
    public javax.swing.JButton bNew;
    public javax.swing.JButton bSave;
    public javax.swing.JButton bSave2;
    public javax.swing.JButton bSearch;
    public javax.swing.JButton bUpdate;
    public javax.swing.JComboBox cBloodGroup;
    private javax.swing.JComboBox cDay;
    public javax.swing.JComboBox cDepartment;
    public javax.swing.JComboBox cGender;
    private javax.swing.JComboBox cMounth;
    public javax.swing.JComboBox cRoomType;
    private javax.swing.JComboBox cYear;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTextField txtAddress;
    public javax.swing.JTextField txtAge;
    public javax.swing.JTextField txtDateOfJoining;
    public javax.swing.JTextField txtDisease;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtFamilyName;
    public javax.swing.JTextField txtFatherName;
    public javax.swing.JTextField txtMobile;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtPatientId;
    public javax.swing.JTextArea txtPatientStatus;
    public javax.swing.JTextArea txtRemarkFromAccountancy;
    public javax.swing.JTextArea txtRemarkFromDoctor;
    public javax.swing.JTextField txtRoomNumber;
    // End of variables declaration//GEN-END:variables
}
