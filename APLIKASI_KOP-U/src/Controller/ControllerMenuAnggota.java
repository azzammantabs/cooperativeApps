/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Main;
import Model.Menyimpan_sukarela;
import Model.Menyimpan_wajib;
import Model.Pinjaman;
import View.MenuAggota;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author Abdullah Azzam
 */
public class ControllerMenuAnggota implements ActionListener {

    private List<Pinjaman> listPinjaman;
    private List<Menyimpan_sukarela> listMenyimpan_sukarela;
    private List<Menyimpan_wajib> listMenyimpan_wajib;
    private MenuAggota view;

    public ControllerMenuAnggota() {
        this.view = new MenuAggota();
        view.addActionListener(this);
        view.setVisible(true);
        listPinjaman = Main.listPinjaman;
        listMenyimpan_sukarela = Main.listMenyimpan_sukarela;
        listMenyimpan_wajib = Main.listMenyimpan_wajib;
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getjPinjaman())){
            view.dispose();
            new ControllerMenuPinjaman();   
        }
        else if(source.equals(view.getjSimpanan())){
            view.dispose();
            new ControllerMenuSimpanan(); 
        }
        else if(source.equals(view.getjliatSaldo())){
            view.dispose();
            new ControllerMenuSaldo(); 
        }
    }
    
}

