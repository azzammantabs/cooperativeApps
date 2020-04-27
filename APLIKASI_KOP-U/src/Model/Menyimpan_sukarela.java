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
public class Menyimpan_sukarela extends Menyimpan {

    private String id_transaksi_sukarela;
    
    public Menyimpan_sukarela(String id_transaksi_sukarela) {
        this.id_transaksi_sukarela = id_transaksi_sukarela;
    }

    public String getId_transaksi_sukarela() {
        return id_transaksi_sukarela;
    }

    @Override
    public void Menyimpan_s(double jumlah_uang, String tanggal_transaksi, String debit) {
        this.jumlah_uang = jumlah_uang;
        this.tanggal_transaksi = tanggal_transaksi;
        this.debit = debit;
    }

    @Override
    public void Menyimpan_w(double jumlah_uang, String tanggal_transaksi, String debit) {
       
    }

    public void writeObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
