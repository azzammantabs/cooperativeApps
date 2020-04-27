/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.MenuAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControllerMenuAdmin implements ActionListener {
    
    private MenuAdmin view;
    
    public ControllerMenuAdmin() {
        this.view = new MenuAdmin();
        view.addActionListener(this);
        view.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getUbahData())){
            view.dispose();
            new ControllerAdminUbahData();   
        }
        else if(source.equals(view.getHapusData())){
            view.dispose();
            new ControllerAdminHapusData(); 
        }
        else if(source.equals(view.getTambahData())){
            view.dispose();
            new ControllerAdminUbahData(); 
        }
    }
}
