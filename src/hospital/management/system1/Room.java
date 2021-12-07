package hospital.management.system1;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Room extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement stmt;

    public Room() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRoomNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cDepartment = new javax.swing.JComboBox();
        cType = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cStatus = new javax.swing.JComboBox();
        txtCost = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bGetData = new javax.swing.JButton();
        bNew = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        txtServiceCharges = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Room");
        setBounds(new java.awt.Rectangle(350, 0, 0, 0));
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Type");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 115, 118, 22);

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Room Number");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 82, 118, 22);

        txtRoomNumber.setBackground(new java.awt.Color(153, 153, 255));
        txtRoomNumber.setForeground(new java.awt.Color(51, 51, 255));
        txtRoomNumber.setName("txtRoomNumber"); // NOI18N
        jPanel1.add(txtRoomNumber);
        txtRoomNumber.setBounds(160, 83, 154, 20);

        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Department");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 148, 118, 22);

        cDepartment.setBackground(new java.awt.Color(153, 153, 255));
        cDepartment.setForeground(new java.awt.Color(51, 51, 255));
        cDepartment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Orthopedic Surgery", "Cardiac Surgery", "Dermatology", "Chest Diseases", "Obstetrics and Gynecology", "Ophthalmology", "Dental ", "Internal Medicine" }));
        cDepartment.setSelectedIndex(-1);
        cDepartment.setName("cDepartment"); // NOI18N
        cDepartment.setRequestFocusEnabled(false);
        cDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDepartmentActionPerformed(evt);
            }
        });
        jPanel1.add(cDepartment);
        cDepartment.setBounds(160, 148, 154, 22);

        cType.setBackground(new java.awt.Color(153, 153, 255));
        cType.setForeground(new java.awt.Color(51, 51, 255));
        cType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "4", "6" }));
        cType.setSelectedIndex(-1);
        cType.setName("cType"); // NOI18N
        cType.setRequestFocusEnabled(false);
        cType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTypeActionPerformed(evt);
            }
        });
        jPanel1.add(cType);
        cType.setBounds(160, 115, 154, 22);

        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Cost");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 181, 118, 22);

        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Status");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 209, 118, 22);

        cStatus.setBackground(new java.awt.Color(153, 153, 255));
        cStatus.setForeground(new java.awt.Color(51, 51, 255));
        cStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "empty", " ", " " }));
        cStatus.setSelectedIndex(-1);
        cStatus.setName("cDepartment"); // NOI18N
        cStatus.setRequestFocusEnabled(false);
        cStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cStatusActionPerformed(evt);
            }
        });
        jPanel1.add(cStatus);
        cStatus.setBounds(160, 209, 154, 22);

        txtCost.setBackground(new java.awt.Color(153, 153, 255));
        txtCost.setForeground(new java.awt.Color(51, 51, 255));
        txtCost.setName("txtRoomNumber"); // NOI18N
        jPanel1.add(txtCost);
        txtCost.setBounds(160, 182, 154, 20);

        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Service Charges");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 237, 118, 22);

        bGetData.setBackground(new java.awt.Color(153, 153, 255));
        bGetData.setText("Get Data");
        bGetData.setName("bGetDate"); // NOI18N
        bGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGetDataActionPerformed(evt);
            }
        });
        jPanel1.add(bGetData);
        bGetData.setBounds(350, 170, 138, 23);

        bNew.setBackground(new java.awt.Color(153, 153, 255));
        bNew.setText("New");
        bNew.setName("bNew"); // NOI18N
        bNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewActionPerformed(evt);
            }
        });
        jPanel1.add(bNew);
        bNew.setBounds(350, 200, 138, 23);

        bUpdate.setBackground(new java.awt.Color(153, 153, 255));
        bUpdate.setText("Update");
        bUpdate.setName("bUpdate"); // NOI18N
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(bUpdate);
        bUpdate.setBounds(350, 140, 138, 23);

        bSave.setBackground(new java.awt.Color(153, 153, 255));
        bSave.setText("Save");
        bSave.setName("bSave"); // NOI18N
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });
        jPanel1.add(bSave);
        bSave.setBounds(350, 80, 138, 23);

        bDelete.setBackground(new java.awt.Color(153, 153, 255));
        bDelete.setText("Delete");
        bDelete.setName("bDelete"); // NOI18N
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(bDelete);
        bDelete.setBounds(350, 110, 138, 23);

        txtServiceCharges.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.add(txtServiceCharges);
        txtServiceCharges.setBounds(160, 240, 160, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system1/rooms.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-6, 0, 590, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bGetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGetDataActionPerformed
this.hide();
        RoomInfo f = new RoomInfo();
        f.setVisible(true);
    }//GEN-LAST:event_bGetDataActionPerformed

    private void cDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDepartmentActionPerformed
    }//GEN-LAST:event_cDepartmentActionPerformed

    private void cTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cTypeActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed

        try {
            con = Connect.ConnectDB();
            if (txtRoomNumber.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter room no.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cType.getSelectedItem().toString().equals("")) {
                JOptionPane.showMessageDialog(this, "Please select room type", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (cDepartment.getSelectedItem().toString().equals("")) {
                JOptionPane.showMessageDialog(this, "Please select Department", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtCost.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter room Charges", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cStatus.getSelectedItem().toString().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter room status", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtServiceCharges.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Sservice Charges ", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }


           
           
            String sql1 = "Select RoomNumber from Room where RoomNumber= '" + txtRoomNumber.getText().toString() + "'and Department='"+cDepartment.getSelectedItem().toString()+"'";
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql1);
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Room Number. already exists", "Error", JOptionPane.ERROR_MESSAGE);
                txtRoomNumber.setText("");
                txtRoomNumber.requestDefaultFocus();
                return;
            }

           
            String sql = "insert into Room(RoomNumber,Type,Department,Cost,Status,ServiceCharges)values('" + txtRoomNumber.getText() + "','" + cType.getSelectedItem() + "','" + cDepartment.getSelectedItem() + "','" + txtCost.getText() + "','" + cStatus.getSelectedItem() + "','"+txtServiceCharges.getText().toString()+"' )";
             pst=con.prepareStatement(sql);
            pst.execute();
            

            JOptionPane.showMessageDialog(this, "Successfully saved", "Room Record", JOptionPane.INFORMATION_MESSAGE);
            bSave.setEnabled(false);
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }



    }//GEN-LAST:event_bSaveActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed

        try {
                if (txtRoomNumber.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter room number.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
                 if (txtServiceCharges.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Service Charges", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cType.getSelectedItem().toString().equals("")) {
                JOptionPane.showMessageDialog(this, "Please select room type", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (cDepartment.getSelectedItem().toString().equals("")) {
                JOptionPane.showMessageDialog(this, "Please select Department", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           
            int P = JOptionPane.showConfirmDialog(null, " Are you sure want to delete ?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (P == 0) {
                con = Connect.ConnectDB();

                String sql = "delete from Room where RoomNumber = '" + txtRoomNumber.getText().toString() + "'";
                pst = con.prepareStatement(sql);
                pst.execute();
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
            String sql = "update Room set RoomNumber='" + txtRoomNumber.getText().toString() + "',ServiceCharges='" + txtServiceCharges.getText().toString() +"',Type='"+ cType.getSelectedItem().toString() + "',Department='" + cDepartment.getSelectedItem().toString() + "',Cost='" + txtCost.getText().toString() + "' where RoomNumber='" + txtRoomNumber.getText().toString() + "'";
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Successfully updated", "Room Record", JOptionPane.INFORMATION_MESSAGE);
            bUpdate.setEnabled(false);
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }




    }//GEN-LAST:event_bUpdateActionPerformed

    private void bNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewActionPerformed

        reset();

    }//GEN-LAST:event_bNewActionPerformed

    private void cStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cStatusActionPerformed

    private void reset() {
        txtRoomNumber.setText("");
        cType.setSelectedIndex(-1);
        cDepartment.setSelectedIndex(-1);
        cStatus.setSelectedIndex(-1);
        txtCost.setText("");
        txtCost.setText("");
        txtServiceCharges.setText("");
        bSave.setEnabled(true);
        bDelete.setEnabled(true);
        bUpdate.setEnabled(true);
        txtRoomNumber.requestDefaultFocus();

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bDelete;
    public javax.swing.JButton bGetData;
    public javax.swing.JButton bNew;
    public javax.swing.JButton bSave;
    public javax.swing.JButton bUpdate;
    public javax.swing.JComboBox cDepartment;
    public javax.swing.JComboBox cStatus;
    public javax.swing.JComboBox cType;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtCost;
    public javax.swing.JTextField txtRoomNumber;
    protected javax.swing.JTextField txtServiceCharges;
    // End of variables declaration//GEN-END:variables
}
