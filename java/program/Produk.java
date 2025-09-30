public class Produk {
    // Class Produk ini dipakai buat nyimpen data produk di supermarket.
    // Atribut produk yang disimpan:
    private String kodeProduk; 
    private String nama;       
    private String harga;     
    private int stok;         

    // Constructor, dipakai buat langsung isi data produk pas bikin objek baru
    public Produk(String kodeProduk, String nama, String harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter dan setter di bawah ini buat akses dan ubah data produk

    public String getKodeProduk() {  
        return kodeProduk;
    }

    public void setKodeProduk(String kodeProduk) { 
        this.kodeProduk = kodeProduk;
    }

    public String getNama() {  
        return nama;
    }

    public void setNama(String nama) { 
        this.nama = nama;
    }

    public String getHarga() {  
        return harga;
    }

    public void setHarga(String harga) { 
        this.harga = harga;
    }

    public int getStok() {  
        return stok;
    }

    public void setStok(int stok) { 
        this.stok = stok;
    }
}
