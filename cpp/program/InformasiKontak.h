#pragma once
#include <string>
using namespace std;

/* Class untuk menyimpan data Informasi Kontak
   Semua atribut dibuat private agar aman */
class InformasiKontak{
    protected:
        string noHp;    // Nomor HP
        string email;   // Alamat email
        string alamat;  // Alamat lengkap

    public:
        // Constructor kosong
        InformasiKontak() {
            noHp = "";
            email = "";
            alamat = "";
        }

        // Constructor lengkap
        InformasiKontak(string noHp, string email, string alamat) {
            this->noHp = noHp;
            this->email = email;
            this->alamat = alamat;
        }

        // Getter dan Setter
        string getNoHp() {
            return noHp;
        }

        void setNoHp(string noHp) {
            this->noHp = noHp;
        }

        string getEmail() {
            return email;
        }

        void setEmail(string email) {
            this->email = email;
        }

        string getAlamat() {
            return alamat;
        }

        void setAlamat(string alamat) {
            this->alamat = alamat;
        }
        ~InformasiKontak(){}
};
