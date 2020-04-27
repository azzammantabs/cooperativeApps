/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Menyimpan;

/**
 *
 * @author Abdullah Azzam
 */
public class Menyimpan_wajib extends Menyimpan {
    private String id_transaksi_wajib;
    private double jumlah_uang;

    public Menyimpan_wajib(String id_transaksi_wajib, double jumlah_uang, String tanggal_transaksi) {
        this.id_transaksi_wajib = id_transaksi_wajib;
        this.jumlah_uang = jumlah_uang;
    }

    public String getId_transaksi_wajib() {
        return id_transaksi_wajib;
    }

    public double getJumlah_uang() {
        return jumlah_uang;
    }

    @Override
    public void Menyimpan_w(double jumlah_uang, String tanggal_transaksi, String debit) {
        jumlah_uang = 200000;
        this.tanggal_transaksi = tanggal_transaksi;
        this.debit = debit;
        
    }

    @Override
    public void Menyimpan_s(double jumlah_uang, String tanggal_transaksi, String debit) {
        
    }
    
    
}
