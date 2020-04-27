/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Abdullah Azzam
 */
public class Angsuran {
    private int no_angsuran;
    private String tgl_angsuran;

    public Angsuran(int no_angsuran, String tgl_angsuran) {
        this.no_angsuran = no_angsuran;
        this.tgl_angsuran = tgl_angsuran;
    }

    public int getNo_angsuran() {
        return no_angsuran;
    }

    public String getTgl_angsuran() {
        return tgl_angsuran;
    }
    
    
}
