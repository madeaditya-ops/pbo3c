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
public class Tugas1 {
  
    public static String cekLulus(double nilai) {
        if (nilai >= 70) {
            return "LULUS";
        } else {
            return "GAGAL";
        }
    } 

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Nama Mahasiswa: ");
            String nama = input.nextLine();
            
            System.out.print("Masukkan NIM Mahasiswa: ");
            String nim = input.nextLine();
            
            System.out.print("Masukkan Nilai Mahasiswa: ");
            double nilai = input.nextDouble();
            
            String keterangan = cekLulus(nilai);
            
            System.out.println("\nNama Mahasiswa: " + nama);
            System.out.println("NIM Mahasiswa: " + nim);
            System.out.println("Nilai Mahasiswa: " + nilai);
            System.out.println("Keterangan: " + keterangan);
         
    }
}
