/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerMenuAdmin;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author asus
 */
public class MenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdmin
     */
    public MenuAdmin() {
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

        jLabel1 = new javax.swing.JLabel();
        UbahData = new javax.swing.JButton();
        HapusData = new javax.swing.JButton();
        TambahData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Menu Admin");

        UbahData.setText("Ubah Data");
        UbahData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahDataActionPerformed(evt);
            }
        });

        HapusData.setText("Hapus Data");
        HapusData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusDataActionPerformed(evt);
            }
        });

        TambahData.setText("Tambah Data");
        TambahData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(TambahData))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HapusData)
                            .addComponent(UbahData))))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addComponent(UbahData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(HapusData)
                .addGap(39, 39, 39)
                .addComponent(TambahData)
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UbahDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UbahDataActionPerformed

    private void HapusDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HapusDataActionPerformed

    private void TambahDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TambahDataActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HapusData;
    private javax.swing.JButton TambahData;
    private javax.swing.JButton UbahData;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public void addActionListener(ActionListener e) {
        HapusData.addActionListener(e);
        TambahData.addActionListener(e);
        UbahData.addActionListener(e);
    }

    public JButton getUbahData() {
        return UbahData;
    }

    public JButton getHapusData() {
        return HapusData;
    }

    public JButton getTambahData() {
        return TambahData;
    }
}
