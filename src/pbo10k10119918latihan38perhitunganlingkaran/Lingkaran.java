/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan38perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class Lingkaran {
    private double diameterLingkaran = 0, jariJariLingkaran = 0, 
            luasLingkaran = 0, kelilingLingkaran= 0;
    private String luasString, kelilingString;
    private static final double phi = 3.14;
    
    Scanner scanner = new Scanner(System.in);
    
    private double hitungJariJariLingkaran (double parDiameter) {
        return parDiameter / 2;
    }
    
    private double hitungLuasLingkaran (double parJariJari) {
        return phi * parJariJari * parJariJari;
    }
    
    private double hitungKelilingLingkaran (double parJariJari) {
        return 2 * phi * parJariJari;
    }
    
    public void hasilPerhitunganLingkaran () {
        int i = 0;
        System.out.print("Masukkan nilai diameter lingkaran : ");
        while (true) {
            try {               
                diameterLingkaran = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                System.out.print("Masukkan nilai diameter lingkaran : ");
                continue;
            }
        }
        
        jariJariLingkaran = this.hitungJariJariLingkaran(diameterLingkaran);
        luasLingkaran = this.hitungLuasLingkaran(jariJariLingkaran);
        kelilingLingkaran = this.hitungKelilingLingkaran(jariJariLingkaran);
        
        luasString = String.format("%s", luasLingkaran);
        luasString = luasString.replace(".", ",");

        kelilingString = String.format("%s", kelilingLingkaran);
        kelilingString = kelilingString.replace(".", ",");
        
        System.out.println("\n======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran\t\t= %.0f cm%n", jariJariLingkaran);
        System.out.printf("Luas Lingkaran\t\t\t= %s cm%n", luasString);
        System.out.printf("Keliling lingkaran\t\t= %s cm%n", kelilingString);
    }
}
