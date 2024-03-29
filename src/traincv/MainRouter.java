/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traincv;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author TheOnlyMonkey
 */
public class MainRouter extends javax.swing.JFrame {
    private TrainCascade trainCascade;
    private CreateSamples createSamples;
    private ImageList imageList;
    public String workingDirectory;
    /**
     * Creates new form MainRouter
     */
    public MainRouter() {
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

        btnCreateSamples = new javax.swing.JButton();
        btnListImasges = new javax.swing.JButton();
        btnTrainCascade = new javax.swing.JButton();
        txtWorkingDirectory = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnFileChooser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCreateSamples.setText("Create Samples");
        btnCreateSamples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateSamplesActionPerformed(evt);
            }
        });

        btnListImasges.setText("List Images");
        btnListImasges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListImasgesActionPerformed(evt);
            }
        });

        btnTrainCascade.setText("TrainCascade");
        btnTrainCascade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrainCascadeActionPerformed(evt);
            }
        });

        jLabel1.setText("Working Directory");

        jLabel2.setText("Training");

        btnFileChooser.setText("=");
        btnFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileChooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtWorkingDirectory)
                            .addComponent(btnCreateSamples, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListImasges, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTrainCascade, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWorkingDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnFileChooser))
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnCreateSamples, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTrainCascade)
                .addGap(18, 18, 18)
                .addComponent(btnListImasges)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListImasgesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListImasgesActionPerformed
        // TODO add your handling code here:
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                imageList = new ImageList();
                imageList.setVisible(true);
            }
        });
        
    }//GEN-LAST:event_btnListImasgesActionPerformed

    private void btnCreateSamplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateSamplesActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                createSamples = new CreateSamples();
                createSamples.setVisible(true);
            }
        });
        
    }//GEN-LAST:event_btnCreateSamplesActionPerformed

    private void btnTrainCascadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrainCascadeActionPerformed
        // TODO add your handling code here:
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                trainCascade = new TrainCascade();
                trainCascade.setVisible(true);
            }
        });
    }//GEN-LAST:event_btnTrainCascadeActionPerformed

    private void btnFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileChooserActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser("c:\\Dev");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        int choice = chooser.showOpenDialog(null);
        if(choice == JFileChooser.OPEN_DIALOG){
            File dir = chooser.getSelectedFile();
            System.out.println("Selected Directory: " + dir.getAbsolutePath());
            txtWorkingDirectory.setText(dir.getAbsolutePath());
            workingDirectory = dir.getAbsolutePath();
        }
        
    }//GEN-LAST:event_btnFileChooserActionPerformed

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
            java.util.logging.Logger.getLogger(MainRouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainRouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainRouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainRouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainRouter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateSamples;
    private javax.swing.JButton btnFileChooser;
    private javax.swing.JButton btnListImasges;
    private javax.swing.JButton btnTrainCascade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField txtWorkingDirectory;
    // End of variables declaration//GEN-END:variables
}
