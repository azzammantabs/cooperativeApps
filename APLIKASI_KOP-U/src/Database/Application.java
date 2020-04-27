/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Admin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Abdullah Azzam
 */  /*
public class Application {

    Database db;
    ArrayList<Admin> daftarAdmin;

    
    // Contructor
    public Application() throws SQLException{
        db = new Database();
        loadAdmin();

    }
    
    public ArrayList<Admin> loadAdmin() throws SQLException{
        daftarAdmin = new ArrayList<>();
        db.connect();
        String query = "SELECT * FROM Soal";
        ResultSet ad = db.getData(query);
        try {
            while (ad.next()) {
                Admin s = new Admin(ad.getString("username"), ad.getString("password"), ad.getInt("jumlah_pegawai"), ad.getInt("jumlah_anggota"), ad.get("pilihan_c"), ad.get("jawab"));
                daftarAdmin.add(s);
            }
        } 
        catch (Exception e) {
            throw new IllegalArgumentException("Terjadi Kesalahan Saat Load Admin");
        }
        db.disconnect();
        return daftarAdmin;
    }
    
    public Admin getAdmin(int id){
        for (Soal s : daftarSoal){
            if (s.getId() == id){return s;}
        }
        return null;
    }    
}
*/