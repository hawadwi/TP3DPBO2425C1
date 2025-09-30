#include <iostream>
using namespace std;

/* Class Produk untuk menyimpan data produk di supermarket */
class Produk {
    protected:
        string kodeProduk;   // Kode unik produk
        string nama;         // Nama produk
        string harga;        // Harga produk (disimpan sebagai string)
        int stok;            // Jumlah stok produk

    public:
        // Constructor kosong
        Produk() {
            kodeProduk = "";
            nama = "";
            harga = "";
            stok = 0;
        }

        // Constructor lengkap
        Produk(string kodeProduk, string nama, string harga, int stok) {
            this->kodeProduk = kodeProduk;
            this->nama = nama;
            this->harga = harga;
            this->stok = stok;
        }

        // Getter dan Setter
        string getKodeProduk() {
            return kodeProduk;
        }

        void setKodeProduk(string kodeProduk) {
            this->kodeProduk = kodeProduk;
        }

        string getNama() {
            return nama;
        }

        void setNama(string nama) {
            this->nama = nama;
        }

        string getHarga() {
            return harga;
        }

        void setHarga(string harga) {
            this->harga = harga;
        }

        int getStok() {
            return stok;
        }

        void setStok(int stok) {
            this->stok = stok;
        }
        ~Produk(){}
};
