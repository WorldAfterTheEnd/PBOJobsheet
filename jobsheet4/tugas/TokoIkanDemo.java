package jobsheet4.tugas;

public class TokoIkanDemo {
    public static void main(String[] args) {
        // 1. Buat Objek Pelanggan
        Pelanggan pelanggan1 = new Pelanggan("P001", "Budi Santoso");

        // 2. Buat Objek Kasir
        Kasir kasir1 = new Kasir("K-99", "Mbak Siti");
        kasir1.setPelanggan(pelanggan1); // Pelanggan berinteraksi dengan kasir

        // 3. Buat Objek Ikan
        Ikan ikan1 = new Ikan("IKN01", "Ikan Nila", 25000.0, 50);
        Ikan ikan2 = new Ikan("IKN02", "Ikan Gurame", 45000.0, 30);
        Ikan ikan3 = new Ikan("IKN03", "Ikan Lele", 15000.0, 100);

        // 4. Kasir mengelola (memasukkan) daftar ikan yang dibeli
        kasir1.tambahIkan(ikan1);
        kasir1.tambahIkan(ikan2);
        kasir1.tambahIkan(ikan3);

        // 5. Tampilkan struk pendaftaran / daftar ikan
        kasir1.tampilkanDaftarIkan();
    }
}