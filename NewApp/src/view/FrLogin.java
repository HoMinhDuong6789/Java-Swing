/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import model.bean.User;
import model.table.UserTable;

/**
 *
 * @author Minh_PC
 */
public class FrLogin extends javax.swing.JFrame {

    private UserTable userTable;

    /**
     * Creates new form FrLogin
     */
    public FrLogin() {
        initComponents();
        userTable = new UserTable(null);
        tfUserName.setBackground(new Color(0, 0, 0, 0));
        this.setIconImage(new ImageIcon(getClass().getResource("/imagess/icon.png")).getImage());
        pfPass.setBackground(new Color(0, 0, 0, 0));
        btLogin.setBackground(new Color(0, 0, 0, 0));
        lbThongBao.setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfUserName = new javax.swing.JTextField();
        pfPass = new javax.swing.JPasswordField();
        btLogin = new javax.swing.JButton();
        lbThongBao = new javax.swing.JLabel();
        lbHianhAnh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("::NewApp Management:: - Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfUserName.setToolTipText("User Name");
        tfUserName.setBorder(null);
        getContentPane().add(tfUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 260, 30));

        pfPass.setToolTipText("Pass Word");
        pfPass.setBorder(null);
        pfPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pfPassKeyReleased(evt);
            }
        });
        getContentPane().add(pfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 260, 30));

        btLogin.setToolTipText("Login");
        btLogin.setBorder(null);
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 350, 40));

        lbThongBao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbThongBao.setForeground(new java.awt.Color(204, 102, 0));
        getContentPane().add(lbThongBao, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 24, 330, 30));

        lbHianhAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/frlogin.png"))); // NOI18N
        lbHianhAnh.setText("jLabel1");
        getContentPane().add(lbHianhAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 579, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
      login();
    }//GEN-LAST:event_btLoginActionPerformed
public void login(){
      String username = tfUserName.getText();
        String pass = new String(pfPass.getPassword());

        //
        User objUser = userTable.checklogin(username, pass);
        if (objUser != null) {
            //adng n hap tanh cong
            FrMain frMain = new FrMain(objUser);
            frMain.setVisible(true);
            this.dispose();
        } else {
            //dang nhap that bai
            lbThongBao.setText("sai ten dang nhap or mat khau!");
            tfUserName.requestFocus();
        }
}
    
    private void pfPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfPassKeyReleased
       if(KeyEvent.VK_ENTER==evt.getKeyCode()){
           login();
       }
    }//GEN-LAST:event_pfPassKeyReleased

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JLabel lbHianhAnh;
    private javax.swing.JLabel lbThongBao;
    private javax.swing.JPasswordField pfPass;
    private javax.swing.JTextField tfUserName;
    // End of variables declaration//GEN-END:variables
}
