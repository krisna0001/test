import java.util.ArrayList;

/**
 * Kelas ini merepresentasikan buku dengan atribut judul, penulis, dan tahun terbit.
 *
 * @author Nama Anda
 * @version 1.0
 * @since 2024
 */
public class PengelolaanBukuSesudah {
    private String judul;
    private String penulis;
    private int tahunTerbit;

    /**
     * Constructor untuk membuat objek PengelolaanBukuSesudah.
     *
     * @param judul Judul buku
     * @param penulis Penulis buku
     * @param tahunTerbit Tahun terbit buku
     */
    public PengelolaanBukuSesudah(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    /**
     * Mengambil judul buku.
     *
     * @return Judul buku
     */
    public String getJudul() {
        return judul;
    }

    /**
     * Mengambil penulis buku.
     *
     * @return Penulis buku
     */
    public String getPenulis() {
        return penulis;
    }

    /**
     * Mengambil tahun terbit buku.
     *
     * @return Tahun terbit buku
     */
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    /**
     * Menampilkan informasi lengkap tentang buku.
     */
    public void tampilkanInformasiBuku() {
        printBookDetails();
    }

    private void printBookDetails() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }

    /**
     * Mencetak pemisah untuk format yang lebih baik.
     */
    private void printSeparator() {
        System.out.println("---------------");
    }

    /**
     * Metode utama untuk menjalankan program.
     *
     * @param args Argumen baris perintah
     */
    public static void main(String[] args) {
        ArrayList<PengelolaanBukuSesudah> daftarBuku = new ArrayList<>();
        daftarBuku.add(new PengelolaanBukuSesudah("Buku A", "Penulis A", 2020));
        daftarBuku.add(new PengelolaanBukuSesudah("Buku B", "Penulis B", 2021));

        for (PengelolaanBukuSesudah buku : daftarBuku) {
            buku.tampilkanInformasiBuku();
            buku.printSeparator();
        }
    }
}
