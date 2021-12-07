package hospital.management.system1;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import javax.print.DocFlavor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.swing.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Doctor extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement stmt;

    public Doctor() {
        initComponents();
        txtMessage2.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtDiease = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        bUpdate = new javax.swing.JButton();
        bNew = new javax.swing.JButton();
        bPatientReport = new javax.swing.JButton();
        bGetData = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtMessage2 = new javax.swing.JTextArea();
        cMessage = new javax.swing.JComboBox();
        bShow = new javax.swing.JButton();
        cMessage2 = new javax.swing.JComboBox();
        bShow2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Doctor");
        setBounds(new java.awt.Rectangle(250, 0, 0, 0));
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
        jLabel8.setText("Remark  To : ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 151, 138, 22);

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

        txtMessage.setBackground(new java.awt.Color(153, 153, 255));
        txtMessage.setColumns(20);
        txtMessage.setForeground(new java.awt.Color(51, 51, 255));
        txtMessage.setRows(5);
        txtMessage.setName("txtMessage"); // NOI18N
        jScrollPane2.setViewportView(txtMessage);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(150, 154, 227, 143);

        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Remark From  :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 350, 90, 22);

        bUpdate.setBackground(new java.awt.Color(153, 153, 255));
        bUpdate.setText("Send Message");
        bUpdate.setName("bUpdate"); // NOI18N
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(bUpdate);
        bUpdate.setBounds(480, 60, 138, 23);

        bNew.setBackground(new java.awt.Color(153, 153, 255));
        bNew.setText("New");
        bNew.setName("bNew"); // NOI18N
        bNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewActionPerformed(evt);
            }
        });
        jPanel1.add(bNew);
        bNew.setBounds(480, 90, 138, 23);

        bPatientReport.setBackground(new java.awt.Color(153, 153, 153));
        bPatientReport.setText("Print Report");
        bPatientReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPatientReportActionPerformed(evt);
            }
        });
        jPanel1.add(bPatientReport);
        bPatientReport.setBounds(480, 150, 140, 23);

        bGetData.setBackground(new java.awt.Color(153, 153, 255));
        bGetData.setText("Get Data");
        bGetData.setName("bGetDate"); // NOI18N
        bGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGetDataActionPerformed(evt);
            }
        });
        jPanel1.add(bGetData);
        bGetData.setBounds(480, 120, 138, 23);

        txtMessage2.setBackground(new java.awt.Color(153, 153, 255));
        txtMessage2.setColumns(20);
        txtMessage2.setForeground(new java.awt.Color(51, 51, 255));
        txtMessage2.setRows(5);
        txtMessage2.setName("txtRemarkFromNurse"); // NOI18N
        jScrollPane9.setViewportView(txtMessage2);

        jPanel1.add(jScrollPane9);
        jScrollPane9.setBounds(150, 330, 226, 143);

        cMessage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reception", "Nurse", "Pharmacy", "Lab", "X-Ray", " " }));
        cMessage.setSelectedIndex(-1);
        jPanel1.add(cMessage);
        cMessage.setBounds(0, 190, 150, 20);

        bShow.setText("Show");
        bShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bShowActionPerformed(evt);
            }
        });
        jPanel1.add(bShow);
        bShow.setBounds(20, 220, 59, 23);

        cMessage2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nurse", "Pharmacy", " Lab", " X-Ray", " " }));
        cMessage2.setSelectedIndex(-1);
        cMessage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMessage2ActionPerformed(evt);
            }
        });
        jPanel1.add(cMessage2);
        cMessage2.setBounds(0, 390, 150, 20);

        bShow2.setText("Show");
        bShow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bShow2ActionPerformed(evt);
            }
        });
        jPanel1.add(bShow2);
        bShow2.setBounds(30, 420, 59, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system1/docc.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-6, 0, 690, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        PatientInfoTable f = new PatientInfoTable();
        f.setVisible(true);
    }//GEN-LAST:event_bGetDataActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed

        try {
            if (txtPatientId.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter patient id", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter patient  name", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtDiease.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter disease id", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }


            con = Connect.ConnectDB();
             String sql2 = "update Patient0 set Disease='"+txtDiease.getText()+"'";
                pst = con.prepareStatement(sql2);
                pst.execute();
               // JOptionPane.showMessageDialog(this, "Successfully updated", "Staff Record", JOptionPane.INFORMATION_MESSAGE);
                bUpdate.setEnabled(false);
            if (cMessage.getSelectedIndex() == 0) {
                String sql = "update Patient0 set RemarkFromDoctorToReception ='" + txtMessage.getText().toString() +"'";
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Successfully updated", "Staff Record", JOptionPane.INFORMATION_MESSAGE);
                bUpdate.setEnabled(false);
            }
            if (cMessage.getSelectedIndex() == 1) {

                String sql = "update Patient0 set RemarkToNurseFromDoctor ='" + txtMessage.getText().toString()  + "'";
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Successfully updated", "Staff Record", JOptionPane.INFORMATION_MESSAGE);
                bUpdate.setEnabled(false);


            }
            if (cMessage.getSelectedIndex() == 2) {
                String sql = "update Patient0 set RemarkToPharmacyFromDoctor ='" + txtMessage.getText().toString()  + "'";
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Successfully updated", "Staff Record", JOptionPane.INFORMATION_MESSAGE);
                bUpdate.setEnabled(false);
            }
            if (cMessage.getSelectedIndex() == 3) {
                String sql = "update Patient0 set RemarkFromDoctorToLab ='" + txtMessage.getText().toString() + "'";
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Successfully updated", "Staff Record", JOptionPane.INFORMATION_MESSAGE);
                bUpdate.setEnabled(false);
            }
            if (cMessage.getSelectedIndex() == 4) {
                String sql = "update Patient0 set RemarkFromDoctorToXray ='" + txtMessage.getText().toString() + "'";
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Successfully updated", "Staff Record", JOptionPane.INFORMATION_MESSAGE);
                bUpdate.setEnabled(false);
                /*
                 String sql = "update Patient0 set RemarkFromDoctorToReception ='" + txtMessage.getText().toString() + "',RemarkToPharmacyFromDoctor ='" + txtRemarkToPharmacy.getText().toString() + "',RemarkToNurseFromDoctor ='" + txtRemarkToNurse.getText().toString() + "' ,RemarkFromDoctorToReception='"+txtMessage.getText().toString()+"',Disease='"+txtDiease.getText().toString()+"' where PatientId='" + txtPatientId.getText().toString() + "'";
                 pst = con.prepareStatement(sql);
                 pst.execute();
                 JOptionPane.showMessageDialog(this, "Successfully updated", "Staff Record", JOptionPane.INFORMATION_MESSAGE);
                 bUpdate.setEnabled(false);
                 */
            }
            
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }


    }//GEN-LAST:event_bUpdateActionPerformed

    private void bNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewActionPerformed
        reset();
    }//GEN-LAST:event_bNewActionPerformed

    private void bShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bShowActionPerformed



        try {
            con = Connect.ConnectDB();
            String sql = "select * from Patient0 where PatientId = '" + txtPatientId.getText().toString() + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (cMessage.getSelectedIndex() == 0) {
                if (rs.next()) {
                    String add1 = rs.getString("RemarkFromDoctorToReception");
                    txtMessage.setText(add1);
                    /*
                     String add4 = rs.getString("RemarkFromDoctorToReception");
                     frm.txtRemarkToReception.setText(add4);
                     String add5 = rs.getString("RemarkToPharmacyFromDoctor");
                     frm.txtRemarkToPharmacy.setText(add5);
                     String add6 = rs.getString("RemarkToNurseFromDoctor");
                     frm.txtRemarkToNurse.setText(add6);
                     String add7 = rs.getString("RemarkToDoctorFromPharmacy");
                     frm.txtRemarkFromPharmacy.setText(add7);
                     String add8 = rs.getString("RemarkToDoctorFromNurse");
                     frm.txtRemarkFromNurse.setText(add8);
                     */

                }
            }
            if (cMessage.getSelectedIndex() == 1) {
                if (rs.next()) {
                    String add1 = rs.getString("RemarkToNurseFromDoctor");
                    txtMessage.setText(add1);
                    /*
                     String add4 = rs.getString("RemarkFromDoctorToReception");
                     frm.txtRemarkToReception.setText(add4);
                     String add5 = rs.getString("RemarkToPharmacyFromDoctor");
                     frm.txtRemarkToPharmacy.setText(add5);
                     String add6 = rs.getString("RemarkToNurseFromDoctor");
                     frm.txtRemarkToNurse.setText(add6);
                     String add7 = rs.getString("RemarkToDoctorFromPharmacy");
                     frm.txtRemarkFromPharmacy.setText(add7);
                     String add8 = rs.getString("RemarkToDoctorFromNurse");
                     frm.txtRemarkFromNurse.setText(add8);
                     */

                }
            }
            if (cMessage.getSelectedIndex() == 2) {
                if (rs.next()) {
                    String add1 = rs.getString("RemarkToPharmacyFromDoctor");
                    txtMessage.setText(add1);
                    /*
                     String add4 = rs.getString("RemarkFromDoctorToReception");
                     frm.txtRemarkToReception.setText(add4);
                     String add5 = rs.getString("RemarkToPharmacyFromDoctor");
                     frm.txtRemarkToPharmacy.setText(add5);
                     String add6 = rs.getString("RemarkToNurseFromDoctor");
                     frm.txtRemarkToNurse.setText(add6);
                     String add7 = rs.getString("RemarkToDoctorFromPharmacy");
                     frm.txtRemarkFromPharmacy.setText(add7);
                     String add8 = rs.getString("RemarkToDoctorFromNurse");
                     frm.txtRemarkFromNurse.setText(add8);
                     */

                }
            }
            if (cMessage.getSelectedIndex() == 3) {
                if (rs.next()) {
                    String add1 = rs.getString("RemarkFromDoctorToLab");
                    txtMessage.setText(add1);
                    /*
                     String add4 = rs.getString("RemarkFromDoctorToReception");
                     frm.txtRemarkToReception.setText(add4);
                     String add5 = rs.getString("RemarkToPharmacyFromDoctor");
                     frm.txtRemarkToPharmacy.setText(add5);
                     String add6 = rs.getString("RemarkToNurseFromDoctor");
                     frm.txtRemarkToNurse.setText(add6);
                     String add7 = rs.getString("RemarkToDoctorFromPharmacy");
                     frm.txtRemarkFromPharmacy.setText(add7);
                     String add8 = rs.getString("RemarkToDoctorFromNurse");
                     frm.txtRemarkFromNurse.setText(add8);
                     */

                }
            }
            if (cMessage.getSelectedIndex() == 4) {
                if (rs.next()) {
                    String add1 = rs.getString("RemarkFromDoctorToXray");
                    txtMessage.setText(add1);
                    /*
                     String add4 = rs.getString("RemarkFromDoctorToReception");
                     frm.txtRemarkToReception.setText(add4);
                     String add5 = rs.getString("RemarkToPharmacyFromDoctor");
                     frm.txtRemarkToPharmacy.setText(add5);
                     String add6 = rs.getString("RemarkToNurseFromDoctor");
                     frm.txtRemarkToNurse.setText(add6);
                     String add7 = rs.getString("RemarkToDoctorFromPharmacy");
                     frm.txtRemarkFromPharmacy.setText(add7);
                     String add8 = rs.getString("RemarkToDoctorFromNurse");
                     frm.txtRemarkFromNurse.setText(add8);
                     */

                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);

        }
    }//GEN-LAST:event_bShowActionPerformed

    private void bShow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bShow2ActionPerformed


        try {
            con = Connect.ConnectDB();
            String sql = "select * from Patient0 where PatientId ='" + txtPatientId.getText().toString() + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (cMessage2.getSelectedIndex() == 0) {
                if (rs.next()) {
                    String add1 = rs.getString("RemarkToDoctorFromNurse");
                    txtMessage2.setText(add1);
                    /*
                     String add4 = rs.getString("RemarkFromDoctorToReception");
                     frm.txtRemarkToReception.setText(add4);
                     String add5 = rs.getString("RemarkToPharmacyFromDoctor");
                     frm.txtRemarkToPharmacy.setText(add5);
                     String add6 = rs.getString("RemarkToNurseFromDoctor");
                     frm.txtRemarkToNurse.setText(add6);
                     String add7 = rs.getString("RemarkToDoctorFromPharmacy");
                     frm.txtRemarkFromPharmacy.setText(add7);
                     String add8 = rs.getString("RemarkToDoctorFromNurse");
                     frm.txtRemarkFromNurse.setText(add8);
                     */

                }
            }
            if (cMessage2.getSelectedIndex() == 1) {
                if (rs.next()) {
                    String add1 = rs.getString("RemarkToDoctorFromPharmacy");
                    txtMessage2.setText(add1);
                    /*
                     String add4 = rs.getString("RemarkFromDoctorToReception");
                     frm.txtRemarkToReception.setText(add4);
                     String add5 = rs.getString("RemarkToPharmacyFromDoctor");
                     frm.txtRemarkToPharmacy.setText(add5);
                     String add6 = rs.getString("RemarkToNurseFromDoctor");
                     frm.txtRemarkToNurse.setText(add6);
                     String add7 = rs.getString("RemarkToDoctorFromPharmacy");
                     frm.txtRemarkFromPharmacy.setText(add7);
                     String add8 = rs.getString("RemarkToDoctorFromNurse");
                     frm.txtRemarkFromNurse.setText(add8);
                     */

                }
            }
            if (cMessage2.getSelectedIndex() == 2) {
                if (rs.next()) {
                    String add1 = rs.getString("RemarkToDoctorFromLab");
                    txtMessage2.setText(add1);
                    /*
                     String add4 = rs.getString("RemarkFromDoctorToReception");
                     frm.txtRemarkToReception.setText(add4);
                     String add5 = rs.getString("RemarkToPharmacyFromDoctor");
                     frm.txtRemarkToPharmacy.setText(add5);
                     String add6 = rs.getString("RemarkToNurseFromDoctor");
                     frm.txtRemarkToNurse.setText(add6);
                     String add7 = rs.getString("RemarkToDoctorFromPharmacy");
                     frm.txtRemarkFromPharmacy.setText(add7);
                     String add8 = rs.getString("RemarkToDoctorFromNurse");
                     frm.txtRemarkFromNurse.setText(add8);
                     */

                }
            }
            if (cMessage2.getSelectedIndex() == 3) {
                if (rs.next()) {
                    String add1 = rs.getString("RemarkToDoctorFromXray");
                    txtMessage2.setText(add1);
                    /*
                     String add4 = rs.getString("RemarkFromDoctorToReception");
                     frm.txtRemarkToReception.setText(add4);
                     String add5 = rs.getString("RemarkToPharmacyFromDoctor");
                     frm.txtRemarkToPharmacy.setText(add5);
                     String add6 = rs.getString("RemarkToNurseFromDoctor");
                     frm.txtRemarkToNurse.setText(add6);
                     String add7 = rs.getString("RemarkToDoctorFromPharmacy");
                     frm.txtRemarkFromPharmacy.setText(add7);
                     String add8 = rs.getString("RemarkToDoctorFromNurse");
                     frm.txtRemarkFromNurse.setText(add8);
                     */

                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);

        }


    }//GEN-LAST:event_bShow2ActionPerformed

    private void cMessage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMessage2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cMessage2ActionPerformed

    private void bPatientReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPatientReportActionPerformed
         try {
            JasperDesign j = JRXmlLoader.load("patient.jrxml");
            String sql = "select * from  Patient0 ";
            JRDesignQuery newquery = new JRDesignQuery();
            newquery.setText(sql);
            j.setQuery(newquery);
            JasperReport jj = JasperCompileManager.compileReport(j);
            JasperPrint jjj = JasperFillManager.fillReport(jj, null, con);
            JasperViewer.viewReport(jjj);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_bPatientReportActionPerformed
    private void reset() {
        txtPatientId.setText("");
        txtName.setText("");
        txtDiease.setText("");
        txtMessage.setText("");
        txtMessage2.setText("");
        /*
         txtRemarkToPharmacy.setText("");
         txtRemarkToNurse.setText("");
         txtRemarkFromPharmacy.setText("");
         txtRemarkFromNurse.setText("");
         bUpdate.setEnabled(false);
         */
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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bGetData;
    public javax.swing.JButton bNew;
    private javax.swing.JButton bPatientReport;
    private javax.swing.JButton bShow;
    private javax.swing.JButton bShow2;
    public javax.swing.JButton bUpdate;
    private javax.swing.JComboBox cMessage;
    private javax.swing.JComboBox cMessage2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTextField txtDiease;
    public javax.swing.JTextArea txtMessage;
    public javax.swing.JTextArea txtMessage2;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtPatientId;
    // End of variables declaration//GEN-END:variables
}
