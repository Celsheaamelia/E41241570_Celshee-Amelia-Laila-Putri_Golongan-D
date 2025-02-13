/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu2Pertemuan2;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        System.out.println("                    CAFE CERIA                     ");
        System.out.println("                   ANEKA MINUMAN                   ");
        System.out.println("---------------------------------------------------");
        System.out.println("                   SPECIAL MENU :                  ");
        System.out.println("                 1. Soft drinks                    ");
        System.out.println("                 2. Mix juice                      ");
        System.out.println("                 3. Nescafe                        ");
        System.out.println("                 4. Soda milk                      ");
        System.out.println("                 5. Tea                            ");
        System.out.println("---------------------------------------------------");
        
        String nama;
        int pilihan;
        Scanner scan =new Scanner(System.in);
        
        System.out.print("Masukkan nama pembeli : ");
        nama = scan.nextLine();
        
        System.out.println();
        System.out.print("Silahkan masukkan pilihan anda : ");
        pilihan = scan.nextInt();
        
        System.out.print("Minuman yang anda pesan adalah ");
        switch (pilihan) {
            case 1 :
                System.out.println("Soft drink");
                break;
            case 2 :
                System.out.println("Mix juice");
                break;
            case 3 :
                System.out.println("Nescafe");
                break;
            case 4 :
                System.out.println("Soda milk");
                break;
            case 5 :
                System.out.println("Tea");
                break;
            default:
                System.out.println("Tidak tersedia");
        }
        System.out.println("Pesanan akan segera diantar");
        System.out.println("Terima kasih " + nama + " telah berkunjung di Cafe Ceria");
       
    }
}
