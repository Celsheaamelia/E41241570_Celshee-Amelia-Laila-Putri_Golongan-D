/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu2Pertemuan2;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");
        System.out.println("             Kharisma Agung Plaza ( KAP )             ");
        System.out.println("              Promo Belanja Berhadiah                 ");
        System.out.println("          Khusus Pembelian 5 branag pertama           ");
        System.out.println("           Dengan Harga minimum Rp 10000,00           ");
        System.out.println("------------------------------------------------------");
        
        String nama;
        int harga;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan nama pembeli :" );
        nama = scan.nextLine();        
        System.out.println();
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan harga barang ke-" + (i + 1) + ": ");
            harga = scan.nextInt();
            total += harga;
    }
        System.out.println();
        
        System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp " +total);       
        System.out.println();
        
        if (total >= 10000){
            System.out.println("Selamat...");
            System.out.println("Anda mendapatkan hadiah 1 buah mug cantik");           
        }
        System.out.println("------------------------------------------------------");
        System.out.println("                     Terima Kasih                     ");
        System.out.println("      Anda sudah belanja di Kharisma Agung Plaza      ");
        
    }
}
