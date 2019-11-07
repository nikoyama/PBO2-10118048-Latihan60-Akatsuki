/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan60.akatsuki;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menampilkan profile anggota akatsuki
 */
public class PBO210118048Latihan60Akatsuki {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Anggota anggota = new Anggota();
        
        System.out.print("\nMasukkan Nama Anggota Yang Ingin Kamu Ketahui : ");
        anggota.nama = (scanner.nextLine().toUpperCase());
        anggota.siapaKamu();
    }

}
