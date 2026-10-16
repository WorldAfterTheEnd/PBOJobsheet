package UTS.No2;

public class Sayur extends Tumbuhan {
    private String warna;

    public Sayur(String nama) {
        super(nama);
    }

    public String setWarna(String warna) {
        this.warna = warna;
        return this.warna;
    }

    public String getWarna() {
        return this.warna;
    }

    @Override 
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Warna Sayur: " + this.warna);
    }
}