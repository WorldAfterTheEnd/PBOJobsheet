package Jobsheet2;
public class PintuDemo {
    public static void main(String[] args) {

        Pintu pintu1 = new Pintu();
        pintu1.ukuran = 210; 
        pintu1.warna = "Coklat Kayu";

        System.out.println("Pintu 1 ---");
        pintu1.displayInfo();
        pintu1.bukaPintu();

        Pintu pintu2 = new Pintu();
        pintu2.ukuran = 190;
        pintu2.warna = "Putih";

        System.out.println("Pintu 2 ---");
        pintu2.displayInfo();
        pintu2.tutupPintu();
        System.out.println();
        
        System.out.println("Pintu 1 Update ---");
        pintu1.ukuran = 220;
        pintu1.warna = "Coklat muda";
        pintu1.displayInfo();
        pintu1.tutupPintu();

        System.out.println("Pintu 2 Update ---");
        pintu2.ukuran = 195;
        pintu2.warna = "Putih Tulang";
        pintu2.displayInfo();
        pintu2.bukaPintu();
    }
}