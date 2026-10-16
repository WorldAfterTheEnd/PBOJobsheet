package jobsheet07.tugas1;

public class Segitiga {
    private int sudut;

    // Overloading 1: Menghitung total sudut jika diketahui 1 sudut
    public int totalSudut(int sudutA) {
        this.sudut = 180 - sudutA;
        return this.sudut;
    }

    // Overloading 2: Menghitung total sudut jika diketahui 2 sudut
    public int totalSudut(int sudutA, int sudutB) {
        this.sudut = 180 - (sudutA + sudutB);
        return this.sudut;
    }

    // Overloading 3: Menghitung keliling segitiga sembarang (3 sisi)
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Overloading 4: Menghitung keliling segitiga siku-siku (2 sisi tegak, cari sisi miring c)
    public double keliling(int sisiA, int sisiB) {
        double c = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return sisiA + sisiB + c;
    }
}