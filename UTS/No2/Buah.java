package UTS.No2;

public class Buah extends Tumbuhan {
    private String rasa;

    public Buah(String nama) {
        super(nama);
    }

    public String setRasa(String rasa) {
        this.rasa = rasa;
        return this.rasa;
    }
    public String getRasa() {
        return this.rasa;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Rasa Buah: " + this.rasa);
    }
}