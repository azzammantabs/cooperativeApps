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
public class Pinjaman {
    private String id_pinjaman;
    private String tenor;
    private String jenis_pinjaman;
    private double bunga;
    private int max_pinjaman;

    public Pinjaman(String id_pinjaman, String tenor, String jenis_pinjaman, double bunga, int max_pinjaman) {
        this.id_pinjaman = id_pinjaman;
        this.tenor = tenor;
        this.jenis_pinjaman = jenis_pinjaman;
        this.bunga = bunga;
        this.max_pinjaman = max_pinjaman;
    }

    public String getId_pinjaman() {
        return id_pinjaman;
    }

    public String getTenor() {
        return tenor;
    }

    public String getJenis_pinjaman() {
        return jenis_pinjaman;
    }

    public double getBunga() {
        return bunga;
    }

    public int getMax_pinjaman() {
        return max_pinjaman;
    }
    
    
}
