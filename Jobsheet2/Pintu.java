package Jobsheet2;
public class Pintu {

    public int ukuran; 
    public String warna;  


    public void bukaPintu() {
        System.out.println("Pintu warna " + warna + " dengan tinggi " + ukuran + " cm berhasil Dibuka.");
    }

    public void tutupPintu() {
        System.out.println("Pintu warna " + warna + " dengan tinggi " + ukuran + " cm Ditutup.");
    }
    
    public void displayInfo() {
        System.out.println("Tinggi Pintu : " + ukuran + " cm");
        System.out.println("Warna Pintu  : " + warna);
    }
}