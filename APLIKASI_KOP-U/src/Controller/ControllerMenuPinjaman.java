/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Angsuran;
import Model.Main;
import Model.Menyimpan_sukarela;
import Model.Menyimpan_wajib;
import Model.Pinjaman;
import View.MenuPinjaman;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author Abdullah Azzam
 */
public class ControllerMenuPinjaman implements ActionListener {

    private List<Pinjaman> listPinjaman;
    private List<Angsuran> listAngsuran;
    private MenuPinjaman view;

    public ControllerMenuPinjaman() {
        this.view = new MenuPinjaman();
        view.addActionListener(this);
        view.setVisible(true);
        listPinjaman = Main.listPinjaman;
        listAngsuran = Main.listAngsuran;
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getjAjukan_p())){
            view.dispose();
            new ControllerPengajuanPinjaman();   
        }
        else if(source.equals(view.getjMembayarAngsuran())){
            view.dispose();
            new ControllerBayarAngsuran(); 
        }
    }
    
}
