/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author aa
 */
public class loginPage extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public loginPage() {
        initComponents();
   
        
    }
    
//            names [0] = "Journy to the centre of the earth" ;
//            names [1] = "Moby Dic" ;
//            names [2] = "King Kong" ;
//            names [3] = "Game Of Thrones" ;
//            names [4] = "Islam Story" ;
//       Book book1 = new Book(5 , names ,500, "john Arin", 5) ;


String Name=""; 
long Tel_number=0;
String Address="";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setForeground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userTextField.setBorder(null);
        userTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(userTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 200, 20));

        passwordField.setText("jPasswordField1");
        passwordField.setActionCommand("");
        passwordField.setBorder(null);
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordFieldMousePressed(evt);
            }
        });
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordFieldKeyTyped(evt);
            }
        });
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 190, 20));

        loginButton.setBackground(new java.awt.Color(0, 0, 0));
        loginButton.setBorder(null);
        loginButton.setBorderPainted(false);
        loginButton.setContentAreaFilled(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 260, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jframe/icons8_cancel_32px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Asset 5@2x.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
 if (evt.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("Besho") && pwdText.equalsIgnoreCase("12345")) {
              new welcomepage().setVisible(true);
                JFrame welcomepage = new JFrame();
                welcomepage.setResizable(false);
                welcomepage.setLocationRelativeTo(null);
 Name="Besho"; 
Tel_number=0124;
Address="Giza";
            } 

            else if (userText.equalsIgnoreCase("Hesham") && pwdText.equalsIgnoreCase("12345")) {
                new welcomepage().setVisible(true);
                JFrame welcomepage = new JFrame();
                welcomepage.setResizable(false);
                welcomepage.setLocationRelativeTo(null);
                
Name="Hesham"; 
Tel_number=0114;
Address="Haram";
            }else if (userText.equalsIgnoreCase("Abdullah") && pwdText.equalsIgnoreCase("12345")) {
                new welcomepage().setVisible(true);
                JFrame welcomepage = new JFrame();
                welcomepage.setResizable(false);
                welcomepage.setLocationRelativeTo(null);
Name="Abdullah"; 
Tel_number=0324;
Address="October";
            }else if (userText.equalsIgnoreCase("Hazem") && pwdText.equalsIgnoreCase("12345")) {
                new welcomepage().setVisible(true);
                JFrame welcomepage = new JFrame();
                welcomepage.setResizable(false);
                welcomepage.setLocationRelativeTo(null);
Name="Hazem"; 
Tel_number=0144;
Address="Cairo";
            }

            
            else if (userText.equalsIgnoreCase("Shehab") && pwdText.equalsIgnoreCase("12345")) {
                new welcomepage().setVisible(true);
                JFrame welcomepage = new JFrame();
                welcomepage.setResizable(false);
                welcomepage.setLocationRelativeTo(null);
Name="Shehab"; 
Tel_number=0624;
Address="Qanater";
            } else if (userText.equalsIgnoreCase("Sleem") && pwdText.equalsIgnoreCase("12345")) {
                new welcomepage().setVisible(true);
                JFrame welcomepage = new JFrame();
                welcomepage.setResizable(false);
                welcomepage.setLocationRelativeTo(null);
Name="Sleem"; 
Tel_number=0714;
Address="Oboor";
            }else{
                 
                 JOptionPane.showMessageDialog(null, "Invalid username or password");

                
            }
        }
       


// TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void userTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextFieldActionPerformed

    private void passwordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyTyped
     
    }//GEN-LAST:event_passwordFieldKeyTyped

    private void passwordFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldMousePressed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        dispose(); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MousePressed

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
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);

            }
           /* new VideoBackground().setVisible(true);*/
            /* MP3Player Player = new MP3Player (new File("‪D:\\project\\8d audio.wav"));*/
       
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
