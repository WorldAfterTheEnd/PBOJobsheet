package jobsheet4.tugas;

public class Ikan {
    private String idIkan;
    private String namaIkan;
    private double harga;
    private int stok;

    public Ikan(String idIkan, String namaIkan, double harga, int stok) {
        this.idIkan = idIkan;
        this.namaIkan = namaIkan;
        this.harga = harga;
        this.stok = stok;
    }

    public String getIdIkan() {
        return idIkan;
    }

    public void setIdIkan(String idIkan) {
        this.idIkan = idIkan;
    }

    public String getNamaIkan() {
        return namaIkan;
    }

    public void setNamaIkan(String namaIkan) {
        this.namaIkan = namaIkan;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
