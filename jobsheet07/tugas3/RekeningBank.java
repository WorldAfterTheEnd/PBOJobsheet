package jobsheet07.tugas3;

public class RekeningBank {
    private int noRekening;
    private int saldo;
    private final String namaBank; // Kata kunci final pada atribut sesuai UML

    // Constructor 1: Tanpa Parameter (Overloading)
    public RekeningBank() {
        this.noRekening = 0;
        this.saldo = 0;
        this.namaBank = "Bank Umum";
    }

    // Constructor 2: Berparameter (Overloading)
    public RekeningBank(int noRekening, int saldo, String namaBank) {
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.namaBank = namaBank;
    }

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

    public double hitungBunga() {
        return 0.0;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Bank   : " + namaBank);
        System.out.println("No Rekening : " + noRekening);
        System.out.println("Saldo       : Rp " + saldo);
    }
}