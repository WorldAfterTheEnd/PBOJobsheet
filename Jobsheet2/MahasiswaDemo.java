package Jobsheet2;
public class MahasiswaDemo {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        
        m1.displayBiodata();

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "254107060030";
        m2.nama = "Komandan Tedy";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2B";
        
        m2.displayBiodata();

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "254107060032";
        m3.nama = "Muhammad Abhirama Putra";
        m3.alamat = "Demak, Jawa Tengah";
        m3.kelas = "2F";
        
        m3.displayBiodata();

    }
}
