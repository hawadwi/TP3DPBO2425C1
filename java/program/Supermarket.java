public class Supermarket extends Perusahaan {
    // Class Supermarket ini adalah turunan dari class Perusahaan.
    // Di sini ditambah atribut khusus untuk supermarket.

    private String kodeSupermarket; 
    private String lokasi;        
    private String luasToko;       
    private String jamOperasional;  

    // Constructor untuk mengisi data supermarket.
    // memanggil constructor parent (Perusahaan) pakai super(), lalu isi atribut khusus supermarket.
    public Supermarket(String noHp, String email, String alamat,
                       String nama, int tahunBerdiri, String bidangUsaha,
                       String kodeSupermarket, String lokasi, String luasToko, String jamOperasional) {
        super(noHp, email, alamat, nama, tahunBerdiri, bidangUsaha);
        this.kodeSupermarket = kodeSupermarket;
        this.lokasi = lokasi;
        this.luasToko = luasToko;
        this.jamOperasional = jamOperasional;
    }

    // Getter & Setter untuk akses dan ubah data supermarket
    public String getKodeSupermarket() { 
        return kodeSupermarket;
    }

    public void setKodeSupermarket(String kodeSupermarket) { 
        this.kodeSupermarket = kodeSupermarket;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getLuasToko() { 
        return luasToko;
    }

    public void setLuasToko(String luasToko) { 
        this.luasToko = luasToko;
    }

    public String getJamOperasional() { 
        return jamOperasional;
    }

    public void setJamOperasional(String jamOperasional) { 
        this.jamOperasional = jamOperasional;
    }
}
