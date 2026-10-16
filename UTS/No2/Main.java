package UTS.No2;

public class Main {
    public static void main(String[] args) {
        //(Buah) Apel
        Apel apel1 = new Apel("Apel Hijau");
        apel1.setJenis("Manalagi");
        apel1.setRasa("Manis");
        apel1.tampilkanInfo();

        System.out.println();

        // Sayur
        Sayur sayur1 = new Sayur("Bayam");
        sayur1.setWarna("Hijau");
        sayur1.tampilkanInfo();
    }
}
