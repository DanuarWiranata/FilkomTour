package com.kuliah.PemLan;

import java.util.*;

class Karyawan {
    private String nama, alamat, noTelp, jenisKelamin, jabatan, info;
    public Karyawan(){

    }

    public Karyawan(String nama, String alamat, String noTelp, String jenisKelamin, String jabatan){
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.jenisKelamin = jenisKelamin;
        this.jabatan = jabatan;
    }

    //print out info karyawan
    private void kategoriKaryawan(){
        switch (this.jabatan){
            case "supir travel" :
                if ("tidak tersedia".equals(this.info)){
                    System.out.println("Supir travel sedang bertugas pada suatu keberangkatan");
                }
                else {
                    System.out.println("Supir travel siap");
                }
                break;
            case "supir rental" :
                if ("tidak tersedia".equals(this.info)){
                    System.out.println("Supir rental sedang bertugas di suatu wilayah");
                }
                else {
                    System.out.println("Supir rental siap");
                }
                break;
            case "admin" :
                if ("tidak tersedia".equals(this.info)){
                    System.out.println("Admin sedang sibuk");
                }
                else {
                    System.out.println("Admin sedang online");
                }
                break;
        }
    }

    //menentukan karyawan tersedia atau tidak
    public void setInfo(String info){
        this.info = info;
    }

    public void setNama(String name){
        this.nama = name;
    }

    public void setAlamat(String addr){
        this.alamat = addr;
    }

    public void setNoTelp(String phoneNum){
        this.noTelp = phoneNum;
    }

    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }

    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }

    //method menampilkan messages
    public void display(){
        System.out.println("INFO KARYAWAN FILKOM TOUR");
        System.out.println("Nama karyawan   : " + this.nama);
        System.out.println("Alamat karyawan : " + this.alamat);
        System.out.println("Nomor telepon   : " + this.noTelp);
        System.out.println("Jenis kelamin   : " + this.jenisKelamin);
        System.out.println("Jabatan         : " + this.jabatan);
        kategoriKaryawan();
        System.out.println();
    }
}

class Mobil {

    String noPlat;
    String merkMobil;
    String warnaMobil;
    int tahunKeluaran;
    String kategoriMobil;

    public Mobil() {
        //no-argument
    }

    public Mobil(String noPlat, String merkMobil, String warnaMobil, int tahunKeluaran, String kategoriMobil) {
        this.noPlat = noPlat;
        this.merkMobil = merkMobil;
        this.warnaMobil = warnaMobil;
        this.tahunKeluaran = tahunKeluaran;
        this.kategoriMobil = kategoriMobil;
    }

    public void infoMobil() {
        System.out.printf("INFO MOBIL FILKOM-TOUR \n");
        System.out.printf("Nomor Plat Mobil : %s\n",this.noPlat);
        System.out.printf("Merk Mobil       : %s\n",this.merkMobil);
        System.out.printf("Warna Mobil      : %s\n",this.warnaMobil);
        System.out.printf("Tahun Keluaran   : %d\n",this.tahunKeluaran);
        System.out.printf("Kategori Mobil   : %s\n",this.kategoriMobil);
    }

    public void pergi(String rute) {
        if (this.kategoriMobil.equals("Travel")) {
            System.out.printf("Mobil ini memiliki jadwal keberangkatan dengan rute %s\n", rute);
        } else {
            System.out.printf("Mobil ini telah dipesan untuk %s di wilayah %s\n", this.kategoriMobil, rute);
        }
        System.out.println();
    }

    public void setKategori(String kategoriTerbaru) {
        this.kategoriMobil = kategoriTerbaru;
    }
}

public class FilkomTourV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Menu untuk memilih data yang akan diinput
        System.out.println("Data apa yang ingin ditampilkan?");
        System.out.println("A.Karyawan");
        System.out.println("B.Mobil");
        System.out.print("Pilih : ");
        String pilih = in.next();
        String jawab = pilih.toLowerCase();

        System.out.println();

        // Jika memilih karyawan
        if (jawab.equals("a")){
            // Without Constructor
            Karyawan emp1 = new Karyawan();
            emp1.setNama("Abdul");
            emp1.setAlamat("Malang");
            emp1.setNoTelp("081201921219");
            emp1.setJenisKelamin("Laki-laki");
            emp1.setJabatan("supir rental");
            emp1.setInfo("tersedia");
            emp1.display();

            // With Constructor
            Karyawan emp2 = new Karyawan("Ahmad","Malang","08120121210","Laki-laki","supir travel");
            emp2.setInfo("tidak tersedia");
            emp2.display();
        }

        // Jika memilih mobil
        if(jawab.equals("b")){
            // Without Constructor
            Mobil car1 = new Mobil();
            car1.noPlat = "N 1234 AB";
            car1.merkMobil = "Isuzu Elf";
            car1.warnaMobil = "Putih";
            car1.tahunKeluaran = 2019;
            car1.kategoriMobil = "Travel";
            car1.infoMobil();
            car1.pergi("Malang-Surabaya");

            // With Constructor
            Mobil car2 = new Mobil("N 1945 RI","Avanza","Hitam",2020,"Rental");
            car2.infoMobil();
            car2.pergi("Malang");
        }
    }
}
