package jobsheet07.tugas2;

public class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen makan sambil memeriksa tugas mahasiswa.");
    }

    public void lembur() {
        System.out.println("Dosen sedang lembur rekap nilai.");
    }
}