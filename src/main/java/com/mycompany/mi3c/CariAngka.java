/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mi3c;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class CariAngka {
      public static void main(String[] args) {
        // Inisialisasi array
        int[] array = {1, 2, 3, 4, 5};
        
        // Membuat scanner untuk input nilai yang dicari
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai yang dicari: ");
        int target = input.nextInt();
        
        // Memanggil fungsi untuk mencari nilai
        cariNilai(array, target);
        
      
    }
      
       // Fungsi untuk mencari nilai dalam array
    public static void cariNilai(int[] array, int target) {
        boolean ketemu = false;
        for (int nilai : array) {
            if (nilai == target) {
                ketemu = true;
                break;
            }
        }
        
        if (ketemu) {
            System.out.println("KETEMU");
        } else {
            System.out.println("TIDAK KETEMU");
        }
    }
}
