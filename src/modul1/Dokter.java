/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

/**
 *
 * @author Freeware Sys
 */
public class Dokter {
    private String nomerPegawai;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;

    public Dokter() {
    }

    public Dokter(String nomerPegawai, String nama, String alamat, String tempatLahir, int tanggalLahir) {
        this.nomerPegawai = nomerPegawai;
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
    }

    public String getNomerPegawai() {
        return nomerPegawai;
    }

    public void setNomerPegawai(String nomerPegawai) {
        this.nomerPegawai = nomerPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
}
