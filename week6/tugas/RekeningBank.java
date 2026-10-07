package week6.tugas;


public class RekeningBank {
    private int noRekening;
    private int saldo;
    private String namaBank;

    // 1. Constructor Tanpa Parameter (Default)
    public RekeningBank() {
        this.noRekening = 0;
        this.saldo = 0;
        this.namaBank = "Belum Diatur";
    }

    // 2. Constructor Berparameter (Overloading)
    public RekeningBank(int noRekening, int saldo, String namaBank) {
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.namaBank = namaBank;
    }

    // Getter dan Setter
    public int getNoRekening() {
        return noRekening;
    }

    public void setNoRekening(int noRekening) {
        this.noRekening = noRekening;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Bank   : " + namaBank);
        System.out.println("No Rekening : " + noRekening);
        System.out.println("Saldo       : Rp " + saldo);
    }
}