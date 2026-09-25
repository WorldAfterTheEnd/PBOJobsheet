package Quiz1.Dua;

import java.util.ArrayList;

class Pelanggan {
    private String nama;
    private String nomorTelepon;
    private ArrayList<Kendaraan> daftarKendaraan; //ini untuk pelanggan punya banyak kendaraan

    public Pelanggan(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.daftarKendaraan = new ArrayList<>();
    }

    public void tambahKendaraan(Kendaraan k) {
        this.daftarKendaraan.add(k);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon){
        this.nomorTelepon = nomorTelepon;
    }

    public ArrayList<Kendaraan> getDaftarKendaraan() {
        return daftarKendaraan;
    }
}