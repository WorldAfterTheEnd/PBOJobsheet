package Quiz1.Dua;

class Karyawan {
    private String idKaryawan;
    private String nama;
    private String spesialisasi;

    public Karyawan(String idKaryawan, String nama, String spesialisasi) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    
}