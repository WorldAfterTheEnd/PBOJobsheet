package UTS.No2;

public class Tumbuhan {
    private String nama;

    public Tumbuhan(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return this.nama;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Tumbuhan: " + this.nama);
    }


}