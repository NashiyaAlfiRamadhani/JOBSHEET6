/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ONE
 */
public class ContohBufferReader {
    public static void main (String[] args) throws IOException{
        String nama;
        //membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        //membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);
        //mengisi variabel nama dengan Bufferreader
        System.out.print("inputkan Nama: ");
        nama = br.readLine();
        //tampilkan output isi variabel warna
        System.out.println("Nama kamu adalah " +nama);
    }
    
}


