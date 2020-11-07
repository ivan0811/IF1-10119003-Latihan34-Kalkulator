package com.ivanfaathirza.Kalkulator;

import java.util.Scanner;

/**
 *
 * @author User
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program kalkulator ini menghitung operasi aritmatika dengan instansiasi objek kalkulator
 */

public class IF110119003Latihan34Kalkulator {


    public static void main(String[] args) {
	    Kalkulator kalkulator = new Kalkulator();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("====Aplikasi Kalkulator Bilangan===");
	    System.out.print("Masukkan Angka ke-1 : ");
	    kalkulator.value1 = scan.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kalkulator.value2 = scan.nextDouble();
        System.out.println("\nHasil Pertambahan : " + kalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + kalkulator.kurangBilangan());
        System.out.println("Hasil Perkalian : " + kalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian : " + kalkulator.bagiBilangan());
        System.out.println("Hasil Sisa : " + kalkulator.sisaBilangan());
    }
}
