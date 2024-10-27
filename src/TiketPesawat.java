public class TiketPesawat extends Pemesanan implements Tiket {
    private String nama;
    private String asal;
    private String tujuan;
    private double Tiket;
    private double diskon;

    public TiketPesawat(info info)
    {
        this.nama = this.nama;
        this.asal = this.asal;
        this.tujuan = info.tujuan();
        this.Tiket = info.hargatiket();
        this.diskon = this.diskon;
    }

   public void tampilkanInformasi() {
        System.out.println("Nama Penumpang: " + nama);
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Harga Tiket: " + Tiket);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Biaya Tiket Setelah Diskon: " + hitungBiayaTiket());
        System.out.println("Jumlah Diskon: " + hitungDiskon());
    }

    private static record info(String nama, String asal, String tujuan, double hargatiket, double diskon) {
    }
}
