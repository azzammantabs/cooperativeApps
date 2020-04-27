/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Anggota;
import Model.Main;
import Model.Pegawai;
import View.AdminUbahData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ControllerAdminUbahData implements ActionListener {
    private List<Anggota> listAnggota;
    private List<Pegawai> listPegawai;
    private AdminUbahData view;
    
    public ControllerAdminUbahData() {
        this.view = new AdminUbahData();
        view.addActionListener(this);
        view.setVisible(true);
        listAnggota = Main.listAnggota;
        listPegawai = Main.listPegawai;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getAnggotaEdit())){
            view.dispose();
            new ControllerAdminUbahDataA();   
        }
        else if(source.equals(view.getPegawaiEdit())){
            view.dispose();
            new ControllerAdminUbahDataP(); 
        }
    }
}
