/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Admin;
import Model.Anggota;
import Model.Main;
import Model.Menyimpan_sukarela;
import View.MenyimpanSimpanan_s;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author Abdullah Azzam
 */
public class ControllerMenyimpanSimpanan_s implements ActionListener {

    static List<Anggota> listAnggota = new ArrayList();
    static List<Menyimpan_sukarela> listMenyimpan_sukarela = new ArrayList();
    
    
    List<String> listDaftarAnggota = new ArrayList();
    List<String> listDaftarMenyimpan_sukarela = new ArrayList();
    
    private MenyimpanSimpanan_s view;
    private Anggota Anggota ;
    private String id_transaksi_sukarela;
    
    public ControllerMenyimpanSimpanan_s() {
        this.view = new MenyimpanSimpanan_s();
        view.addActionListener(this);
        view.setVisible(true);
        
        listAnggota = Main.listAnggota;
        listMenyimpan_sukarela = Main.listMenyimpan_sukarela;
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getjSubmit_s())){
            String jumlahUang_s = view.getjjumlahUang_s();
            String TglMenyimpan_s = view.getTglMenyimpan_s();
   
            if(listMenyimpan_sukarela.size() > 0){
                id_transaksi_sukarela = listMenyimpan_sukarela.get(listMenyimpan_sukarela.size()-1).getId_transaksi_sukarela();
            }
            
            if (Anggota != null) {
                Menyimpan_sukarela ms = new Menyimpan_sukarela(id_transaksi_sukarela+1);
                ms.writeObject();
                listMenyimpan_sukarela.add(ms);
                
                view.setStatusSimpanan_s("Transaction Added");
            }
            else{
                view.setStatusSimpanan_s("Failed to Add Transaction");
            }
            view.ResetView(); 
        }
    
    }
}
