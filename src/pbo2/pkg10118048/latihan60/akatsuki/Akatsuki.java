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
public class Akatsuki {

    protected String nama;
    protected String desa;
    protected String cincin;
    protected String tugas;
    protected String partner;
    
    public Akatsuki() {
        System.out.println("~~~~~~~~~AKATSUKI~~~~~~~~~"
                + "\nList Anggota Akatsuki : "
                + "\n1. Pain\t\t7. Hidan"
                + "\n2. Konan\t8. Kakuzu"
                + "\n3. Zetsu\t9. Orochimaru"
                + "\n4. Kisame\t10. Sasori"
                + "\n5. Tobi\t\t11. Itachi"
                + "\n6. Deidara"
        );
    }

    public Akatsuki(String nama, String desa, String cincin, String tugas, String partner) {
        this.nama = nama;
        this.desa = desa;
        this.cincin = cincin;
        this.tugas = tugas;
        this.partner = partner;
    }

    public String getNama() {
        return nama;
    }

    public String getDesa() {
        return desa;
    }

    public String getCincin() {
        return cincin;
    }

    public String getTugas() {
        return tugas;
    }

    public String getPartner() {
        return partner;
    }

    public void siapaKamu() {
        System.out.println("Anggota Akatsuki");
    }
    
}
