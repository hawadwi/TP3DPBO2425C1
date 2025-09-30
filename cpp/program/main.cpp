#include <iostream>
#include "Produk.cpp"
#include "LoyaltyPoint.h"
#include "Pelanggan.cpp"
#include "Perusahaan.h"
#include "Supplier.cpp"
#include "Supermarket.cpp"
#include "Pegawai.cpp"

using namespace std;

int main() {

    // Kita siapkan array untuk menyimpan banyak data.
    // Masing-masing array bisa menampung sampai 100 data.
    Produk daftarProduk[100];
    LoyaltyPoint daftarLoyalty[100];
    Pelanggan daftarPelanggan[100];
    Supplier daftarSupplier[100];
    Supermarket daftarSupermarket[100];
    Pegawai daftarPegawai[100];

    // Variabel ini untuk melacak jumlah data yang sudah dimasukkan.
    int jumlahProduk = 0, jumlahLoyalty = 0, jumlahPelanggan = 0;
    int jumlahSupplier = 0, jumlahSupermarket = 0, jumlahPegawai = 0;

    cout << "=== SUPERMARKET ===\n\n";

    // Sebelum data dimasukkan, kita kasih tahu ke user kalau masih kosong.
    cout << "DATA SUPERMARKET SEBELUM DIMASUKKAN\n";
    if (jumlahProduk == 0) {
        cout << "Belum ada data produk.\n";
    }

    cout << "\nDATA SUPERMARKET SETELAH DIMASUKKAN\n";
    printf("\n");

    //  1) Produk 
    // Buat objek produk langsung dengan constructor.
    Produk produk1("PRD001", "Beras 5kg", "75000", 120);

    // Tampilkan data produk yang baru saja dibuat.
    cout << "[Produk]\n";
    cout << "Kode: " << produk1.getKodeProduk() << "\n";
    cout << "Nama: " << produk1.getNama() << "\n";
    cout << "Harga: " << produk1.getHarga() << "\n";
    cout << "Stok: " << produk1.getStok() << "\n\n";

    //  2) LoyaltyPoint + Pelanggan 
    // LoyaltyPoint dipisah supaya bisa dihubungkan dengan pelanggan.
    LoyaltyPoint LPoint1(1500, "Gold", "Voucher 50k");

    // Pelanggan punya informasi kontak + data transaksi,
    // lalu kita tambahkan juga objek LoyaltyPoint ke dalamnya.
    Pelanggan pelanggan1(
        "081234567890", "pelanggan@example.com", "Jl. Melati No. 10",
        "Andi", 28, "12-04-1997",
        "CUST-001", "200000", 3, "Aktif", "TRX001, TRX002", LPoint1
    );

    // Cetak data pelanggan lengkap dengan loyalty point-nya.
    cout << "[Pelanggan]\n";
    cout << "Kode: " << pelanggan1.getKodePelanggan() << "\n";
    cout << "Nama: " << pelanggan1.getNama() << "\n";
    cout << "Saldo: " << pelanggan1.getSaldo() << "\n";
    cout << "Kuantitas: " << pelanggan1.getKuantitas() << "\n";
    cout << "Status Member: " << pelanggan1.getStatusMember() << "\n";
    cout << "Riwayat: " << pelanggan1.getRiwayatTransaksi() << "\n";
    cout << "Loyalty Level: " << pelanggan1.getLoyalty().getLevel() << "\n";
    cout << "Loyalty Point: " << pelanggan1.getLoyalty().getTotalPoint() << "\n";
    cout << "Loyalty Bonus: " << pelanggan1.getLoyalty().getBonusSpesial() << "\n\n";

    //  3) Supplier & Supermarket 
    // Supplier adalah turunan dari Perusahaan, jadi punya data perusahaan + data tambahan.
    Supplier suplier1(
        "021-555-111", "supplier@company.com", "Kawasan Industri A No.1",
        "PT Sumber Pangan", 2005, "Distributor Bahan Pangan",
        "SUP-001", "Beras, Gula, Minyak", "7 tahun"
    );

    // Supermarket juga turunan dari Perusahaan, tapi atributnya berbeda.
    Supermarket supermarket1(
        "021-999-777", "cs@martku.com", "Jl. Sudirman No. 1",
        "MartKu", 2010, "Ritel",
        "SM-001", "Jakarta Pusat", "2500 m2", "08:00 - 22:00"
    );

    // Cetak informasi supplier
    cout << "[Supplier]\n";
    cout << "Kode: " << suplier1.getKodeSupplier() << "\n";
    cout << "Nama: " << suplier1.getNama() << "\n";
    cout << "Bidang: " << suplier1.getBidangUsaha() << "\n";
    cout << "Produk: " << suplier1.getDaftarProdukSupplier() << "\n";
    cout << "Lama Kerjasama: " << suplier1.getLamaKerjasama() << "\n\n";

    // Cetak informasi supermarket
    cout << "[Supermarket]\n";
    cout << "Kode: " << supermarket1.getKodeSupermarket() << "\n";
    cout << "Nama: " << supermarket1.getNama() << "\n";
    cout << "Lokasi: " << supermarket1.getLokasi() << "\n";
    cout << "Luas Toko: " << supermarket1.getLuasToko() << "\n";
    cout << "Jam Operasional: " << supermarket1.getJamOperasional() << "\n\n";

    //  4) Pegawai 
    // Pegawai adalah turunan dari Orang, jadi selain nama & kontak,
    // ada tambahan jabatan, gaji, dan shift.
    Pegawai pegawai1(
        "0812-000-111", "kasir@martku.com", "Jl. Sudirman No. 1",
        "Budi", 24, "01-01-2001",
        "EMP-001", "Kasir", "4500000", "Pagi"
    );

    // Cetak informasi pegawai
    cout << "[Pegawai]\n";
    cout << "Kode: " << pegawai1.getKodePegawai() << "\n";
    cout << "Nama: " << pegawai1.getNama() << "\n";
    cout << "Jabatan: " << pegawai1.getJabatan() << "\n";
    cout << "Shift: " << pegawai1.getShift() << "\n\n";

    //  Simpan data ke array 
    // Setelah semua objek dibuat, kita simpan ke array masing-masing.
    daftarProduk[jumlahProduk++] = produk1;
    daftarLoyalty[jumlahLoyalty++] = LPoint1;
    daftarPelanggan[jumlahPelanggan++] = pelanggan1;
    daftarSupplier[jumlahSupplier++] = suplier1;
    daftarSupermarket[jumlahSupermarket++] = supermarket1;
    daftarPegawai[jumlahPegawai++] = pegawai1;

    // Biasanya di tahap ini kita bisa update data (misalnya stok berkurang setelah transaksi),
    // tapi untuk contoh ini kita cukup simpan saja.

    cout << "=== Selesai ===";
    return 0;
}
