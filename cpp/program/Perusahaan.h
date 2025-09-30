#pragma once
#include "InformasiKontak.h"
using namespace std;

/* Class Perusahaan yang mewarisi InformasiKontak */
class Perusahaan : public InformasiKontak{
    protected:
        string nama;          // Nama perusahaan
        int tahunBerdiri;     // Tahun berdirinya perusahaan
        string bidangUsaha;   // Bidang usaha perusahaan

    public:
        // Constructor kosong
        Perusahaan() : InformasiKontak() {
            nama = "";
            tahunBerdiri = 0;
            bidangUsaha = "";
        }

        // Constructor lengkap
        Perusahaan(string noHp, string email, string alamat,
                   string nama, int tahunBerdiri, string bidangUsaha)
                   : InformasiKontak(noHp, email, alamat) {
            this->nama = nama;
            this->tahunBerdiri = tahunBerdiri;
            this->bidangUsaha = bidangUsaha;
        }

        // Getter dan Setter
        string getNama() {
            return nama;
        }

        void setNama(string nama) {
            this->nama = nama;
        }

        int getTahunBerdiri() {
            return tahunBerdiri;
        }

        void setTahunBerdiri(int tahunBerdiri) {
            this->tahunBerdiri = tahunBerdiri;
        }

        string getBidangUsaha() {
            return bidangUsaha;
        }

        void setBidangUsaha(string bidangUsaha) {
            this->bidangUsaha = bidangUsaha;
        }
        ~Perusahaan(){}
};
