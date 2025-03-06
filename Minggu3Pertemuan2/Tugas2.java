/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu3Pertemuan2;
import java.util.Scanner;
import java.util.Random;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Masukkan jumlah deret array: ");
        int jumlah = scan.nextInt();

        int[] angkarandom = new int[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            angkarandom[i] = random.nextInt(100) + 1; 
        }
        System.out.print("Deretan array secara random: ");
        for (int num : angkarandom) {
            System.out.print(num + " ");
        }
    }
}
