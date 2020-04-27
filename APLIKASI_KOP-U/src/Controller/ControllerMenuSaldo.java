/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Main;
import Model.Menyimpan_sukarela;
import Model.Menyimpan_wajib;
import View.MenuSaldo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author Abdullah Azzam
 */
public class ControllerMenuSaldo implements ActionListener {

    private List<Menyimpan_sukarela> listMenyimpan_sukarela;
    private List<Menyimpan_wajib> listMenyimpan_wajib;
    private MenuSaldo view;

    public ControllerMenuSaldo() {
        this.view = new MenuSaldo();
        view.addActionListener(this);
        view.setVisible(true);
        listMenyimpan_sukarela = Main.listMenyimpan_sukarela;
        listMenyimpan_wajib = Main.listMenyimpan_wajib;
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getjSaldoWajib())){
            view.dispose();
            new ControllerSaldoWajib();   
        }
        else if(source.equals(view.getjSaldoSukarela())){
            view.dispose();
            new ControllerSaldoSukarela(); 
        }
    }    
}
