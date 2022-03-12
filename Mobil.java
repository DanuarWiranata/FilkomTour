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
                    System.out.println("Supir travel menuju " + "Kota A " + "menggunakan mobil " + "mobil x " );                    
                }
                else {
                    System.out.println("Supir travel siap");
                }
                break;
            case "supir rentCar" :
                if ("tidak tersedia".equals(this.info)){
                    System.out.println("Supir travel menuju " + "Kota A " + "menggunakan mobil " + "mobil x " );                    
                }
                else {
                    System.out.println("Supir mobil siap");
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
    
    //method menampilkan messages
    public void display(){
        System.out.println("INFO KARYAWAN FILKOM TOUR");
        System.out.println("Nama karyawan   : " + this.nama);
        System.out.println("Alamat karyawan : " + this.alamat);
        System.out.println("Nomor telepon   : " + this.noTelp);
        System.out.println("jenis kelamin   : " + this.jenisKelamin);
        System.out.println("Jabatan         : " + this.jabatan);
        kategoriKaryawan();
    }
}
