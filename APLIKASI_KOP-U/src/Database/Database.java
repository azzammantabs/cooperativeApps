/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdullah Azzam
 */
public class Database {

    private Connection connection = null;
    private Statement statement = null;
    
    public void connect() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/kop_database";
            String user = "root";
            String pass = "";
//            connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();
            System.out.println("Koneksi Berhasil");
        } 
        catch (ClassNotFoundException ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Koneksi Gagal");
        }
    }
    
    public void disconnect(){
        try{
            connection.close();
            statement.close();
        } 
        catch (SQLException ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String query) {
        boolean cek = false;
        try{
            int rows = statement.executeUpdate(query);
            if (rows > 0){cek = true;}
            
        } 
        catch (Exception ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }
    
    public ResultSet getData(String query){
        ResultSet rs = null;
        try{
            rs = statement.executeQuery(query);
        } 
        catch (Exception ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}    
