package week6.tugas;

import week6.tugas.RekeningGiro;
import week6.tugas.RekeningTabungan;

public class BankDemo {
    public static void main(String[] args) {
        RekeningTabungan tabungan1 = new RekeningTabungan();
        RekeningGiro giro1 = new RekeningGiro();
        // Menampilkan informasi masing-masing rekening
        tabungan1.tampilkanInfo();
        System.out.println();
        giro1.tampilkanInfo();


        System.out.println();
        System.out.println("BEFOREEEEEEEEE");
        System.out.println();        
        tabungan1 = new RekeningTabungan(1012345, 5000000, "Bank BRI", 2.5);
        giro1 = new RekeningGiro(9087654, 15000000, "Bank Mandiri", 1.2, "BG-998877");
        // Menampilkan informasi masing-masing rekening
        tabungan1.tampilkanInfo();
        System.out.println();
        giro1.tampilkanInfo();



        System.out.println();
        System.out.println("AFTERRRR");
        System.out.println();
        tabungan1 = new RekeningTabungan(1012345, 3000000, "Bank BRI", 2.5);
        giro1 = new RekeningGiro(9087654, 20000000, "Bank Mandiri", 1.1, "BG-998877");
        // Menampilkan informasi masing-masing rekening
        tabungan1.tampilkanInfo();
        System.out.println();
        giro1.tampilkanInfo();

    }
}