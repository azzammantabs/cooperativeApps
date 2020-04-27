/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Main;
import Model.Menyimpan_sukarela;
import View.SimpananSukarela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author Abdullah Azzam
 */
public class ControllerSimpananSukarela implements ActionListener {   

    private List<Menyimpan_sukarela> listMenyimpan_sukarela;
    private SimpananSukarela view;

    public ControllerSimpananSukarela() {
        this.view = new SimpananSukarela();
        view.addActionListener(this);
        view.setVisible(true);
        listMenyimpan_sukarela = Main.listMenyimpan_sukarela;
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getjMenyimpan_s())){
            view.dispose();
            new ControllerMenyimpanSimpanan_s();   
        }
        else if(source.equals(view.getjPenarikan_s())){
            view.dispose();
            new ControllerPenarikanSukarela(); 
        }
    } 
}
