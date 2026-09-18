package jobsheet4.tugas;

import java.util.ArrayList;

public class Kasir {
    private String idKasir;
    private String namaKasir;
    private ArrayList<Ikan> daftarIkan;
    private Pelanggan pelanggan; // Relasi 1 pelanggan berinteraksi dengan 1 kasir

    public Kasir(String idKasir, String namaKasir) {
        this.idKasir = idKasir;
        this.namaKasir = namaKasir;
        this.daftarIkan = new ArrayList<Ikan>();
    }

    public String getIdKasir() {
        return idKasir;
    }

    public void setIdKasir(String idKasir) {
        this.idKasir = idKasir;
    }

    public String getNamaKasir() {
        return namaKasir;
    }

    public void setNamaKasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }
    
    // Method untuk menghubungkan pelanggan dengan kasir
    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    // Method tambahan untuk memasukkan ikan ke keranjang kasir
    public void tambahIkan(Ikan ikan) {
        daftarIkan.add(ikan);
    }

    // Method pembayaran yang mengembalikan nilai Integer
    public int pembayaran() {
        double total = 0;
        for (Ikan ikan : daftarIkan) {
            total += ikan.getHarga();
        }
        return (int) total; // Casting dari double ke int 
    }

    // Method untuk menampilkan struk belanja
    public void tampilkanDaftarIkan() {
        System.out.println("TOKO IKAN SEGAR");
        System.out.println("===============================");
        System.out.println("Kasir     : " + this.namaKasir + " (" + this.idKasir + ")");
        if (this.pelanggan != null) {
            System.out.println("Pelanggan : " + this.pelanggan.getNama() + " (" + this.pelanggan.getIdPelanggan() + ")");
        }
        System.out.println("-------------------------------");
        System.out.println("Daftar Belanja:");
        for (Ikan ikan : daftarIkan) {
            System.out.println("- " + ikan.getNamaIkan() + " | Rp " + (int)ikan.getHarga());
        }
        System.out.println("--------------------------------");
        System.out.println("TOTAL PEMBAYARAN : Rp " + pembayaran());
        System.out.println("=====================================\n");
    }
}