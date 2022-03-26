package transaksi;

public class PemesanTravel {
Scanner scan = new Scanner (System.in);

private String tglPemesanan;
private String namaPemesan;
private String alamat;
private String noTelp;

    public PemesananTravel(){

    }

    public void setTglPemesanan() {
        System.out.print("Masukkan tanggal pemesanan  : ");
        tglPemesanan = scan.nextLine();
    }

    public void setNamaPemesan() {
        System.out.print("Masukkan nama anda          : ");
        namaPemesan = scan.nextLine();
    }

    public void setAlamat() {
        System.out.print("Masukkan alamat rumah anda  : ");
        alamat = scan.nextLine();
    }

    public void setNoTelp() {
        System.out.print("Masukkan nomor telepon anda : ");
        noTelp = scan.nextLine();
    }

    public void infoPemesanan(){
        System.out.println("========================================");
        System.out.println("Tanggal Pemesanan : " + tglPemesanan);
        System.out.println("Pemesan           : " + namaPemesan);
        System.out.println("Alamat            : " + alamat);
        System.out.println("Nomor telepon     : " + noTelp);
        System.out.println("========================================");
    }
}

//contoh class main
class main {
    public static void main(String[] args) {
        pemesananTravel p1 = new pemesananTravel();
        p1.setTglPemesanan();
        p1.setNamaPemesan();
        p1.setAlamat();
        p1.setNoTelp();
        p1.infoPemesanan();
    }
}
}
