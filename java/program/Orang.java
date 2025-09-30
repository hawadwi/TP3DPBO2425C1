public class Orang extends InformasiKontak {
    /* Class Orang ini mewarisi (extends) dari class InformasiKontak, jadi otomatis punya atribut dari parent class.
     Di sini saya tambahkan atribut khusus untuk orang */
    private String nama;
    private int usia;
    private String tanggalLahir;

    // Constructor ini dipakai buat isi data awal.
    // Karena class ini extends InformasiKontak, kita panggil juga constructor dari parent pakai super().
    public Orang(String noHp, String email, String alamat,
                 String nama, int usia, String tanggalLahir) {
        super(noHp, email, alamat);
        this.nama = nama;
        this.usia = usia;
        this.tanggalLahir = tanggalLahir;
    }

    // Getter dan setter di bawah ini dipakai untuk ambil dan ubah nilai
    // dari atribut nama, usia, dan tanggal lahir.
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
}
