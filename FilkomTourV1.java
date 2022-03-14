package com.kuliah;

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
            case "Supir travel" :
                if ("Tidak tersedia".equals(this.info)){
                    System.out.println("Supir travel sedang bertugas di suatu keberangkatan");
                }
                else {
                    System.out.println("Supir travel siap");
                }
                break;
            case "Supir rental" :
                if ("Tidak tersedia".equals(this.info)){
                    System.out.println("Supir rental sedang bertugas di suatu wilayah");
                }
                else {
                    System.out.println("Supir rental siap");
                }
                break;
            case "Admin" :
                if ("Tidak tersedia".equals(this.info)){
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

    //method menampilkan messages
    public void display(){
        System.out.println("INFO KARYAWAN FILKOM TOUR");
        System.out.println("Nama karyawan   : " + this.nama);
        System.out.println("Alamat karyawan : " + this.alamat);
        System.out.println("Nomor telepon   : " + this.noTelp);
        System.out.println("Jenis kelamin   : " + this.jenisKelamin);
        System.out.println("Jabatan         : " + this.jabatan);
        kategoriKaryawan();
    }
}

class Mobil {

    private String noPlat, merkMobil, warnaMobil, kategoriMobil;
    private int tahunKeluaran;

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
    
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setMerkMobil(String merkMobil) {
        this.merkMobil = merkMobil;
    }

    public void setWarnaMobil(String warnaMobil) {
        this.warnaMobil = warnaMobil;
    }

    public void setTahunKeluaran(String tahunKeluaran) {
        this.tahunKeluaran = tahunKeluaran;
    }

    public void setKategoriMobil(String kategoriTerbaru) {
        this.kategoriMobil = kategoriTerbaru;
    }

    public void infoMobil() {
        System.out.printf("INFO MOBIL FILKOM-TOUR \n");
        System.out.printf("Nomor Plat Mobil : %s\n", this.noPlat);
        System.out.printf("Merk Mobil       : %s\n", this.merkMobil);
        System.out.printf("Warna Mobil      : %s\n", this.warnaMobil);
        System.out.printf("Tahun Keluaran   : %d\n", this.tahunKeluaran);
        System.out.printf("Kategori Mobil   : %s\n", this.kategoriMobil);
    }

    public void pergi(String rute) {
        if (this.kategoriMobil.equals("Travel")) {
            System.out.printf("Mobil ini sedang melakukan perjalanan dengan rute %s", rute);
        }
        if (this.kategoriMobil.equals("Rental")){
            System.out.printf("Mobil ini telah dipesan untuk %s di wilayah %s", this.kategoriMobil, rute);
        }
        System.out.println();
    }

    public void pergi() {
        if (this.kategoriMobil.equals("Travel")){
            System.out.println("Mobil ini belum memiliki jadwal keberangkatan");
        }
        if (this.kategoriMobil.equals("Rental")){
            System.out.println("Mobil ini belum dipesan untuk wilayah manapun");
        }
    }
}

public class FilkomTourV1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Menu untuk memilih data yang akan diinput
        System.out.println("Data apa yang ingin diinput?");
        System.out.println("A.Karyawan");
        System.out.println("B.Mobil");
        System.out.print("Pilih : ");
        String pilih = in.next();
        String jawab = pilih.toLowerCase();

        System.out.println();

        // Jika memilih karyawan
        if(jawab.equals("a")){
            in.nextLine();
            // Data karyawan yang harus diinputkan
            System.out.print("Nama Karyawan             : ");
            String namaKaryawan = in.nextLine();

            System.out.print("Alamat Karyawan           : ");
            String addrKaryawan = in.nextLine();

            System.out.print("Nomor telepon             : ");
            String noTelepon = in.nextLine();

            System.out.print("Jenis Kelamin             : ");
            String jenisKelamin = in.nextLine();

            System.out.print("Jabatan                   : ");
            String jabatan = in.nextLine();

            // Jika karyawan tersedia, inputakan "Tersedia"
            // Jika karyawan tidak tersedia, inputkan "Tidak tersedia"
            System.out.print("Status karyawan saat ini  : ");
            String status = in.nextLine();

            System.out.println();

            // Create object
            Karyawan emp = new Karyawan(namaKaryawan, addrKaryawan, noTelepon, jenisKelamin, jabatan);
            emp.setInfo(status);
            emp.display();
        }

        // Jika memilih mobil
        if(jawab.equals("b")){
            in.nextLine();
            // Data mobil yang harus diinputkan
            System.out.print("Nomor Plat Mobil      : ");
            String platMobil = in.nextLine();

            System.out.print("Merk Mobil            : ");
            String merkMobil = in.nextLine();

            System.out.print("Warna Mobil           : ");
            String warnaMobil = in.nextLine();

            System.out.print("Tahun Keluaran        : ");
            int tahunKeluaran = in.nextInt();

            in.nextLine();
            System.out.print("Kategori Mobil        : ");
            String kategoriMobil = in.nextLine();

            // Jika mobil tersedia, inputkan "Tersedia"
            // Jika mobil tidak tersedia, inputkan rute perjalanan travel atau wilayah rental
            System.out.print("Status mobil saat ini : ");
            String status = in.nextLine();

            System.out.println();

            // Create object
            Mobil car = new Mobil(platMobil,merkMobil,warnaMobil,tahunKeluaran,kategoriMobil);
            car.infoMobil();
            if(status.equals("Tersedia")){
                car.pergi();
            } else {
                car.pergi(status);
            }
        }
    }
}
