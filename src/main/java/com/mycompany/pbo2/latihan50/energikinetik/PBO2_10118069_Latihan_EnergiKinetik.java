/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan50.energikinetik;

/**
 *
 * @author asus
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : IF-2
 * NIM      : 10118069
 * Deskripsi Program : energi kinetk
 */
public class PBO2_10118069_Latihan_EnergiKinetik {
    public static void main(String[] args) {
        
        EnergiKinetik ek = new EnergiKinetik();
        ek.setMassa(145);
        ek.setKecepatan(25);
        
        System.out.println("Massa = " + ek.getMassa() + "g");
        System.out.println("Kecepatan = " + ek.getKecepatan() + "m/s");
        System.out.println("Berapakah Energi Kinetiknya? = " + ek.hitungEK() + "Joule");
        System.out.println("Berapakah usaha yang dilakukan pada bola untuk menacapai"
                + "kecepatan ini, jika dimulai dari keadaan diam? = " + ek.hitungUsaha() + "Joule");
    }
}
