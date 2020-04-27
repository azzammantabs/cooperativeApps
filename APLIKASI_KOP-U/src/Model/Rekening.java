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
public class Rekening {
    private String no_rekening;
    private double saldo_wajib;
    private double saldo_sukarela;

    public Rekening(String no_rekening, double saldo_wajib, double saldo_sukarela) {
        this.no_rekening = no_rekening;
        this.saldo_wajib = saldo_wajib;
        this.saldo_sukarela = saldo_sukarela;
    }

    public String getNo_rekening() {
        return no_rekening;
    }

    public double getSaldo_wajib() {
        return saldo_wajib;
    }

    public double getSaldo_sukarela() {
        return saldo_sukarela;
    }
    
    
}
