/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerMenuPinjaman;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Abdullah Azzam
 */
public class MenuPinjaman extends javax.swing.JFrame {

    /**
     * Creates new form MenuPinjaman
     */
    public MenuPinjaman() {
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

        jMPinjaman = new javax.swing.JLabel();
        jMembayarAngsuran = new javax.swing.JButton();
        jAjukan_p = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 411));

        jMPinjaman.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jMPinjaman.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMPinjaman.setText("Menu Pinjaman");

        jMembayarAngsuran.setText("Membayar Angsuran");
        jMembayarAngsuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMembayarAngsuranActionPerformed(evt);
            }
        });

        jAjukan_p.setText("Ajukan Pinjaman");
        jAjukan_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAjukan_pActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jAjukan_p, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jMembayarAngsuran, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jMPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jAjukan_p, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jMembayarAngsuran, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMembayarAngsuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMembayarAngsuranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMembayarAngsuranActionPerformed

    private void jAjukan_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAjukan_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAjukan_pActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAjukan_p;
    private javax.swing.JLabel jMPinjaman;
    private javax.swing.JButton jMembayarAngsuran;
    // End of variables declaration//GEN-END:variables

    // action listener
    public void addActionListener(ActionListener e) {
        jAjukan_p.addActionListener(e);
        jMembayarAngsuran.addActionListener(e);
    }
    
   
    //menu pinjaman
    public JButton getjAjukan_p() {
        return jAjukan_p;
    }

    public JButton getjMembayarAngsuran() {
        return jMembayarAngsuran;
    }
}
