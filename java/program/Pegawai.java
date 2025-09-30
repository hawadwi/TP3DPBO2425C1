public class Pegawai extends Orang {
    /* Class Pegawai ini turunan dari class Orang,
    Di sini saya tambahin atribut khusus untuk pegawai: kode pegawai, jabatan, gaji, dan shift. */
    private String kodePegawai;
    private String jabatan;
    private String gaji;
    private String shift;

    // Constructor ini dipakai buat ngisi data pegawai.
    // Pertama, constructor parent (Orang) dipanggil dengan super(), lalu atribut khusus pegawai diisi.
    public Pegawai(String noHp, String email, String alamat,
                   String nama, int usia, String tanggalLahir,
                   String kodePegawai, String jabatan, String gaji, String shift) {
        super(noHp, email, alamat, nama, usia, tanggalLahir);
        this.kodePegawai = kodePegawai;
        this.jabatan = jabatan;
        this.gaji = gaji;
        this.shift = shift;
    }

    // Getter dan setter berikut dipakai untuk akses atau ubah
    // data khusus pegawai tadi: kode pegawai, jabatan, gaji, dan shift.
    public String getKodePegawai() {
        return kodePegawai;
    }

    public void setKodePegawai(String kodePegawai) {
        this.kodePegawai = kodePegawai;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getGaji() {
        return gaji;
    }

    public void setGaji(String gaji) {
        this.gaji = gaji;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}
