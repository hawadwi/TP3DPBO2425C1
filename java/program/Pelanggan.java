public class Pelanggan extends Orang {
    // atribut tambahan khusus pelanggan
    private String kodePelanggan;     
    private String saldo;            
    private int kuantitas;           
    private String statusMember; // status keanggotaan (misalnya Gold, Silver)
    private String riwayatTransaksi; 

    // constructor untuk inisialisasi data pelanggan
    public Pelanggan(String noHp, String email, String alamat,
                     String nama, int usia, String tanggalLahir,
                     String kodePelanggan, String saldo, int kuantitas,
                     String statusMember, String riwayatTransaksi) {
        // panggil constructor parent (Orang) untuk isi data umum
        super(noHp, email, alamat, nama, usia, tanggalLahir);
        // isi data khusus pelanggan
        this.kodePelanggan = kodePelanggan;
        this.saldo = saldo;
        this.kuantitas = kuantitas;
        this.statusMember = statusMember;
        this.riwayatTransaksi = riwayatTransaksi;
    }

    // getter & setter untuk akses dan ubah data
    public String getKodePelanggan() {
        return kodePelanggan;
    }

    public void setKodePelanggan(String kodePelanggan) {
        this.kodePelanggan = kodePelanggan;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public String getStatusMember() {
        return statusMember;
    }

    public void setStatusMember(String statusMember) {
        this.statusMember = statusMember;
    }

    public String getRiwayatTransaksi() {
        return riwayatTransaksi;
    }

    public void setRiwayatTransaksi(String riwayatTransaksi) {
        this.riwayatTransaksi = riwayatTransaksi;
    }
}
