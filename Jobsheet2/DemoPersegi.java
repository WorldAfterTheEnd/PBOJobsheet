package Jobsheet2;
public class DemoPersegi {
    public static void main(String[] args) {

        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 10;
        pp1.lebar = 5;

        System.out.println("Data PersegiPanjang 1 :");
        pp1.displayInfo();
        System.out.println("Luas    : " + pp1.getLuas());
        System.out.println("Keliling: " + pp1.getKeliling());
        System.out.println();

        PersegiPanjang pp2 = new PersegiPanjang();
        pp2.panjang = 20;
        pp2.lebar = 10;

        System.out.println("Data PersegiPanjang 2 :");
        pp2.displayInfo();
        System.out.println("Luas    : " + pp2.getLuas());
        System.out.println("Keliling: " + pp2.getKeliling());
    }
}