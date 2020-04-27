/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Anggota;
import Model.Main;
import Model.Pegawai;
import View.AdminHapusData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author asus
 */
public class ControllerAdminHapusData implements ActionListener {

    private List<Anggota> listAnggota;
    private List<Pegawai> listPegawai;
    private AdminHapusData view;
    
    public ControllerAdminHapusData() {
        this.view = new AdminHapusData();
        view.addActionListener(this);
        view.setVisible(true);
        listAnggota = Main.listAnggota;
        listPegawai = Main.listPegawai;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getAnggotaHapus())){
            view.dispose();
            new ControllerHapusData();   
        }
        else if(source.equals(view.getPegawaiHapus())){
            view.dispose();
            new ControllerHapusData(); 
        }
    }    
}
