package hospital.management.system1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class PatientInfoTableForAccountancy extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    ResultSet rs2 = null;
    PreparedStatement pst2 = null;

    public PatientInfoTableForAccountancy() {
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
        txtID = new javax.swing.JTextField();
        bSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patient Info");
        setBounds(new java.awt.Rectangle(200, 0, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jTable1.setBackground(new java.awt.Color(102, 255, 255));
        jTable1.setToolTipText("");
        jTable1.setName("tabPatientInfoForAccountancy"); // NOI18N
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("ID");

        txtID.setBackground(new java.awt.Color(153, 153, 255));
        txtID.setForeground(new java.awt.Color(51, 51, 255));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        bSearch.setBackground(new java.awt.Color(153, 153, 255));
        bSearch.setForeground(new java.awt.Color(153, 153, 255));
        bSearch.setText("Search");
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(bSearch)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      Accountancy f=new Accountancy();
      f.setVisible(true);


    }//GEN-LAST:event_formWindowClosing

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        try {
            con = Connect.ConnectDB();
            int row = jTable1.getSelectedRow();
            String table_click = jTable1.getModel().getValueAt(row, 0).toString();
            // String sql = "select * from Patient0,Room where Room.PatientId = '" + table_click + "'";
            String sql = "select  Patient0.PatientId ,Patient0.Name ,Room.Cost ,Room.ServiceCharges , Patient0.TotalOfPay as'Total Of Pay',Patient0.DateOfJoining ,Patient0.TotalOfPay  from Room, Patient0  where Patient0.PatientId = '" + table_click + "'";

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                this.hide();
                Accountancy frm = new Accountancy();
                frm.setVisible(true);
                String add1 = rs.getString("Patient0.PatientId");
                frm.txtPatientId.setText(add1);
                String add2 = rs.getString("Patient0.Name");
                frm.txtName.setText(add2);
                String add3 = rs.getString("Room.Cost");
                frm.txtRoomCost.setText(add3);
                String add4 = rs.getString("Room.ServiceCharges");
                frm.txtServicesCharges.setText(add4);
                String add5 = rs.getString("Patient0.DateOfJoining");
                frm.txtDateOfJoining.setText(add5);
                String add6 = rs.getString("Patient0.TotalOfPay");
                frm.txtTotalOfPay.setText(add6);
                frm.bUpdate.setEnabled(true);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed

        // String sql = "select * from Patient0 where PatientId= '" + txtID.getText().toString() + "'" ;
        //String sql="select PatientId as 'Patient ID',Cost as'Cost',ServiceCharges as'Service Charges'  from Room where PatientId= '" + txtID.getText().toString() + "'" ;
        // String sql2="Select DateOfJoining as'Date Of Joining', Name as 'Name',TotalOfPay as'Total Of Pay' from Patient0 where PatientId='"+txtID.getText().toString()+"'";
        String sql3 = "select  Patient0.PatientId as 'Patient ID',Patient0.Name as'Name',Room.Cost as'Cost'  ,Room.ServiceCharges as 'Services Charges', Patient0.DateOfJoining as'Date Of Joining',Patient0.TotalOfPay as'Total Of Pay' from Patient0,Room where Patient0.PatientId= '" + txtID.getText().toString() + "'";
       

        try {
            con = Connect.ConnectDB();
            pst = con.prepareStatement(sql3);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            // pst2 = con.prepareStatement(sql2);
            //rs2= pst2.executeQuery();
            //jTable1.setModel(DbUtils.resultSetToTableModel(rs2));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_bSearchActionPerformed
    /*
     private void GetData() {

     Doctor frm = new Doctor();
     String sql = "select PatientId as 'Patient ID', Name as 'Name',RoomCost  as 'Room Cost',ServicesCharges  as 'Services charges',DateOfJoining as 'Date Of Joining' from Patient where PatientIdID = '" + frm.txtPatientId.getText().toString() + "'";
     try {

     pst = con.prepareStatement(sql);
     rs = pst.executeQuery();
     jTable1.setModel(DbUtils.resultSetToTableModel(rs));
     } catch (Exception e) {
     JOptionPane.showMessageDialog(null, e);

     }
     }
     */

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
            java.util.logging.Logger.getLogger(PatientInfoTableForAccountancy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientInfoTableForAccountancy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientInfoTableForAccountancy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientInfoTableForAccountancy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientInfoTableForAccountancy().setVisible(true);
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
