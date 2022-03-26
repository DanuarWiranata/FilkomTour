package model;

public class Karyawan {
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
