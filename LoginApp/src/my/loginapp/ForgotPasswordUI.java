/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.loginapp;

/**
 *
 * @author keshavgupta
 */
public class ForgotPasswordUI extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPasswordUI
     */
    public ForgotPasswordUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ForgotPassTitle = new javax.swing.JLabel();
        UsernameLabelFP = new javax.swing.JLabel();
        UsernameFieldFP = new javax.swing.JTextField();
        SetPasswordButton = new javax.swing.JButton();
        passwordReturn = new javax.swing.JLabel();
        ReturnHelper = new javax.swing.JLabel();
        NewPassField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 400, 230));
        setMaximumSize(new java.awt.Dimension(410, 230));
        setMinimumSize(new java.awt.Dimension(410, 230));

        ForgotPassTitle.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        ForgotPassTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ForgotPassTitle.setText("Forgot Password");

        UsernameLabelFP.setText("Username:");

        SetPasswordButton.setText("Set Password");
        SetPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetPasswordButtonActionPerformed(evt);
            }
        });

        passwordReturn.setText("New Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameLabelFP)
                    .addComponent(passwordReturn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ForgotPassTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UsernameFieldFP, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(NewPassField))
                        .addGap(23, 23, 23)
                        .addComponent(ReturnHelper, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SetPasswordButton)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ForgotPassTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabelFP)
                    .addComponent(UsernameFieldFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReturnHelper, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(SetPasswordButton)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SetPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetPasswordButtonActionPerformed
        String getUsername = UsernameFieldFP.getText();
        String getPass = String.valueOf(NewPassField.getPassword());
        System.out.println(my.loginapp.LoginViewUI.accounts + "heyo");
        if(getPass.matches(".*\\d.*") && getPass.matches("(?s).*[A-Z].*") && getPass.matches(".*\\W.*")){
            for (int i=0; i < my.loginapp.LoginViewUI.accounts.size();i++){
                if(my.loginapp.LoginViewUI.accounts.get(i).equals(getUsername)){
                    my.loginapp.LoginViewUI.accounts.set(i+1,getPass);
                    ReturnHelper.setText("Updated Password");
                    System.out.println(my.loginapp.LoginViewUI.accounts);
                    return;
                }
            }
            ReturnHelper.setText("Username DNE");
        }else{
            ReturnHelper.setText("Password Weak");
        }
    }//GEN-LAST:event_SetPasswordButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPasswordUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPasswordUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ForgotPassTitle;
    private javax.swing.JPasswordField NewPassField;
    private javax.swing.JLabel ReturnHelper;
    private javax.swing.JButton SetPasswordButton;
    private javax.swing.JTextField UsernameFieldFP;
    private javax.swing.JLabel UsernameLabelFP;
    private javax.swing.JLabel passwordReturn;
    // End of variables declaration//GEN-END:variables
}
