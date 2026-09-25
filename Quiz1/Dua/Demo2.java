package Quiz1.Dua;

public class Demo2 {
    public static void main(String[] args) {
        //Karyawan
        Karyawan mekanik1 = new Karyawan("K01", "Budi", "Mekanik Mobil");
        Karyawan mekanik2 = new Karyawan("K02", "Siti", "Mekanik Sepeda Motor");

        //Layanan
        Layanan servis1 = new Layanan("Full Servis", 150000);
        Layanan servis2 = new Layanan("Normal Servis", 75000);

        //Informasi Semua Layanan yang Tersedia
        System.out.println(" Menu layanan : ");
        System.out.println("1. " + servis1.getServiceName() + " - Rp " + servis1.getServicePrice());
        System.out.println("2. " + servis2.getServiceName() + " - Rp " + servis2.getServicePrice());
        System.out.println("(Biaya Tambahan Jenis Kendaraan: (Mobil +Rp 50.000)(Motor +Rp 20.000))");
        System.out.println("--------------");

        //Pelanggan
        Pelanggan pelanggan1 = new Pelanggan("Ahmad", "081234567890");

        //2 Mobil dan 2 Sepeda Motor
        Kendaraan mobil1 = new Kendaraan("B 1234 CD", "Toyota", "Mobil keluarga", "Mobil");
        Kendaraan mobil2 = new Kendaraan("B 5678 EF", "Honda", "Mobil sport", "Mobil");
        Kendaraan motor1 = new Kendaraan("B 9012 GH", "Yamaha", "Motor kopling", "Sepeda Motor");
        Kendaraan motor2 = new Kendaraan("B 3456 IJ", "Honda", "Motor matic", "Sepeda Motor");

        //1 Pelanggan banyak kendaraan
        pelanggan1.tambahKendaraan(mobil1);
        pelanggan1.tambahKendaraan(mobil2);
        pelanggan1.tambahKendaraan(motor1);
        pelanggan1.tambahKendaraan(motor2);

        // informasi pelanggan
        System.out.println("Nama Pelanggan : " + pelanggan1.getNama());
        System.out.println("No Telepon     : " + pelanggan1.getNomorTelepon());
        System.out.println("Total Kendaraan: " + pelanggan1.getDaftarKendaraan().size() + " unit");
        System.out.println("--- Rincian Biaya ---");

        double totalSemua = 0;

        //untuk menghitung biaya tiap kendaraan
        for (Kendaraan k : pelanggan1.getDaftarKendaraan()) {
            Layanan layananDipilih;
            Karyawan teknisi;
            double biayaTambahan = 0;

            // pemilihan berdasarkan tipe kendaraan
            if (k.getTipeKendaraan().equalsIgnoreCase("Mobil")) {
                biayaTambahan = 50000;
                layananDipilih = servis1;
                teknisi = mekanik1;
            } else {
                biayaTambahan = 20000;
                layananDipilih = servis2; 
                teknisi = mekanik2;
            }

            double totalBiayaPerKendaraan = layananDipilih.getServicePrice() + biayaTambahan;
            totalSemua += totalBiayaPerKendaraan;

            // Cetak rincian per kendaraan
            System.out.println("Kendaraan     : " + k.getMerek() + " " + k.getModel() + " [" + k.getPlatNomor() + "] (" + k.getTipeKendaraan() + ")");
            System.out.println("Layanan       : " + layananDipilih.getServiceName() + " (Rp " + layananDipilih.getServicePrice() + ")");
            System.out.println("Biaya Tipe    : Rp " + biayaTambahan);
            System.out.println("Total         : Rp " + totalBiayaPerKendaraan);
            System.out.println("Teknisi       : " + teknisi.getNama() + " (" + teknisi.getSpesialisasi() + ")");
            System.out.println();
        }

        System.out.println("Estimasi biaya total: Rp " + totalSemua);
    }
}