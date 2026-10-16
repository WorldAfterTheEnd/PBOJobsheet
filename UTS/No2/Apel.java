package UTS.No2;

public class Apel extends Buah {
    private String jenis;

    public Apel(String nama) {
        super(nama);
    }

    public String setJenis(String jenis) {
        this.jenis = jenis;
        return this.jenis;
    }
    public String getJenis() {
        return this.jenis;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Apel: " + this.jenis);
    }
    
}