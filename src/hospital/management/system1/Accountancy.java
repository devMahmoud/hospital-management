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

public class Accountancy extends javax.swing.JFrame {

    public ImageIcon im;
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement stmt;

    public Accountancy() {
        initComponents();
        txtRoomCost.setEnabled(false);
        txtServicesCharges.setEnabled(false);
        txtNumberOfDays.setEnabled(false);
        txtTotal.setEnabled(false);
        txtDateOfJoining.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtRoomCost = new javax.swing.JTextField();
        txtServicesCharges = new javax.swing.JTextField();
        txtDateOfJoining = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtNumberOfDays = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtTotalOfPay = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRemarkToReception = new javax.swing.JTextArea();
        bUpdate = new javax.swing.JButton();
        bNew = new javax.swing.JButton();
        bGetData = new javax.swing.JButton();
        bGetNumberOfDays = new javax.swing.JButton();
        bGetTotal = new javax.swing.JButton();
        cYear = new javax.swing.JComboBox();
        cMounth = new javax.swing.JComboBox();
        cDay = new javax.swing.JComboBox();
        bPrint = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Accountancy");
        setBounds(new java.awt.Rectangle(250, 10, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Patient ID");
        jLabel3.setName("txtPatientId"); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 57, 118, 22);

        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 85, 118, 22);

        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Room Cost");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 114, 118, 22);

        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Services charges");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 143, 137, 22);

        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Date Of Joining");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 172, 118, 22);

        txtPatientId.setBackground(new java.awt.Color(153, 153, 255));
        txtPatientId.setForeground(new java.awt.Color(51, 51, 255));
        txtPatientId.setName("txtStaffId"); // NOI18N
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtPatientId);
        txtPatientId.setBounds(170, 58, 226, 20);

        txtName.setBackground(new java.awt.Color(153, 153, 255));
        txtName.setForeground(new java.awt.Color(51, 51, 255));
        txtName.setName("txtName"); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName);
        txtName.setBounds(170, 86, 226, 20);

        txtRoomCost.setBackground(new java.awt.Color(153, 153, 255));
        txtRoomCost.setForeground(new java.awt.Color(51, 51, 255));
        txtRoomCost.setName("txtRoomCost"); // NOI18N
        txtRoomCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomCostActionPerformed(evt);
            }
        });
        jPanel1.add(txtRoomCost);
        txtRoomCost.setBounds(170, 115, 226, 20);

        txtServicesCharges.setBackground(new java.awt.Color(153, 153, 255));
        txtServicesCharges.setForeground(new java.awt.Color(51, 51, 255));
        txtServicesCharges.setName("txtServicesCharges"); // NOI18N
        txtServicesCharges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServicesChargesActionPerformed(evt);
            }
        });
        jPanel1.add(txtServicesCharges);
        txtServicesCharges.setBounds(170, 144, 226, 20);

        txtDateOfJoining.setBackground(new java.awt.Color(153, 153, 255));
        txtDateOfJoining.setForeground(new java.awt.Color(51, 51, 255));
        txtDateOfJoining.setName("txtDateOfJoining"); // NOI18N
        txtDateOfJoining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfJoiningActionPerformed(evt);
            }
        });
        jPanel1.add(txtDateOfJoining);
        txtDateOfJoining.setBounds(170, 173, 226, 20);

        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Date Of Day");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 201, 118, 22);

        jLabel19.setForeground(new java.awt.Color(0, 0, 255));
        jLabel19.setText("Number Of Days");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(10, 230, 118, 22);

        txtNumberOfDays.setBackground(new java.awt.Color(153, 153, 255));
        txtNumberOfDays.setForeground(new java.awt.Color(51, 51, 255));
        txtNumberOfDays.setName("txtNumberOfDays"); // NOI18N
        txtNumberOfDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberOfDaysActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumberOfDays);
        txtNumberOfDays.setBounds(171, 231, 225, 20);

        jLabel20.setForeground(new java.awt.Color(0, 0, 255));
        jLabel20.setText("Total ");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(10, 258, 118, 22);

        txtTotal.setBackground(new java.awt.Color(153, 153, 255));
        txtTotal.setForeground(new java.awt.Color(51, 51, 255));
        txtTotal.setName("txtTotal"); // NOI18N
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotal);
        txtTotal.setBounds(170, 260, 225, 20);

        jLabel21.setForeground(new java.awt.Color(0, 0, 255));
        jLabel21.setText("Total Of Pay");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(10, 287, 118, 22);

        txtTotalOfPay.setBackground(new java.awt.Color(153, 153, 255));
        txtTotalOfPay.setForeground(new java.awt.Color(51, 51, 255));
        txtTotalOfPay.setText("0");
        txtTotalOfPay.setName("txtTotalOf Pay"); // NOI18N
        txtTotalOfPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalOfPayActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotalOfPay);
        txtTotalOfPay.setBounds(171, 288, 225, 20);

        jLabel22.setForeground(new java.awt.Color(0, 0, 255));
        jLabel22.setText("Remark To Reception");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(10, 320, 147, 22);

        txtRemarkToReception.setBackground(new java.awt.Color(153, 153, 255));
        txtRemarkToReception.setColumns(20);
        txtRemarkToReception.setForeground(new java.awt.Color(51, 51, 255));
        txtRemarkToReception.setRows(5);
        jScrollPane1.setViewportView(txtRemarkToReception);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(171, 320, 225, 96);

        bUpdate.setBackground(new java.awt.Color(153, 153, 255));
        bUpdate.setText("Send Message");
        bUpdate.setName("bUpdate"); // NOI18N
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(bUpdate);
        bUpdate.setBounds(490, 85, 148, 23);

        bNew.setBackground(new java.awt.Color(153, 153, 255));
        bNew.setText("New");
        bNew.setName("bNew"); // NOI18N
        bNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewActionPerformed(evt);
            }
        });
        jPanel1.add(bNew);
        bNew.setBounds(490, 114, 148, 23);

        bGetData.setBackground(new java.awt.Color(153, 153, 255));
        bGetData.setText("Get Data");
        bGetData.setName("bGetDate"); // NOI18N
        bGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGetDataActionPerformed(evt);
            }
        });
        jPanel1.add(bGetData);
        bGetData.setBounds(490, 143, 148, 23);

        bGetNumberOfDays.setBackground(new java.awt.Color(153, 153, 255));
        bGetNumberOfDays.setText("Get Number Of Days");
        bGetNumberOfDays.setName("bNumberOfDays"); // NOI18N
        bGetNumberOfDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGetNumberOfDaysActionPerformed(evt);
            }
        });
        jPanel1.add(bGetNumberOfDays);
        bGetNumberOfDays.setBounds(490, 172, 148, 23);

        bGetTotal.setBackground(new java.awt.Color(153, 153, 255));
        bGetTotal.setText("Get Total");
        bGetTotal.setName("bTotal"); // NOI18N
        bGetTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGetTotalActionPerformed(evt);
            }
        });
        jPanel1.add(bGetTotal);
        bGetTotal.setBounds(490, 201, 148, 23);

        cYear.setBackground(new java.awt.Color(153, 153, 255));
        cYear.setForeground(new java.awt.Color(51, 51, 255));
        cYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014-", "2015-", "2016-", "2017-", "2018-", "2020-", "2021-", "2022-", "2023-", "2024-", "2025-", "2026-", "2027-", "2028-", "2029-", "2030-" }));
        cYear.setSelectedIndex(-1);
        jPanel1.add(cYear);
        cYear.setBounds(170, 200, 80, 20);

        cMounth.setBackground(new java.awt.Color(153, 153, 255));
        cMounth.setForeground(new java.awt.Color(51, 51, 255));
        cMounth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1-", "2-", "3-", "4-", "5-", "6-", "7-", "8-", "9-", "10-", "11-", "12-" }));
        cMounth.setSelectedIndex(-1);
        jPanel1.add(cMounth);
        cMounth.setBounds(260, 200, 50, 20);

        cDay.setBackground(new java.awt.Color(153, 153, 255));
        cDay.setForeground(new java.awt.Color(51, 51, 255));
        cDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        cDay.setSelectedIndex(-1);
        jPanel1.add(cDay);
        cDay.setBounds(320, 200, 50, 20);

        bPrint.setBackground(new java.awt.Color(153, 153, 255));
        bPrint.setText("Print ");
        bPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bPrintMouseClicked(evt);
            }
        });
        bPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrintActionPerformed(evt);
            }
        });
        jPanel1.add(bPrint);
        bPrint.setBounds(490, 230, 150, 23);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("Print  All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(490, 260, 150, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system1/accountancy1.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 740, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtRoomCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomCostActionPerformed
    }//GEN-LAST:event_txtRoomCostActionPerformed

    private void txtServicesChargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServicesChargesActionPerformed
    }//GEN-LAST:event_txtServicesChargesActionPerformed

    private void txtDateOfJoiningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfJoiningActionPerformed
    }//GEN-LAST:event_txtDateOfJoiningActionPerformed

    private void txtNumberOfDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberOfDaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberOfDaysActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtTotalOfPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalOfPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalOfPayActionPerformed

    private void bGetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGetDataActionPerformed
        this.hide();
        PatientInfoTableForAccountancy f = new PatientInfoTableForAccountancy();
        f.setVisible(true);
    }//GEN-LAST:event_bGetDataActionPerformed

    private void bGetNumberOfDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGetNumberOfDaysActionPerformed






        try {
            int y = (Date.valueOf(cYear.getSelectedItem().toString() + cMounth.getSelectedItem().toString() + cDay.getSelectedItem().toString()).getYear() - Date.valueOf(txtDateOfJoining.getText().toString()).getYear()) * 365;
            int m = (Date.valueOf(cYear.getSelectedItem().toString() + cMounth.getSelectedItem().toString() + cDay.getSelectedItem().toString()).getMonth() - Date.valueOf(txtDateOfJoining.getText().toString()).getMonth()) * 30;
            int d = (Date.valueOf(cYear.getSelectedItem().toString() + cMounth.getSelectedItem().toString() + cDay.getSelectedItem().toString()).getDate() - Date.valueOf(txtDateOfJoining.getText().toString()).getDate()) * 1;
            int numberOfDays = y + m + d;
            txtNumberOfDays.setText(numberOfDays + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }




        /*
         try{
         int y = (Date.valueOf("2015-2-2").getYear()-Date.valueOf("2015-3-4").getYear())*365;  
         int m = (Date.valueOf("2015-2-2").getMonth()-Date.valueOf("2015-3-4").getMonth())*30;
         int d = (Date.valueOf("2015-2-2").getDay()-Date.valueOf("2015-3-4").getDay());
         System.out.print(y+m+d);
   
         }
         catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
         }
        
         */


    }//GEN-LAST:event_bGetNumberOfDaysActionPerformed

    private void bGetTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGetTotalActionPerformed

        int numberOfDays = Integer.valueOf(txtNumberOfDays.getText());
        int servicesCharges = Integer.valueOf(txtServicesCharges.getText());
        int roomCost = Integer.valueOf(txtRoomCost.getText());
        int pay = Integer.valueOf(txtTotalOfPay.getText());
        int total = ((numberOfDays * roomCost) + (numberOfDays * servicesCharges) - pay);
        txtTotal.setText(total + "");

    }//GEN-LAST:event_bGetTotalActionPerformed

    private void bNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewActionPerformed

        reset();

    }//GEN-LAST:event_bNewActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed

        try {
            con = Connect.ConnectDB();
            String sql = "update Patient0 set TotalOfPay='" + txtTotalOfPay.getText().toString() + "' ,RemarkToReceptionFromAccountant='" + txtRemarkToReception.getText().toString() + "' where PatientId='" + txtPatientId.getText().toString() + "'";

            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Successfully updated", "Staff Record", JOptionPane.INFORMATION_MESSAGE);
            bUpdate.setEnabled(false);

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

    }//GEN-LAST:event_bUpdateActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
    }//GEN-LAST:event_txtNameActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        con = Connect.ConnectDB();




    }//GEN-LAST:event_formWindowOpened

    private void bPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrintActionPerformed

        try {
            JasperDesign j = JRXmlLoader.load("patient.jrxml");
            String sql = "select * from  Patient0 where PatientId='" + txtPatientId.getText() + "'";
            JRDesignQuery newquery = new JRDesignQuery();
            newquery.setText(sql);
            j.setQuery(newquery);
            JasperReport jj = JasperCompileManager.compileReport(j);
            JasperPrint jjj = JasperFillManager.fillReport(jj, null, con);
            JasperViewer.viewReport(jjj);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_bPrintActionPerformed

    private void bPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bPrintMouseClicked
    }//GEN-LAST:event_bPrintMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
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
        
    }//GEN-LAST:event_jButton1ActionPerformed
    private void reset() {
        txtPatientId.setText("");
        txtName.setText("");
        txtRoomCost.setText("");
        txtServicesCharges.setText("");
        txtDateOfJoining.setText("");
        cDay.setSelectedIndex(-1);
        cMounth.setSelectedIndex(-1);
        cYear.setSelectedIndex(-1);
        txtNumberOfDays.setText("");
        txtTotal.setText("");
        txtTotalOfPay.setText("");
        txtRemarkToReception.setText("");
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
            java.util.logging.Logger.getLogger(Accountancy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accountancy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accountancy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accountancy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accountancy().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bGetData;
    public javax.swing.JButton bGetNumberOfDays;
    public javax.swing.JButton bGetTotal;
    public javax.swing.JButton bNew;
    private javax.swing.JButton bPrint;
    public javax.swing.JButton bUpdate;
    private javax.swing.JComboBox cDay;
    private javax.swing.JComboBox cMounth;
    private javax.swing.JComboBox cYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txtDateOfJoining;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtNumberOfDays;
    public javax.swing.JTextField txtPatientId;
    public javax.swing.JTextArea txtRemarkToReception;
    public javax.swing.JTextField txtRoomCost;
    public javax.swing.JTextField txtServicesCharges;
    public javax.swing.JTextField txtTotal;
    public javax.swing.JTextField txtTotalOfPay;
    // End of variables declaration//GEN-END:variables
}
