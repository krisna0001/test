import java.util.ArrayList;

public class PengelolaanBuku {
    private String judul;
    private String penulis;
    private int tahunTerbit;

    public PengelolaanBuku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilkanInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }

    public static void main(String[] args) {
        ArrayList<PengelolaanBuku> daftarBuku = new ArrayList<>();
        daftarBuku.add(new PengelolaanBuku("Buku A", "Penulis A", 2020));
        daftarBuku.add(new PengelolaanBuku("Buku B", "Penulis B", 2021));

        for (PengelolaanBuku buku : daftarBuku) {
            buku.tampilkanInformasi();
            System.out.println("---------------");
        }
    }
}
