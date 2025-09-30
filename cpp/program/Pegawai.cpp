#include <iostream>
#include "Orang.h"
using namespace std;

/* Class Pegawai yang mewarisi Orang */
class Pegawai : public Orang{
    protected:
        string kodePegawai;   // Kode unik pegawai
        string jabatan;       // Jabatan pegawai (misal: Kasir, Manager, dll)
        string gaji;          // Gaji pegawai (disimpan sebagai string)
        string shift;         // Shift kerja (misal: Pagi, Malam)

    public:
        // Constructor kosong
        Pegawai() : Orang() {
            kodePegawai = "";
            jabatan = "";
            gaji = "";
            shift = "";
        }

        // Constructor lengkap
        Pegawai(string noHp, string email, string alamat,
                string nama, int usia, string tanggalLahir,
                string kodePegawai, string jabatan, string gaji, string shift)
                : Orang(noHp, email, alamat, nama, usia, tanggalLahir) {
            this->kodePegawai = kodePegawai;
            this->jabatan = jabatan;
            this->gaji = gaji;
            this->shift = shift;
        }

        // Getter dan Setter
        string getKodePegawai() {
            return kodePegawai;
        }

        void setKodePegawai(string kodePegawai) {
            this->kodePegawai = kodePegawai;
        }

        string getJabatan() {
            return jabatan;
        }

        void setJabatan(string jabatan) {
            this->jabatan = jabatan;
        }

        string getGaji() {
            return gaji;
        }

        void setGaji(string gaji) {
            this->gaji = gaji;
        }

        string getShift() {
            return shift;
        }

        void setShift(string shift) {
            this->shift = shift;
        }
        ~Pegawai(){}
};
