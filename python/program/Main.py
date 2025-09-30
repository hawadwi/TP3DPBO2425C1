from Pelanggan import Pelanggan
from Pegawai import Pegawai
from Produk import Produk
from Supplier import Supplier
from Supermarket import Supermarket


def main():
    # Pertama kita buat dua pelanggan.
    # Setiap pelanggan punya info kontak, identitas pribadi, dan detail belanja.
    pelanggan1 = Pelanggan("0811111111", "andi@gmail.com", "Jl. Merdeka 1",
                           "Andi", 25, "2000-01-01",
                           "C001", "2000000", 5, "Gold", "Belanja mingguan")
    pelanggan2 = Pelanggan("0822222222", "budi@gmail.com", "Jl. Merdeka 2",
                           "Budi", 30, "1995-05-12",
                           "C002", "1500000", 3, "Silver", "Belanja bulanan")

    # Lanjut bikin data pegawai.
    # Di sini ada pegawai dengan jabatan berbeda, satu kasir satu lagi manager.
    pegawai1 = Pegawai("0833333333", "sari@gmail.com", "Jl. Merdeka 3",
                       "Sari", 28, "1997-07-21",
                       "P001", "Kasir", "4000000", "Pagi")
    pegawai2 = Pegawai("0844444444", "dina@gmail.com", "Jl. Merdeka 4",
                       "Dina", 35, "1990-10-11",
                       "P002", "Manager", "8000000", "Full Day")

    # Sekarang data produk.
    # Masing-masing produk punya kode unik, nama barang, harga, dan jumlah stok.
    produk1 = Produk("PR001", "Beras 5kg", "70000", 50)
    produk2 = Produk("PR002", "Minyak 2L", "40000", 30)

    # Berikutnya data supplier.
    # Supplier ini merupakan perusahaan yang menyediakan barang ke supermarket.
    # Makanya ada atribut tambahan: produk yang dipasok dan lama kerjasama.
    supplier1 = Supplier("0855555555", "sup1@gmail.com", "Jl. Industri 1",
                         "Supplier Beras", 1990, "Sembako",
                         "S001", "Beras, Gula", "10 Tahun")
    supplier2 = Supplier("0866666666", "sup2@gmail.com", "Jl. Industri 2",
                         "Supplier Minyak", 2000, "Sembako",
                         "S002", "Minyak, Tepung", "5 Tahun")

    # Terakhir kita buat data supermarket.
    # Objek ini menggambarkan toko induk yang mengelola semuanya.
    supermarket = Supermarket("0877777777", "sm@gmail.com", "Jl. Raya Supermarket",
                              "Supermart Sejahtera", 2010, "Retail",
                              "SM001", "Jakarta", "2000 m2", "08.00 - 22.00")

    #  Cetak Data 
    # Setelah semua objek dibuat, sekarang kita tampilkan datanya satu per satu.

    print("=== Data Pelanggan ===")
    # Kita loop supaya bisa menampilkan semua pelanggan tanpa copy-paste kode.
    for p in [pelanggan1, pelanggan2]:
        print(f"Kode: {p.getKodePelanggan()}\nNama: {p.getNama()}\nUsia: {p.getUsia()}\n"
              f"Saldo: {p.getSaldo()}\nKuantitas: {p.getKuantitas()}\n"
              f"Status: {p.getStatusMember()}\nRiwayat: {p.getRiwayatTransaksi()}\n"
              f"NoHp: {p.getNoHp()}\nEmail: {p.getEmail()}\nAlamat: {p.getAlamat()}\n")

    print("\n=== Data Pegawai ===")
    # Sama halnya dengan pegawai, biar lebih efisien kita pakai loop.
    for pg in [pegawai1, pegawai2]:
        print(f"Kode: {pg.getKodePegawai()}\nNama: {pg.getNama()}\nUsia: {pg.getUsia()}\n"
              f"Jabatan: {pg.getJabatan()}\nGaji: {pg.getGaji()}\nShift: {pg.getShift()}\n"
              f"NoHp: {pg.getNoHp()}\nEmail: {pg.getEmail()}\nAlamat: {pg.getAlamat()}\n")

    print("\n=== Data Produk ===")
    # Produk cukup simpel, jadi kita tampilkan kode, nama, harga, dan stok.
    for pr in [produk1, produk2]:
        print(f"Kode: {pr.getKodeProduk()}\nNama: {pr.getNama()}\nHarga: {pr.getHarga()}\nStok: {pr.getStok()}\n")

    print("\n=== Data Supplier ===")
    # Data supplier menyoroti produk apa saja yang mereka pasok dan sudah berapa lama bekerja sama.
    for s in [supplier1, supplier2]:
        print(f"Kode: {s.getKodeSupplier()}\nNama: {s.getNama()}\nTahun Berdiri: {s.getTahunBerdiri()}\n"
              f"Produk: {s.getDaftarProdukSupplier()}\nLama Kerjasama: {s.getLamaKerjasama()}\n"
              f"NoHp: {s.getNoHp()}\nEmail: {s.getEmail()}\nAlamat: {s.getAlamat()}\n")

    print("\n=== Data Supermarket ===")
    # Dan terakhir, informasi supermarket sebagai pusat operasional.
    print(f"Kode: {supermarket.getKodeSupermarket()}\nNama: {supermarket.getNama()}\n"
          f"Tahun Berdiri: {supermarket.getTahunBerdiri()}\nLokasi: {supermarket.getLokasi()}\n"
          f"Luas Toko: {supermarket.getLuasToko()}\nJam: {supermarket.getJamOperasional()}\n"
          f"NoHp: {supermarket.getNoHp()}\nEmail: {supermarket.getEmail()}\nAlamat: {supermarket.getAlamat()}\n")


if __name__ == "__main__":
    main()
