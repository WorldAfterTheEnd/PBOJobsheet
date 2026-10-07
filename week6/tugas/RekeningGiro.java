package week6.tugas;

public class RekeningGiro extends RekeningBank {
    private double bungaGiro;
    private String noBilyetGiro;

    //konstruktor
    public RekeningGiro() {

    }

    public RekeningGiro(int noRekening, int saldo, String namaBank, double bungaGiro, String noBilyetGiro) {
        super(noRekening, saldo, namaBank);
        this.bungaGiro = bungaGiro;
        this.noBilyetGiro = noBilyetGiro;
    }

    // getter setter
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

    @Override
    public void tampilkanInfo() {
        System.out.println("=== REKENING GIRO ===");
        super.tampilkanInfo();
        System.out.println("Bunga Giro  : " + bungaGiro + "%");
        System.out.println("No Bilyet   : " + noBilyetGiro);
        System.out.println("-------------------------");
    }
}
