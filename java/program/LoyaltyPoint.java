public class LoyaltyPoint {
    /* Ini saya buat class namanya LoyaltyPoint. Class ini tujuannya buat nyimpen data poin pelanggan,
     misalnya berapa total poin, level keanggotaan, sama bonus spesialnya. */
    private int totalPoint;
    private String level;
    private String bonusSpesial;

    // Ini constructor. Jadi pas bikin objek LoyaltyPoint,
    // kita bisa langsung masukin nilai poin, level, dan bonusnya.
    public LoyaltyPoint(int totalPoint, String level, String bonusSpesial) {
        this.totalPoint = totalPoint;
        this.level = level;
        this.bonusSpesial = bonusSpesial;
    }

    // Getter dan setter di bawah ini dipakai buat akses atau ubah data.
    // Jadi misalnya kita mau tau berapa total poin yang dimiliki, tinggal pakai getTotalPoint(). 
     
    public int getTotalPoint() {
        return totalPoint;
    }

    // Kalau mau nambah atau ganti nilainya, kita bisa pakai setTotalPoint().
    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    // Sama juga dengan level, kalau mau liat level panggil getLevel(),
    // kalau mau ubah level panggil setLevel().
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    // Dan terakhir untuk bonus spesialnya.
    // getBonusSpesial() buat liat bonus apa yang didapat,
    public String getBonusSpesial() {
        return bonusSpesial;
    }

    // setBonusSpesial() buat ganti bonusnya.
    public void setBonusSpesial(String bonusSpesial) {
        this.bonusSpesial = bonusSpesial;
    }
}
