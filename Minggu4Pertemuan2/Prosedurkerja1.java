/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu4Pertemuan2;

public class Prosedurkerja1 {
    public static void main(String[] args) {
        int[] numbers = {2, 9, 6, 7, 4, 5, 3, 0, 1};
        int target = 4;

        sequentialSearch(numbers, target);
    }

    public static void sequentialSearch(int[] array, int target) {
        int index = -1;

        // Mencari setiap elemen dalam array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
                break; // Menghentikan pencarian jika target ditemukan
            }
        }

        // Menampilkan hasil pencarian
        if (index == -1) {
            System.out.println("Target tidak ditemukan dalam array.");
        } else {
            System.out.println("Target ditemukan pada indeks " + index + " dalam array.");
        }
    }    
}