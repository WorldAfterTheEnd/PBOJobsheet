package jobsheet07.tugas2;

public class MainManusia {
    public static void main(String[] args) {
        System.out.println("DYNAMIC METHOD DISPATCH ");

        // Reference bertipe Manusia, merujuk ke objek Manusia
        Manusia m1 = new Manusia();
        m1.bernafas();
        m1.makan();
        System.out.println();

        // Reference bertipe Manusia, merujuk ke objek Dosen
        Manusia m2 = new Dosen();
        m2.bernafas();
        m2.makan(); // Memanggil method makan() milik Dosen
        System.out.println();

        // Reference bertipe Manusia, merujuk ke objek Mahasiswa
        Manusia m3 = new Mahasiswa();
        m3.bernafas();
        m3.makan(); // Memanggil method makan() milik Mahasiswa
    }
}