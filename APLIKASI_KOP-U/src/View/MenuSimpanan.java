/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerMenuSimpanan;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Abdullah Azzam
 */
public class MenuSimpanan extends javax.swing.JFrame {

    /**
     * Creates new form MenuSimpanan
     */
    public MenuSimpanan() {
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

        jMenuSimpanan = new javax.swing.JLabel();
        jSimpanan_s = new javax.swing.JButton();
        jSimpanan_w = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 411));

        jMenuSimpanan.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jMenuSimpanan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuSimpanan.setText("Menu Simpanan");

        jSimpanan_s.setText("Simpanan Sukarela");
        jSimpanan_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSimpanan_sActionPerformed(evt);
            }
        });

        jSimpanan_w.setText("Simpanan Wajib");
        jSimpanan_w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSimpanan_wActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jSimpanan_w, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jMenuSimpanan, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jSimpanan_s, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jMenuSimpanan, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jSimpanan_w, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSimpanan_s, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSimpanan_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSimpanan_sActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSimpanan_sActionPerformed

    private void jSimpanan_wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSimpanan_wActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSimpanan_wActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jMenuSimpanan;
    private javax.swing.JButton jSimpanan_s;
    private javax.swing.JButton jSimpanan_w;
    // End of variables declaration//GEN-END:variables

    
    //action listener
    public void addActionListener(ActionListener e) {
        jSimpanan_w.addActionListener(e);
        jSimpanan_s.addActionListener(e);
    }

    //menu simpanan
    public JButton getjSimpanan_s() {
        return jSimpanan_s;
    }
    
    public JButton getjSimpanan_w() {
        return jSimpanan_w;
    }
}