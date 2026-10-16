package jobsheet07.tugas3;

public class RekeningBunga extends RekeningBank {
    private double bungaTabungan;

    // Constructor 1: Tanpa Parameter
    public RekeningBunga() {
        super();
        this.bungaTabungan = 0.0;
    }

    // Constructor 2: Berparameter (Memanggil super berparameter)
    public RekeningBunga(int noRekening, int saldo, String namaBank, double bungaTabungan) {
        super(noRekening, saldo, namaBank);
        this.bungaTabungan = bungaTabungan;
    }

    public double getBungaTabungan() {
        return bungaTabungan;
    }

    public void setBungaTabungan(double bungaTabungan) {
        this.bungaTabungan = bungaTabungan;
    }

    // Overriding Method hitungBunga
    @Override
    public double hitungBunga() {
        return getSaldo() * (bungaTabungan / 100);
    }

    // Overriding Method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        System.out.println("=== REKENING TABUNGAN BUNGA ===");
        super.tampilkanInfo();
        System.out.println("Bunga (%)   : " + bungaTabungan + "%");
        System.out.println("Nominal Bunga: Rp " + hitungBunga());
        System.out.println("--------------------------------");
    }
}