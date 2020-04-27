/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Abdullah Azzam
 */
public class Meminjam {
    private String id_peminjaman;
    private String status;
    private String tanggal_peminjaman;
    private int jumlah_pinjaman;

    public Meminjam(String id_peminjaman, String status, String tanggal_peminjaman, int jumlah_pinjaman) {
        this.id_peminjaman = id_peminjaman;
        this.status = status;
        this.tanggal_peminjaman = tanggal_peminjaman;
        this.jumlah_pinjaman = jumlah_pinjaman;
    }

    public String getId_peminjaman() {
        return id_peminjaman;
    }

    public String getStatus() {
        return status;
    }

    public String getTanggal_peminjaman() {
        return tanggal_peminjaman;
    }

    public int getJumlah_pinjaman() {
        return jumlah_pinjaman;
    }
    
    
}
