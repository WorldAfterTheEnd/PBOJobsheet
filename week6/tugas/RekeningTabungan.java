package week6.tugas;

public class RekeningTabungan extends RekeningBank {
    private double bungaTabungan;

    //konstruktor
    public RekeningTabungan() {

    }
    public RekeningTabungan(int noRekening, int saldo, String namaBank, double bungaTabungan) {
        super(noRekening, saldo, namaBank);
        this.bungaTabungan = bungaTabungan;
    }

    // Getter dan Setter
    public double getBungaTabungan() {
        return bungaTabungan;
    }
    public void setBungaTabungan(double bungaTabungan) {
        this.bungaTabungan = bungaTabungan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== REKENING TABUNGAN ===");
        super.tampilkanInfo();
        System.out.println("Bunga       : " + bungaTabungan + "%");
        System.out.println("-------------------------");
    }
}