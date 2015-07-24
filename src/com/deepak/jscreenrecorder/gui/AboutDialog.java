/*
 This file is part of JScreenRecorder v0.3

 JScreenRecorder is free software: you can redistribute it and/or modify
 it under the terms of the GNU Lesser General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 JScreenRecorder is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License
 along with JScreenRecorder.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.deepak.jscreenrecorder.gui;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * the about dialog
 *
 * @author deepak
 */
public class AboutDialog extends javax.swing.JDialog {

    /**
     * Creates new form AboutDialog
     * @param parent
     * @param modal
     */
    public AboutDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        // centre the frame
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((screen.getWidth() - getWidth()) / 2);
        int y = (int) ((screen.getHeight() - getHeight()) / 2);
        setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        infoScrollPane = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextArea();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About");
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/deepak/jscreenrecorder/gui/resources/record.png"))); // NOI18N
        titleLabel.setText("JScreenRecorder");

        infoTextArea.setEditable(false);
        infoTextArea.setBackground(java.awt.SystemColor.window);
        infoTextArea.setColumns(20);
        infoTextArea.setLineWrap(true);
        infoTextArea.setRows(5);
        infoTextArea.setText("A pure java based screen recording software.\n\nSupported Encoding format:\nMP4 only\n\nDeveloped By : deepak pk\nEmail : deepakpk009@yahoo.in\n\nThis Project is Licensed under LGPL");
        infoTextArea.setWrapStyleWord(true);
        infoScrollPane.setViewportView(infoTextArea);

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infoScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // closw dialog
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AboutDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AboutDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AboutDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AboutDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                AboutDialog dialog = new AboutDialog(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane infoScrollPane;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}