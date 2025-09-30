from Perusahaan import Perusahaan

# subclass Supplier
class Supplier(Perusahaan):

    def __init__(self, noHp: str, email: str, alamat: str,
                 nama: str, tahunBerdiri: int, bidangUsaha: str,
                 kodeSupplier: str, daftarProdukSupplier: str, lamaKerjasama: str):
        # panggil constructor parent (Perusahaan)
        super().__init__(noHp, email, alamat, nama, tahunBerdiri, bidangUsaha)
        # atribut khusus Supplier
        self._kodeSupplier = str(kodeSupplier)
        self._daftarProdukSupplier = str(daftarProdukSupplier)
        self._lamaKerjasama = str(lamaKerjasama)

    # Getter & Setter Kode Supplier
    def getKodeSupplier(self) -> str:
        return self._kodeSupplier

    def setKodeSupplier(self, kodeSupplier: str) -> None:
        self._kodeSupplier = str(kodeSupplier)

    # Getter & Setter Daftar Produk Supplier
    def getDaftarProdukSupplier(self) -> str:
        return self._daftarProdukSupplier

    def setDaftarProdukSupplier(self, daftarProdukSupplier: str) -> None:
        self._daftarProdukSupplier = str(daftarProdukSupplier)

    # Getter & Setter Lama Kerjasama
    def getLamaKerjasama(self) -> str:
        return self._lamaKerjasama

    def setLamaKerjasama(self, lamaKerjasama: str) -> None:
        self._lamaKerjasama = str(lamaKerjasama)
