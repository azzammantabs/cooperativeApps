/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Abdullah Azzam
 */
public class PenarikanSukarela extends javax.swing.JFrame {

    /**
     * Creates new form PenarikanSukarela
     */
    public PenarikanSukarela() {
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

        jPenarikanSimpanan_s = new javax.swing.JLabel();
        jJumlahPenarikan = new javax.swing.JLabel();
        jJumlahUang_Ps = new javax.swing.JTextField();
        jTgl_Ps = new javax.swing.JLabel();
        jSubmit_Ps = new javax.swing.JButton();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 411));

        jPenarikanSimpanan_s.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jPenarikanSimpanan_s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPenarikanSimpanan_s.setText("Menu Penarikan Simpanan Sukarela");

        jJumlahPenarikan.setText("Jumlah Penarikan");

        jJumlahUang_Ps.setText("Rp.");

        jTgl_Ps.setText("Tanggal Penarikan");

        jSubmit_Ps.setText("Submit");
        jSubmit_Ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmit_PsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSubmit_Ps)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTgl_Ps)
                        .addComponent(jJumlahUang_Ps, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jJumlahPenarikan)
                        .addComponent(jPenarikanSimpanan_s, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPenarikanSimpanan_s, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jJumlahPenarikan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jJumlahUang_Ps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTgl_Ps)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jSubmit_Ps)
                .addGap(131, 131, 131))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSubmit_PsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmit_PsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSubmit_PsActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JLabel jJumlahPenarikan;
    private javax.swing.JTextField jJumlahUang_Ps;
    private javax.swing.JLabel jPenarikanSimpanan_s;
    private javax.swing.JButton jSubmit_Ps;
    private javax.swing.JLabel jTgl_Ps;
    // End of variables declaration//GEN-END:variables
}