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
import Model.Menyimpan_wajib;
import Model.Pegawai;
import Model.Pinjaman;
import View.home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author Abdullah Azzam
 */
public class Controllerhome implements ActionListener {
    
    private List<Anggota> listAnggota;
    private List<Pegawai> listPegawai;
    private List<Admin> listAdmin;
    private home view;
    public Controllerhome() {
        this.view = new home();
        view.addActionListener(this);
        view.setVisible(true);
        listAnggota = Main.listAnggota;
        listPegawai = Main.listPegawai;
        listAdmin = Main.listAdmin;
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getAnggotaL())){
            view.dispose();
            new ControllerMenuAnggota();   
        }
        else if(source.equals(view.getPegawaiL())){
            view.dispose();
            new ControllerMenuSimpanan(); 
        }
        else if(source.equals(view.getAdminL())){
            view.dispose();
            new ControllerMenuAdmin(); 
        }
    }
}
