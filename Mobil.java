package advanceprogramming;

public class Mobil {

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

    public void setTahunKeluaran(int tahunKeluaran) {
        this.tahunKeluaran = tahunKeluaran;
    }

    public void setKategoriMobil(String kategoriTerbaru) {
        this.kategoriMobil = kategoriTerbaru;
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
        if (this.kategoriMobil.equals("Travel")) {
            System.out.printf("Mobil ini telah dipesan untuk %s dengan rute %s", this.kategoriMobil, rute);
        } else {
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
