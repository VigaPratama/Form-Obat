/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Me
 */
public class koneksi {
    private Connection koneksi;
    public Connection connect(){
       try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          System.out.println("berhasil koneksi");
       }catch(ClassNotFoundException ex){
          System.out.println("gagal Koneksi "+ex);
       }
       String url = "jdbc:mysql://localhost:3307/uts2022";
       try{
          koneksi = DriverManager.getConnection(url, "root", "root");
          System.out.print("Berhasil Koneksi Database");
       }catch (SQLException ex){
          System.out.println("Gagal Koneksi Database"+ex);
       }
       return koneksi;
    }
}
