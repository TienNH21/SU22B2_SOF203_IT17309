package lesson1_swing_container;

import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class DemoFrame extends javax.swing.JFrame {
    public DemoFrame() {
        initComponents();
        
        Icon icon = new ImageIcon("cat.png");
        this.lblPicture.setIcon(icon);
        
        this.btnCat.setIcon(icon);
        this.txtPwd.setEchoChar('$');
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtClassName = new javax.swing.JTextField();
        lblPicture = new javax.swing.JLabel();
        btnCat = new javax.swing.JButton();
        txtPwd = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IT17309");
        setBackground(new java.awt.Color(255, 51, 204));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 300));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Demo Border", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 15), new java.awt.Color(255, 0, 51))); // NOI18N

        txtClassName.setText("IT17309");
        txtClassName.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtClassNameInputMethodTextChanged(evt);
            }
        });
        txtClassName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtClassNamePropertyChange(evt);
            }
        });
        txtClassName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClassNameKeyReleased(evt);
            }
        });

        lblPicture.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCat.setText("Click me");
        btnCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatActionPerformed(evt);
            }
        });

        txtPwd.setText("123123");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPwd, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtClassName, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(lblPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(btnCat)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtClassName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCat, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClassNameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtClassNameInputMethodTextChanged
        String txt = this.txtClassName.getText();
        System.out.println(txt);
    }//GEN-LAST:event_txtClassNameInputMethodTextChanged

    private void txtClassNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClassNameKeyReleased
        String txt = this.txtClassName.getText();
        System.out.println(txt);
    }//GEN-LAST:event_txtClassNameKeyReleased

    private void txtClassNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtClassNamePropertyChange
        System.out.println("------");
    }//GEN-LAST:event_txtClassNamePropertyChange

    private void btnCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatActionPerformed
//        Icon icon = new ImageIcon("cat.png");
//        JOptionPane.showConfirmDialog(
//            this,
//            "Bạn chưa có ng yêu nhỉ?",
//            "Demo Confirm", 
//            JOptionPane.YES_NO_OPTION,
//            JOptionPane.QUESTION_MESSAGE,
//            icon
//        );

        JFileChooser fChooser = new JFileChooser();
        // https://stackoverflow.com/a/13521592
        int result = fChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File f = fChooser.getSelectedFile();
            Icon icon = new ImageIcon(f.getAbsolutePath());
            this.lblPicture.setIcon(icon);
        }
    }//GEN-LAST:event_btnCatActionPerformed

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
            java.util.logging.Logger.getLogger(DemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DemoFrame frame = new DemoFrame();
                frame.setSize(500, 500);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setVisible(true);
//                frame.getContentPane()
//                    .setBackground(new java.awt.Color(255, 51, 204));
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JTextField txtClassName;
    private javax.swing.JPasswordField txtPwd;
    // End of variables declaration//GEN-END:variables
}
