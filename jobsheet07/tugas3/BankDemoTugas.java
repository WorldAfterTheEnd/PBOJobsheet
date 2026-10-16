package jobsheet07.tugas3;

public class BankDemoTugas {
    public static void main(String[] args) {
        System.out.println("=== DEMO IMPLEMENTASI OVERLOADING & OVERRIDING ===");
        System.out.println();

        // 1. Menggunakan Constructor Berparameter (Overloading Constructor & Super)
        RekeningBunga tabungan1 = new RekeningBunga(1012345, 5000000, "Bank BRI", 2.5);
        RekeningGiro giro1 = new RekeningGiro(9087654, 15000000, "Bank Mandiri", 1.2, "BG-998877");

        // 2. Menggunakan Constructor Tanpa Parameter
        RekeningBunga tabungan2 = new RekeningBunga();
        tabungan2.setNoRekening(2022334);
        tabungan2.setSaldo(10000000);
        tabungan2.setBungaTabungan(3.0);

        // Menampilkan Informasi (Overriding Method)
        tabungan1.tampilkanInfo();
        System.out.println();
        giro1.tampilkanInfo();
        System.out.println();
        tabungan2.tampilkanInfo();
    }
}