package jobsheet07.tugas3;

public class RekeningGiro extends RekeningBank {
    private double bungaGiro;
    private String noBilyetGiro;

    // Constructor 1: Tanpa Parameter
    public RekeningGiro() {
        super();
        this.bungaGiro = 0.0;
        this.noBilyetGiro = "-";
    }

    // Constructor 2: Berparameter (Memanggil super berparameter)
    public RekeningGiro(int noRekening, int saldo, String namaBank, double bungaGiro, String noBilyetGiro) {
        super(noRekening, saldo, namaBank);
        this.bungaGiro = bungaGiro;
        this.noBilyetGiro = noBilyetGiro;
    }

    public double getBungaGiro() {
        return bungaGiro;
    }

    public void setBungaGiro(double bungaGiro) {
        this.bungaGiro = bungaGiro;
    }

    public String getNoBilyetGiro() {
        return noBilyetGiro;
    }

    public void setNoBilyetGiro(String noBilyetGiro) {
        this.noBilyetGiro = noBilyetGiro;
    }

    // Overriding Method hitungBunga
    @Override
    public double hitungBunga() {
        return getSaldo() * (bungaGiro / 100);
    }

    // Overriding Method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        System.out.println("=== REKENING GIRO ===");
        super.tampilkanInfo();
        System.out.println("Bunga Giro  : " + bungaGiro + "%");
        System.out.println("No Bilyet   : " + noBilyetGiro);
        System.out.println("Nominal Bunga: Rp " + hitungBunga());
        System.out.println("--------------------------------");
    }
}