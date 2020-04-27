/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Anggota;
import Model.Main;
import Model.Pegawai;
import View.AdminTambahData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author asus
 */
public class ControllerAdminTambahData implements ActionListener {

    private List<Anggota> listAnggota;
    private List<Pegawai> listPegawai;
    private AdminTambahData view;
    
    public ControllerAdminTambahData() {
        this.view = new AdminTambahData();
        view.addActionListener(this);
        view.setVisible(true);
        listAnggota = Main.listAnggota;
        listPegawai = Main.listPegawai;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getAnggotaTambah())){
            view.dispose();
            new ControllerTambahDataA();   
        }
        else if(source.equals(view.getPegawaiTambah())){
            view.dispose();
            new ControllerTambahDataP(); 
        }
    }      
}
