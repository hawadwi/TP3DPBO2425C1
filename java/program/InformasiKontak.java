public class InformasiKontak {
    // Di sini saya bikin class namanya InformasiKontak.
    // Class ini dipakai buat nyimpen data kontak seperti nomor HP, email, sama alamat.
    private String noHp;
    private String email;
    private String alamat;

    /*Ini constructor. Jadi waktu kita bikin objek InformasiKontak,
     otomatis kita bisa langsung masukin nilai nomor HP, email, dan alamatnya. */
    public InformasiKontak(String noHp, String email, String alamat) {
        this.noHp = noHp;
        this.email = email;
        this.alamat = alamat;
    }

    /* Getter sama setter di bawah ini fungsinya buat ngambil dan ngubah data.
     Misalnya kita mau lihat nomor HP yang udah disimpan, kita panggil getNoHp().
     Kalau mau ganti nomor HP, kita pakai setNoHp(). */
    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
