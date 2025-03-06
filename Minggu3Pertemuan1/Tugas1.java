/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu3Pertemuan1;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.print("Masukkan batas awal: ");
        int awal = scan.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int akhir = scan.nextInt();
       
        System.out.print("Bilangan genap dari " + awal + " sampai " + akhir + " : ");
       
        for (int i = awal; i <= akhir; i++){
           if (i % 2 == 0){
              System.out.print(i + " ");  
           }
        System.out.print("");  
       }
    }   
}
