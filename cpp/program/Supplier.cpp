#include <iostream>
#include "Perusahaan.h"
using namespace std;

/* Class Supplier yang mewarisi Perusahaan */
class Supplier : public Perusahaan{
    protected:
        string kodeSupplier;         // Kode unik supplier
        string daftarProdukSupplier; // Daftar produk yang disuplai
        string lamaKerjasama;        // Lama kerjasama (misal: "5 tahun")

    public:
        // Constructor kosong
        Supplier() : Perusahaan() {
            kodeSupplier = "";
            daftarProdukSupplier = "";
            lamaKerjasama = "";
        }

        // Constructor lengkap
        Supplier(string noHp, string email, string alamat,
                 string nama, int tahunBerdiri, string bidangUsaha,
                 string kodeSupplier, string daftarProdukSupplier, string lamaKerjasama)
                 : Perusahaan(noHp, email, alamat, nama, tahunBerdiri, bidangUsaha) {
            this->kodeSupplier = kodeSupplier;
            this->daftarProdukSupplier = daftarProdukSupplier;
            this->lamaKerjasama = lamaKerjasama;
        }

        // Getter dan Setter
        string getKodeSupplier() {
            return kodeSupplier;
        }

        void setKodeSupplier(string kodeSupplier) {
            this->kodeSupplier = kodeSupplier;
        }

        string getDaftarProdukSupplier() {
            return daftarProdukSupplier;
        }

        void setDaftarProdukSupplier(string daftarProdukSupplier) {
            this->daftarProdukSupplier = daftarProdukSupplier;
        }

        string getLamaKerjasama() {
            return lamaKerjasama;
        }

        void setLamaKerjasama(string lamaKerjasama) {
            this->lamaKerjasama = lamaKerjasama;
        }
        ~Supplier(){}
};
