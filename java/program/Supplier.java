public class Supplier extends Perusahaan {
    // Class Supplier ini turunan dari Perusahaan,
    // jadi otomatis memiliki atribut dari class kontak atribut dari class perusahaan.

    private String kodeSupplier;        
    private String daftarProdukSupplier; 
    private String lamaKerjasama;       

    // Constructor buat isi data supplier.
    // Pertama panggil constructor parent (Perusahaan) dengan super(), lalu isi data khusus supplier.
    public Supplier(String noHp, String email, String alamat,
                    String nama, int tahunBerdiri, String bidangUsaha,
                    String kodeSupplier, String daftarProdukSupplier, String lamaKerjasama) {
        super(noHp, email, alamat, nama, tahunBerdiri, bidangUsaha);
        this.kodeSupplier = kodeSupplier;
        this.daftarProdukSupplier = daftarProdukSupplier;
        this.lamaKerjasama = lamaKerjasama;
    }

    // Getter & Setter buat ambil atau ubah data supplier

    public String getKodeSupplier() {
        return kodeSupplier;
    }

    public void setKodeSupplier(String kodeSupplier) { 
        this.kodeSupplier = kodeSupplier;
    }

    public String getDaftarProdukSupplier() { 
        return daftarProdukSupplier;
    }

    public void setDaftarProdukSupplier(String daftarProdukSupplier) { 
        this.daftarProdukSupplier = daftarProdukSupplier;
    }

    public String getLamaKerjasama() { 
        return lamaKerjasama;
    }

    public void setLamaKerjasama(String lamaKerjasama) { 
        this.lamaKerjasama = lamaKerjasama;
    }
}
