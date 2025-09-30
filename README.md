# TP3DPBO2425C1

Saya Hawa Dwiafina Azahra dengan NIM 2400336 mengerjakan Tugas Praktikum 3 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.


<img width="1400" height="850" alt="DESIGN 2 TP 3" src="https://github.com/user-attachments/assets/77fa2396-c557-4268-84eb-45213d6e6231" />

#### ATRIBUT & METHODS

- Class InformasiKontak
Di class ini, kita menyimpan informasi dasar tentang kontak seseorang atau sebuah perusahaan. Ada tiga atribut utama, yaitu nomor HP, email, dan alamat. Semuanya dibuat dalam bentuk string supaya mudah menampung teks. Atribut ini sengaja dibuat protected, tujuannya supaya tetap aman (nggak bisa diakses langsung dari luar), tapi tetap bisa diwarisi oleh class lain. Di dalamnya ada dua constructor: yang pertama constructor kosong, jadi kalau bikin objek tanpa kasih nilai apa-apa, otomatis semua atribut jadi string kosong. Yang kedua constructor lengkap, di sini kita bisa langsung isi nomor HP, email, dan alamat saat objek dibuat. Supaya data bisa diakses dan diubah dengan aman, class ini menyediakan getter dan setter untuk masing-masing atribut. Terakhir ada destructor, yang akan dipanggil otomatis ketika objek dihapus.

- Class Orang
Class ini diturunkan dari InformasiKontak, artinya selain punya nomor HP, email, dan alamat, orang juga punya data tambahan seperti nama, usia, dan tanggal lahir. Semua atribut ini disimpan sebagai private supaya hanya bisa diubah lewat method yang disediakan. Constructor di sini memanggil constructor InformasiKontak dulu untuk isi data kontak, baru setelah itu menyimpan nama, usia, dan tanggal lahir. Ada juga getter dan setter untuk tiap atribut supaya kita bisa lihat atau ubah datanya dengan cara yang lebih terkontrol.

- Class Pelanggan
Mirip dengan pegawai, class ini juga diturunkan dari Orang. Bedanya, pelanggan punya atribut sendiri seperti kode pelanggan (ID unik pelanggan), saldo (jumlah uang di akun), kuantitas (berapa banyak transaksi atau barang yang dibeli), status member (misalnya Gold, Silver, dsb), dan riwayat transaksi. Dengan begitu, kita bisa tahu profil lengkap seorang pelanggan, mulai dari data kontak, data pribadi, sampai catatan belanjanya. Constructor-nya mengisi semua data ini sekaligus. Getter dan setter juga tersedia untuk setiap atribut, jadi kalau mau ambil saldo pelanggan atau mengupdate status member, tinggal lewat method yang sudah ada.

- Class Perusahaan
Kalau perusahaan, turunan ini berasal dari InformasiKontak. Jadi sama-sama punya nomor HP, email, dan alamat. Bedanya, perusahaan ditambah atribut khusus seperti nama perusahaan, tahun berdiri, dan bidang usaha. Dengan begitu kita bisa tahu identitas perusahaan secara lengkap. Constructor-nya dipakai untuk langsung mengisi semua data ini, sementara getter dan setter dipakai untuk mengambil atau mengubah data perusahaan.

- Class Supplier
Supplier adalah turunan dari Perusahaan, jadi selain punya data kontak dan identitas perusahaan, supplier juga punya atribut tambahan: kode supplier (identitas unik), daftar produk yang disediakan, dan lama kerjasama dengan supermarket. Ini penting untuk memetakan siapa saja partner bisnis kita dan produk apa saja yang mereka suplai. Constructor dipakai untuk langsung mengisi semua informasi ini. Getter dan setter juga disediakan untuk akses data secara rapi.

- Class Supermarket
Supermarket juga turunan dari Perusahaan, tapi punya atribut tambahan yang lebih spesifik, seperti kode supermarket, lokasi toko, luas toko, dan jam operasional. Informasi ini membantu mendeskripsikan supermarket secara detail, baik dari sisi identitas maupun operasional. Constructor-nya dipakai untuk langsung menyusun semua data ini saat objek dibuat. Getter dan setter tentu ada untuk memudahkan akses dan perubahan data, misalnya kalau jam operasional berubah atau supermarket pindah lokasi.

- Class Produk
Terakhir ada class Produk. Produk tidak diturunkan dari class lain, jadi berdiri sendiri. Atributnya ada empat: kode produk sebagai identitas unik, nama produk, harga, dan stok. Dengan empat atribut ini, produk bisa dikelola dengan mudah, misalnya untuk transaksi penjualan atau pengecekan inventori. Constructor dipakai untuk langsung mengisi semua data produk saat objek dibuat. Sama seperti class lain, produk juga punya getter dan setter untuk setiap atribut supaya mudah dicek atau diubah nilainya.

#### DESIGN PROGRAM

- Dasar: InformasiKontak
Semua orang dan perusahaan pasti punya kontak, kan? Nomor HP, email, alamat. Nah, supaya nggak nulis ulang terus di tiap class, dibuatlah class dasar bernama InformasiKontak. Class ini jadi pondasi yang bisa dipakai ulang. Jadi ibaratnya: semua yang butuh identitas kontak, tinggal “numpang” dari sini.

- Turunan Pertama: Orang dan Perusahaan
Dari InformasiKontak, kita punya dua cabang besar:

  - Orang → dipakai untuk menyimpan data pribadi manusia. Misalnya nama, usia, dan tanggal lahir. Semua orang ini tetap bawa atribut kontak tadi, karena mereka turunan dari InformasiKontak.
  
  - Perusahaan → ini untuk lembaga atau badan usaha. Selain kontak, mereka punya tambahan info seperti nama perusahaan, tahun berdiri, dan bidang usaha.

- Turunan Kedua: Pegawai dan Pelanggan dari Orang
  - Pegawai → ini representasi orang yang bekerja di supermarket. Mereka punya atribut tambahan seperti kode pegawai, jabatan, gaji, dan shift kerja. Jadi dari satu orang, sekarang statusnya jadi pegawai dengan peran di perusahaan.
  
  - Pelanggan → ini orang yang belanja di supermarket. Mereka punya identitas khusus pelanggan, seperti kode pelanggan, saldo, kuantitas transaksi, status member, dan riwayat transaksi. Jadi meski sama-sama “orang”, data yang disimpan beda sesuai perannya.

- Turunan Kedua: Supplier dan Supermarket dari Perusahaan
Perusahaan juga bercabang jadi dua:

  - Supplier → perusahaan yang memasok barang ke supermarket. Makanya ada tambahan data seperti kode supplier, daftar produk yang disediakan, dan lama kerjasama.
  
  - Supermarket → perusahaan ritel yang menjual produk langsung ke pelanggan. Tambahannya ada kode supermarket, lokasi, luas toko, dan jam operasional.

- Produk: Agregasi dengan Supermarket
Produk ini bukan turunan dari siapapun, tapi perannya penting karena berhubungan langsung dengan supermarket. Produk disimpan dan dikelola oleh supermarket untuk dijual ke pelanggan. Hubungan antara Supermarket dan Produk termasuk aggregation: supermarket “memiliki” banyak produk, tapi produk itu tetap bisa eksis walau supermarket tertentu tutup (misalnya produk sama dijual di supermarket lain). Jadi Produk ini bukan sekadar entitas mandiri, tapi bagian dari sistem yang hidup bersama supermarket.

- LoyaltyPoint:
Pelanggan punya bonus tambahan berupa poin loyalitas. Poin ini disimpan di class LoyaltyPoint, yang berisi total poin, level, dan bonus spesial. Class ini tidak diwarisi dari siapapun, tapi digunakan di dalam class Pelanggan (composition / has-a relationship). Jadi seorang pelanggan bisa “memiliki” loyalty point.

#### ALUR PROGRAM

- Mulai dari class dasar → InformasiKontak
Program dimulai dengan pondasi: semua orang dan perusahaan punya nomor HP, email, dan alamat. Biar nggak nulis ulang di setiap class, atribut ini disatukan dalam class dasar. Nantinya class lain bisa tinggal mewarisi (inheritance) bagian ini.

- Cabang pertama: Orang dan Perusahaan
Dari InformasiKontak, program bercabang jadi dua jalur besar:
  - Orang → menyimpan data manusia (nama, usia, tanggal lahir).
  - Perusahaan → menyimpan data institusi (nama perusahaan, tahun berdiri, bidang usaha).
Jadi ada dua tipe entitas utama: individu dan lembaga.

- Cabang kedua dari Orang: Pegawai & Pelanggan
  - Pegawai → orang yang bekerja di supermarket, ditambah data spesifik seperti kode pegawai, jabatan, gaji, dan shift kerja.
  - Pelanggan → orang yang belanja, dengan atribut khusus seperti kode pelanggan, saldo, jumlah transaksi, status membership, dan riwayat belanja. Di sini, pelanggan juga punya LoyaltyPoint sebagai bonus tambahan (composition/has-a).

- Cabang kedua dari Perusahaan: Supplier & Supermarket
  - Supplier → perusahaan pemasok barang ke supermarket. Punya kode supplier, daftar produk yang disediakan, dan lama kerjasama.
  - Supermarket → perusahaan ritel yang langsung menjual barang ke konsumen. Ada atribut tambahan seperti kode supermarket, lokasi, luas toko, dan jam operasional.

- Produk sebagai entitas penting (aggregation dengan supermarket)
Produk dibuat sebagai class terpisah karena bukan orang dan bukan perusahaan. Tapi produk sangat penting:
  - Supplier menyediakan produk.
  - Supermarket menjual produk (hubungan aggregation → supermarket punya banyak produk, tapi produk juga bisa ada di supermarket lain).
  - Pelanggan membeli produk (hubungan association → pelanggan hanya menggunakan produk dalam transaksi).

- Bagian Main / Program Utama
  - Pertama, program menyiapkan array/list/daftar kosong untuk menampung banyak data (produk, pelanggan, pegawai, supplier, supermarket).
  - Lalu, ditampilkan dulu pesan “belum ada data” → ini untuk menunjukkan kondisi awal.
  - Setelah itu, data dimasukkan secara hardcode (pakai constructor masing-masing class untuk bikin objek → misalnya Produk("PR001", "Beras 5kg", "70000", 50)).
  - Setiap objek yang dibuat langsung ditampilkan (print/println/cout), agar terlihat detail isinya.
  - Di bagian akhir, semua objek juga disimpan ke array/list untuk mensimulasikan database sederhana.
  - Alur Data dari Awal sampai Akhir
  - Input awal → belum ada data.
  - Pembuatan objek → isi data pelanggan, pegawai, produk, supplier, supermarket.
  - Output → tampilkan data yang baru saja dibuat.
  - Penyimpanan → simpan semua objek ke dalam array/list untuk dipakai lagi jika perlu.
  - Akhir program → program berhenti setelah semua data berhasil ditampilkan.
 
#### DOKUMENTASI

CPP 

<img width="1076" height="720" alt="1" src="https://github.com/user-attachments/assets/4d5f2bca-860c-4562-89a3-4efd519c34bd" />

<img width="533" height="720" alt="2" src="https://github.com/user-attachments/assets/fe5e4c5f-997a-4ca1-863e-07e6ffffaa73" />

PYTHON

<img width="990" height="720" alt="1" src="https://github.com/user-attachments/assets/53ec286a-870c-4a19-9700-124d93dd0edb" />

<img width="543" height="720" alt="2" src="https://github.com/user-attachments/assets/4d1e6393-c41c-4c42-ba3f-fe62e2e96e97" />

<img width="518" height="720" alt="3" src="https://github.com/user-attachments/assets/b55e6441-3e11-45f3-8e0a-e8a6874facd2" />

JAVA

<img width="930" height="720" alt="1" src="https://github.com/user-attachments/assets/82d56088-aa69-4607-b703-51bbe183c6df" />

<img width="675" height="684" alt="2" src="https://github.com/user-attachments/assets/7a406afc-382b-44a9-83f7-e4a1f6da7019" />

<img width="540" height="720" alt="3" src="https://github.com/user-attachments/assets/f8174076-b056-4c9f-b5cc-4ba7e7b474f0" />


