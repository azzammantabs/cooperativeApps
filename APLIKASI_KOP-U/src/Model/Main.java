/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Controller.Controllerhome;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abdullah Azzam
 */
public class Main {
    public static List<Admin> listAdmin = new ArrayList();
    public static List<Anggota> listAnggota = new ArrayList();
    public static List<Angsuran> listAngsuran = new ArrayList();
    public static List<Menyimpan_sukarela> listMenyimpan_sukarela = new ArrayList();
    public static List<Menyimpan_wajib> listMenyimpan_wajib = new ArrayList();
    public static List<Pegawai> listPegawai = new ArrayList();
    public static List<Pinjaman> listPinjaman = new ArrayList();
    public static List<Rekening> listRekening = new ArrayList();

    public static void main(String[] args) {
        new Controllerhome();
    }
}
