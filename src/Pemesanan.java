public class Pemesanan {
    public double hitungBiayaTiket() {
        return Tiket - (Tiket * (diskon / 100));
    }

    public double hitungDiskon() {
        return Tiket * (diskon / 100);
    }
}
