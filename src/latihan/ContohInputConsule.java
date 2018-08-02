/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.io.Console;

/**
 *
 * @author ONE
 */
public class ContohInputConsule {
    public static void main(String[] args) {
        String nama;
        int usia;
        String alamat;
        //membuat objek console 
        Console con = System.console();
        //mengisi variabel nama usia alamat dengan console
        System.out.print("Inputkan nama anda; ");
        nama = con.readLine();
        System.out.print("Inputkan usia; ");
        usia = Integer.parseInt(con.readLine());
        System.out.print("Inputkan alamat andad; ");
        alamat = con.readLine();
        //menampilkan isi variabel nama usia dan alamat
        System.out.println("Nama kamu adalah: " +nama);
        System.out.println("Saat in berusia: " +usia);
        System.out.println("Alamat kanmu berada di: " +alamat);        
    }
}


