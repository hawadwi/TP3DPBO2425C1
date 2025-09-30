public class Perusahaan extends InformasiKontak {
    // Class ini menurunkan InformasiKontak, jadi otomatis memiliki atribut dari parent class.
    // Lalu saya tambahin atribut khusus buat perusahaan.
    private String nama;
    private int tahunBerdiri;
    private String bidangUsaha;

    /* Ini constructor. Jadi pas kita bikin objek Perusahaan, kita bisa langsung isi data kontak (lewat super)
    dan juga data khusus perusahaan. */
    public Perusahaan(String noHp, String email, String alamat,
                      String nama, int tahunBerdiri, String bidangUsaha) {
        super(noHp, email, alamat); // manggil constructor dari parent (InformasiKontak)
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.bidangUsaha = bidangUsaha;
    }

    // Getter dan setter di bawah ini fungsinya buat ambil atau ubah data.
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getTahunBerdiri() {
        return tahunBerdiri;
    }

    public void setTahunBerdiri(int tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }
    
    public String getBidangUsaha() {
        return bidangUsaha;
    }

    public void setBidangUsaha(String bidangUsaha) {
        this.bidangUsaha = bidangUsaha;
    }
}
