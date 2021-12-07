package hospital.management.system1;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ChangePassword extends javax.swing.JFrame {
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public ChangePassword() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bOk = new javax.swing.JButton();
        txtOldPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtUserName = new javax.swing.JPasswordField();
        txtNewPassword1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Password");
        setBounds(new java.awt.Rectangle(350, 0, 0, 0));
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Old Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 110, 118, 22);

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("User Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 79, 118, 22);

        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("New Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 140, 118, 22);

        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Confirm Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 170, 118, 22);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("Cancel");
        jButton1.setName("bCancel"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(230, 250, 138, 23);

        bOk.setBackground(new java.awt.Color(153, 153, 255));
        bOk.setText("Ok");
        bOk.setName("bOk"); // NOI18N
        bOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOkActionPerformed(evt);
            }
        });
        jPanel1.add(bOk);
        bOk.setBounds(50, 250, 138, 23);

        txtOldPassword.setBackground(new java.awt.Color(153, 153, 255));
        txtOldPassword.setForeground(new java.awt.Color(51, 51, 255));
        txtOldPassword.setName("txtOldPassword"); // NOI18N
        jPanel1.add(txtOldPassword);
        txtOldPassword.setBounds(170, 110, 160, 20);

        txtConfirmPassword.setBackground(new java.awt.Color(153, 153, 255));
        txtConfirmPassword.setForeground(new java.awt.Color(51, 51, 255));
        txtConfirmPassword.setName("txtNewPassword"); // NOI18N
        jPanel1.add(txtConfirmPassword);
        txtConfirmPassword.setBounds(170, 170, 160, 20);

        txtUserName.setBackground(new java.awt.Color(153, 153, 255));
        txtUserName.setForeground(new java.awt.Color(51, 51, 255));
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserName);
        txtUserName.setBounds(170, 80, 160, 20);

        txtNewPassword1.setBackground(new java.awt.Color(153, 153, 255));
        txtNewPassword1.setForeground(new java.awt.Color(51, 51, 255));
        txtNewPassword1.setName("txtNewPassword"); // NOI18N
        txtNewPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPassword1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNewPassword1);
        txtNewPassword1.setBounds(170, 140, 160, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system1/password.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(-6, 0, 550, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.dispose();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOkActionPerformed
       try{
         String Newpass=String.valueOf(txtNewPassword1.getPassword());
         String ConfPass=String.valueOf(txtConfirmPassword.getPassword());
        String OldPass=String.valueOf(txtOldPassword.getPassword());
        String uName=txtUserName.getText();
        if (uName.equals("")) {
              
                JOptionPane.showMessageDialog( this, "Please enter a username",
                                          "Error", JOptionPane.ERROR_MESSAGE);
                return;
               
            } else if (OldPass.equals("")) {
            
                JOptionPane.showMessageDialog( this, "Please enter a old password",
                                          "Error", JOptionPane.ERROR_MESSAGE);
                return;
               
            } else if (Newpass.equals("")) {
              
                JOptionPane.showMessageDialog( this, "Please enter a new password",
                                          "Error", JOptionPane.ERROR_MESSAGE);
                return;
                
            } else if (ConfPass.equals("")) {
               
                JOptionPane.showMessageDialog( this, "Please enter a confirmed password",
                                          "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } 
               else if (Newpass.length()< 5) {
               
                JOptionPane.showMessageDialog(this,
                                         "The New Password Should be of Atleast 5 Characters",
                                         "Error", JOptionPane.ERROR_MESSAGE);
                return;
               }
            
           
            
            else if ((Newpass).equals(OldPass)) {
                
               JOptionPane.showMessageDialog(this,
                                         "Password is same..Re-enter new password","Error", JOptionPane.ERROR_MESSAGE);
               return;
            }
    else if (!(Newpass).equals(ConfPass)) {
               
                JOptionPane.showMessageDialog(this,
                                         "New Password doesn't match with Confirmed Password",
                                         "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
       
      con=Connect.ConnectDB();
      String sql= "select UserName,Password from Users where UserName='" + txtUserName.getText() + "' and Password= '" + txtOldPassword.getText() + "'";
      pst=con.prepareStatement(sql);
      rs= pst.executeQuery();
      while(rs.next())
        {
            String usrname = rs.getString("UserName").trim();
            String passwd = rs.getString("password").trim();
            if(uName.equals(usrname) && OldPass.equals(passwd))
            {
                 con=Connect.ConnectDB();
                 String sql1= "update Users set Password= '" + Newpass + "' where UserName= '" + uName + "' and Password = '" + OldPass + "'";
                 Statement stmt = con.createStatement();
                 stmt.execute(sql1.toString());
                 stmt.close();
                 JOptionPane.showMessageDialog(this,"Password Successfully Changed");
                 this.dispose();
                 return;
              }
            else
            {
             JOptionPane.showMessageDialog(this,"invalid user name or password","Error", JOptionPane.ERROR_MESSAGE);   
             txtUserName.setText("");
             txtOldPassword.setText("");
             txtOldPassword.setText("");
             txtConfirmPassword.setText("");
             return;
            }
        }    
        }catch(SQLException | HeadlessException ex){
           JOptionPane.showMessageDialog(this,ex); 
        }
    }//GEN-LAST:event_bOkActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtNewPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPassword1ActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bOk;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtNewPassword1;
    private javax.swing.JPasswordField txtOldPassword;
    private javax.swing.JPasswordField txtUserName;
    // End of variables declaration//GEN-END:variables
}
