#include <iostream>
#include "Perusahaan.h"
using namespace std;

/* Class Supermarket yang mewarisi Perusahaan */
class Supermarket : public Perusahaan{
    protected:
        string kodeSupermarket;   // Kode unik supermarket
        string lokasi;            // Lokasi supermarket
        string luasToko;          // Luas toko (misalnya "2000 m2")
        string jamOperasional;    // Jam operasional (misal: "08:00 - 22:00")

    public:
        // Constructor kosong
        Supermarket() : Perusahaan() {
            kodeSupermarket = "";
            lokasi = "";
            luasToko = "";
            jamOperasional = "";
        }

        // Constructor lengkap
        Supermarket(string noHp, string email, string alamat,
                    string nama, int tahunBerdiri, string bidangUsaha,
                    string kodeSupermarket, string lokasi, string luasToko, string jamOperasional)
                    : Perusahaan(noHp, email, alamat, nama, tahunBerdiri, bidangUsaha) {
            this->kodeSupermarket = kodeSupermarket;
            this->lokasi = lokasi;
            this->luasToko = luasToko;
            this->jamOperasional = jamOperasional;
        }

        // Getter dan Setter
        string getKodeSupermarket() {
            return kodeSupermarket;
        }

        void setKodeSupermarket(string kodeSupermarket) {
            this->kodeSupermarket = kodeSupermarket;
        }

        string getLokasi() {
            return lokasi;
        }

        void setLokasi(string lokasi) {
            this->lokasi = lokasi;
        }

        string getLuasToko() {
            return luasToko;
        }

        void setLuasToko(string luasToko) {
            this->luasToko = luasToko;
        }

        string getJamOperasional() {
            return jamOperasional;
        }

        void setJamOperasional(string jamOperasional) {
            this->jamOperasional = jamOperasional;
        }
        ~Supermarket(){}
};
