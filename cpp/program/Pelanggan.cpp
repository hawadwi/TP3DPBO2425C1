#include <iostream>
#include "Orang.h"
#include "LoyaltyPoint.h"
using namespace std;

/* Class Pelanggan yang mewarisi Orang */
class Pelanggan : public Orang {
    protected:
        string kodePelanggan;
        string saldo;
        int kuantitas;
        string statusMember;
        string riwayatTransaksi;
        LoyaltyPoint loyalty;   // Komposisi → pelanggan punya loyalty point

    public:
        // Constructor kosong
        Pelanggan() : Orang() {
            kodePelanggan = "";
            saldo = "";
            kuantitas = 0;
            statusMember = "";
            riwayatTransaksi = "";
            loyalty = LoyaltyPoint(); // default
        }

        // Constructor lengkap
        Pelanggan(string noHp, string email, string alamat,
                string nama, int usia, string tanggalLahir,
                string kodePelanggan, string saldo, int kuantitas,
                string statusMember, string riwayatTransaksi,
                LoyaltyPoint loyalty)
            : Orang(noHp, email, alamat, nama, usia, tanggalLahir) {
            this->kodePelanggan = kodePelanggan;
            this->saldo = saldo;
            this->kuantitas = kuantitas;
            this->statusMember = statusMember;
            this->riwayatTransaksi = riwayatTransaksi;
            this->loyalty = loyalty;
        }

        // Getter dan Setter
        string getKodePelanggan() {
            return kodePelanggan;
        }

        void setKodePelanggan(string kodePelanggan) {
            this->kodePelanggan = kodePelanggan;
        }

        string getSaldo() {
            return saldo;
        }

        void setSaldo(string saldo) {
            this->saldo = saldo;
        }

        int getKuantitas() {
            return kuantitas;
        }

        void setKuantitas(int kuantitas) {
            this->kuantitas = kuantitas;
        }

        string getStatusMember() {
            return statusMember;
        }

        void setStatusMember(string statusMember) {
            this->statusMember = statusMember;
        }

        string getRiwayatTransaksi() {
            return riwayatTransaksi;
        }

        void setRiwayatTransaksi(string riwayatTransaksi) {
            this->riwayatTransaksi = riwayatTransaksi;
        }

        LoyaltyPoint getLoyalty() {
            return loyalty;
        }

        void setLoyalty(LoyaltyPoint loyalty) {
            this->loyalty = loyalty;
        }
        ~Pelanggan(){}
};
