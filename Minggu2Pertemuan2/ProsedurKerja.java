/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu2Pertemuan2;
import java.util.Scanner;

public class ProsedurKerja {
    public static void main(String[] args) {
        
       //Membuat variabel dan scanner
       int nilai;
       String grade;
       Scanner scan = new Scanner(System.in);
       //Mengambil input
       System.out.print("Inputkan nilai: ");
       nilai = scan.nextInt();
       
       //Hitung gradenya
       if (nilai >= 90) {
           grade = "A";
       } else if (nilai >= 80) {
           grade = "B+";
       } else if (nilai >= 70) {
           grade = "B";
       } else if (nilai >= 60) {
           grade = "C+";
       } else if (nilai >= 50) {
           grade = "C";
       } else if (nilai >= 40) {
           grade = "D";
       } else {
           grade = "E";
       }
       
       System.out.println("Grade: " + grade);
       
    }
}
