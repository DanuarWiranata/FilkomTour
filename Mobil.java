package advanceprogramming;

public class Mobil {

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
        System.out.println();
        System.out.printf("Nomor Plat Mobil : %s\n",this.noPlat);
        System.out.printf("Merk Mobil       : %s\n",this.merkMobil);
        System.out.printf("Warna Mobil      : %s\n",this.warnaMobil);
        System.out.printf("Tahun Keluaran   : %d\n",this.tahunKeluaran);
        System.out.printf("Kategori Mobil   : %s\n",this.kategoriMobil);
        System.out.println();
    }

    public void pergi(String rute) {
        if (this.kategoriMobil == "Travel") {
            System.out.printf("Mobil ini telah dipesan untuk %s dengan rute %s", this.kategoriMobil, rute);
        } else {
            System.out.printf("Mobil ini telah dipesan untuk %s di wilayah %s", this.kategoriMobil, rute);
        }
        System.out.println();
        System.out.println();
    }

    public void setKategori(String kategoriTerbaru) {
        this.kategoriMobil = kategoriTerbaru;
    }

    public static void main(String[] args) {
        Mobil c1 = new Mobil("N 1020 AC", "Toyota", "Hitam", 2018, "Travel");
        c1.infoMobil();
        c1.pergi("Malang-Surabaya");
        c1.setKategori("Rentcar");
        c1.infoMobil();
        c1.pergi("Kota Malang");
    }
}
