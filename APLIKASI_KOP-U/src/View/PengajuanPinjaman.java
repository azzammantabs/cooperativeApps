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
public class PengajuanPinjaman extends javax.swing.JFrame {

    /**
     * Creates new form PengajuanPinjaman
     */
    public PengajuanPinjaman() {
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

        jPengajuanPinjaman = new javax.swing.JLabel();
        jJumlahPinjaman = new javax.swing.JLabel();
        jUangPinjaman = new javax.swing.JTextField();
        jAlasan_p = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAlasanPinjaman = new javax.swing.JTextArea();
        jAngsuran_p = new javax.swing.JLabel();
        jAngsuranPinjaman = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 411));

        jPengajuanPinjaman.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jPengajuanPinjaman.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPengajuanPinjaman.setText("Menu Pengajuan Pinjaman");

        jJumlahPinjaman.setText("Jumlah yang ingin dipinjam");

        jUangPinjaman.setText("Rp.");

        jAlasan_p.setText("Alasan Peminjaman");

        jAlasanPinjaman.setColumns(20);
        jAlasanPinjaman.setRows(5);
        jScrollPane1.setViewportView(jAlasanPinjaman);

        jAngsuran_p.setText("Jumlah Angsuran");

        jAngsuranPinjaman.setText("Rp.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jAngsuranPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAngsuran_p)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAlasan_p)
                    .addComponent(jUangPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jJumlahPinjaman)
                    .addComponent(jPengajuanPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPengajuanPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jJumlahPinjaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jUangPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAlasan_p)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAngsuran_p)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAngsuranPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jAlasanPinjaman;
    private javax.swing.JLabel jAlasan_p;
    private javax.swing.JTextField jAngsuranPinjaman;
    private javax.swing.JLabel jAngsuran_p;
    private javax.swing.JLabel jJumlahPinjaman;
    private javax.swing.JLabel jPengajuanPinjaman;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jUangPinjaman;
    // End of variables declaration//GEN-END:variables
}
