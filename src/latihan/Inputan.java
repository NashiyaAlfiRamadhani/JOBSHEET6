/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author ONE
 */
public class Inputan {
   public static void main(String[] args){
        Scanner masukkan = new Scanner(System.in);
        int a, b;
        System.out.print("masukkan nilai a :");
        a = masukkan.nextInt();
        System.out.print("Masukkan nilai b :");
        b = masukkan.nextInt();
        System.out.println();
        System.out.println("Nilai variabel yang ada pada progam :");
        System.out.println("a = " +a);
        System.out.println("b = " +b);       
    }
}

 

