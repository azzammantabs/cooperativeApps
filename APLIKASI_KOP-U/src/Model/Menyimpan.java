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
public abstract class Menyimpan {
    double jumlah_uang;
    String tanggal_transaksi;
    private String kredit;
    String debit;

    public String getTanggal_transaksi() {
        return tanggal_transaksi;
    }

    public String getKredit() {
        return kredit;
    }

    public String getDebit() {
        return debit;
    }
    
    public abstract void Menyimpan_s(double jumlah_uang, String tanggal_transaksi, String debit);
    public abstract void Menyimpan_w(double jumlah_uang, String tanggal_transaksi, String debit);
}
