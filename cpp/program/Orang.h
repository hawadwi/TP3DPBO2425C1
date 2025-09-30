#pragma once
#include <string>
#include "InformasiKontak.h"
using namespace std;

/* Class Orang yang mewarisi InformasiKontak */
class Orang : public InformasiKontak{
    protected:
        string nama;  // Nama orang
        int usia; // Usia orang
        string tanggalLahir; // Tanggal lahir orang (format: DD-MM-YYYY)

    public:
        // Constructor kosong
        Orang() : InformasiKontak() {
            nama = "";
            usia = 0;
            tanggalLahir = "";
        }

        // Constructor lengkap
        Orang(string noHp, string email, string alamat,
              string nama, int usia, string tanggalLahir)
              : InformasiKontak(noHp, email, alamat) {
            this->nama = nama;
            this->usia = usia;
            this->tanggalLahir = tanggalLahir;
        }

        // Getter dan Setter
        string getNama() {
            return nama;
        }

        void setNama(string nama) {
            this->nama = nama;
        }

        int getUsia() {
            return usia;
        }

        void setUsia(int usia) {
            this->usia = usia;
        }

        string getTanggalLahir() {
            return tanggalLahir;
        }

        void setTanggalLahir(string tanggalLahir) {
            this->tanggalLahir = tanggalLahir;
        }
        ~Orang(){}
};


