/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan60.akatsuki;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menampilkan profile anggota akatsuki
 */
public class Anggota extends Akatsuki{
    
    public void tampilProfil() {
        System.out.println("\n~~~~~~PROFIL " + getNama().toUpperCase() + "~~~~~~");
        System.out.println("Nama : " + getNama());
        System.out.println("Asal : " + getDesa());
        System.out.println("Cincin : " + getCincin());
        System.out.println("Partner: " + getPartner());
        System.out.println("Tugas  : " + getTugas());
    }

    @Override
    public void siapaKamu() {
        switch (nama) {
            case "PAIN":
                nama = "Pain aka Nagato Uzumaki";
                desa = "Amegakure";
                cincin = "Zero";
                tugas = "Menangkap Six-Tails, Nine-Tails";
                partner = "Konan";
                break;
            case "KONAN":
                nama = "Konan";
                desa = "Amegakure";
                cincin = "White";
                tugas = "Menangkap Six-Tails, Nine-Tails";
                partner = "Pain";
                break;
            case "ZETSU":
                nama = "Zetsu";
                desa = "-";
                cincin = "Boar/Pigs";
                tugas = "Mata-mata";
                partner = "White Zetsu, Black Zetsu";
                break;
            case "KISAME":
                nama = "Kisame Hoshigaki";
                desa = "Kirigakure";
                cincin = "South";
                tugas = "Menangkap Nine-Tails, Four-Tails, Eight-Tails";
                partner = "Itachi";
                break;
            case "TOBI":
                nama = "Tobi aka Obito Uchiha";
                desa = "Konohagakure";
                cincin = "Pearl";
                tugas = "Menangkap Three-Tails";
                partner = "Deidara";
                break;
            case "DEIDARA":
                nama = "Deidara";
                desa = "Iwagakure";
                cincin = "Blue Green";
                tugas = "Menangkap Three-Tails";
                partner = "Sasori, Tobi";
                break;
            case "HIDAN":
                nama = "Hidan";
                desa = "Yugakure";
                cincin = "Three";
                tugas = "Menangkap Seven-Tails, Two-Tails";
                partner = "Kakuzu";
                break;
            case "KAKUZU":
                nama = "Kakuzu";
                desa = "Konohagakure";
                cincin = "North";
                tugas = "Menangkap Seven-Tails, Two-Tails";
                partner = "Hidan";
                break;
            case "OROCHIMARU":
                nama = "Orochimaru";
                desa = "Amegakure";
                cincin = "Sky";
                tugas = "Uknown";
                partner = "Sasori";
                break;
            case "SASORI":
                nama = "Sasori";
                desa = "Sunagakure";
                cincin = "Pearl";
                tugas = "Uknown";
                partner = "Orochimaru, Deidara";
                break;
            case "ITACHI":
                nama = "Itachi";
                desa = "Konohagakure";
                cincin = "Scarlet";
                tugas = "Menangkap Nine-Tails, Four-Tails, Eight-Tails";
                partner = "Kisame";
                break;    
            default:
                System.out.println("BUKAN ANGGOTA AKATSUKI");
                break;
        }
        tampilProfil();
    }
    
}
