public class Main {
    public static void main(String[] args) {

        // Bagian awal kita sengaja menampilkan kondisi kosong dulu,
        // supaya user tahu kalau database pelanggan belum ada isinya.
        System.out.println("=== Data Pelanggan SEBELUM DIMASUKKAN ===");
        System.out.println("Belum ada data pelanggan.\n");

        // Setelah itu, langsung dibuat dua objek Pelanggan dengan data hardcode.
        Pelanggan pelanggan1 = new Pelanggan(
            "0811111111", "andi@gmail.com", "Jl. Merdeka 1",
            "Andi", 25, "2000-01-01",
            "C001", "2000000", 5, "Gold", "Belanja mingguan"
        );
        Pelanggan pelanggan2 = new Pelanggan(
            "0822222222", "budi@gmail.com", "Jl. Merdeka 2",
            "Budi", 30, "1995-05-12",
            "C002", "1500000", 3, "Silver", "Belanja bulanan"
        );

        /* Setelah objek tersedia, kita tampilkan ulang sebagai pembanding.
         Data ditaruh di array supaya lebih mudah di-looping. */
        System.out.println("=== Data Pelanggan SETELAH DIMASUKKAN ===");
        Pelanggan[] daftarPelanggan = {pelanggan1, pelanggan2};
        for (Pelanggan p : daftarPelanggan) {
            System.out.println(
                "\nKode: " + p.getKodePelanggan() +
                "\nNama: " + p.getNama() +
                "\nUsia: " + p.getUsia() +
                "\nSaldo: " + p.getSaldo() +
                "\nKuantitas: " + p.getKuantitas() +
                "\nStatus: " + p.getStatusMember() +
                "\nRiwayat: " + p.getRiwayatTransaksi() +
                "\nNoHp: " + p.getNoHp() +
                "\nEmail: " + p.getEmail() +
                "\nAlamat: " + p.getAlamat()
            );
        }

        /* Untuk pegawai, konsepnya mirip pelanggan,
         tapi atribut yang ditampilkan lebih fokus ke pekerjaan. */
        System.out.println("\n=== Data Pegawai SEBELUM DIMASUKKAN ===");
        System.out.println("Belum ada data pegawai.\n");

        // Buat objek pegawai, masing-masing dengan role berbeda (Kasir & Manager).
        Pegawai pegawai1 = new Pegawai(
            "0833333333", "sari@gmail.com", "Jl. Merdeka 3",
            "Sari", 28, "1997-07-21",
            "P001", "Kasir", "4000000", "Pagi"
        );
        Pegawai pegawai2 = new Pegawai(
            "0844444444", "dina@gmail.com", "Jl. Merdeka 4",
            "Dina", 35, "1990-10-11",
            "P002", "Manager", "8000000", "Full Day"
        );

        // Loop untuk menampilkan pegawai, sekaligus menunjukkan perbedaan jabatan.
        System.out.println("=== Data Pegawai SETELAH DIMASUKKAN ===");
        Pegawai[] daftarPegawai = {pegawai1, pegawai2};
        for (Pegawai pg : daftarPegawai) {
            System.out.println(
                "\nKode: " + pg.getKodePegawai() +
                "\nNama: " + pg.getNama() +
                "\nUsia: " + pg.getUsia() +
                "\nJabatan: " + pg.getJabatan() +
                "\nGaji: " + pg.getGaji() +
                "\nShift: " + pg.getShift() +
                "\nNoHp: " + pg.getNoHp() +
                "\nEmail: " + pg.getEmail() +
                "\nAlamat: " + pg.getAlamat()
            );
        }

        // Produk lebih sederhana, jadi cukup tunjukkan stok dan harga.
        System.out.println("\n=== Data Produk SEBELUM DIMASUKKAN ===");
        System.out.println("Belum ada data produk.\n");

        Produk produk1 = new Produk("PR001", "Beras 5kg", "70000", 50);
        Produk produk2 = new Produk("PR002", "Minyak 2L", "40000", 30);

        // Setelah ada produk, langsung tampilkan biar kelihatan stok gudangnya.
        System.out.println("=== Data Produk SETELAH DIMASUKKAN ===");
        Produk[] daftarProduk = {produk1, produk2};
        for (Produk pr : daftarProduk) {
            System.out.println(
                "\nKode: " + pr.getKodeProduk() +
                "\nNama: " + pr.getNama() +
                "\nHarga: " + pr.getHarga() +
                "\nStok: " + pr.getStok()
            );
        }

        // Supplier di sini jadi penting karena mereka sumber barang untuk supermarket.
        System.out.println("\n=== Data Supplier SEBELUM DIMASUKKAN ===");
        System.out.println("Belum ada data supplier.\n");

        Supplier supplier1 = new Supplier(
            "0855555555", "sup1@gmail.com", "Jl. Industri 1",
            "Supplier Beras", 1990, "Sembako",
            "S001", "Beras, Gula", "10 Tahun"
        );
        Supplier supplier2 = new Supplier(
            "0866666666", "sup2@gmail.com", "Jl. Industri 2",
            "Supplier Minyak", 2000, "Sembako",
            "S002", "Minyak, Tepung", "5 Tahun"
        );

        // Setelah supplier tersedia, kita bisa lihat produk yang mereka suplai.
        System.out.println("=== Data Supplier SETELAH DIMASUKKAN ===");
        Supplier[] daftarSupplier = {supplier1, supplier2};
        for (Supplier s : daftarSupplier) {
            System.out.println(
                "\nKode: " + s.getKodeSupplier() +
                "\nNama: " + s.getNama() +
                "\nTahun Berdiri: " + s.getTahunBerdiri() +
                "\nProduk: " + s.getDaftarProdukSupplier() +
                "\nLama Kerjasama: " + s.getLamaKerjasama() +
                "\nNoHp: " + s.getNoHp() +
                "\nEmail: " + s.getEmail() +
                "\nAlamat: " + s.getAlamat()
            );
        }

        // Bagian terakhir: supermarket itu sendiri.
        // Ini ibarat "pusat" yang menghubungkan semua data di atas.
        System.out.println("\n=== Data Supermarket SEBELUM DIMASUKKAN ===");
        System.out.println("Belum ada data supermarket.\n");

        Supermarket supermarket = new Supermarket(
            "0877777777", "sm@gmail.com", "Jl. Raya Supermarket",
            "Supermart Sejahtera", 2010, "Retail",
            "SM001", "Jakarta", "2000 m2", "08.00 - 22.00"
        );

        // Setelah objek supermarket dibuat, langsung ditampilkan
        // agar terlihat identitas toko yang menaungi semuanya.
        System.out.println("=== Data Supermarket SETELAH DIMASUKKAN ===");
        System.out.println(
            "\nKode: " + supermarket.getKodeSupermarket() +
            "\nNama: " + supermarket.getNama() +
            "\nTahun Berdiri: " + supermarket.getTahunBerdiri() +
            "\nLokasi: " + supermarket.getLokasi() +
            "\nLuas Toko: " + supermarket.getLuasToko() +
            "\nJam Operasional: " + supermarket.getJamOperasional() +
            "\nNoHp: " + supermarket.getNoHp() +
            "\nEmail: " + supermarket.getEmail() +
            "\nAlamat: " + supermarket.getAlamat()
        );
    }
}
