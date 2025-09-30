# class Produk
class Produk:

    def __init__(self, kodeProduk: str, nama: str, harga: str, stok: int):
        self._kodeProduk = str(kodeProduk)
        self._nama = str(nama)
        self._harga = str(harga)   # disimpan string biar konsisten sama saldo/gaji
        self._stok = int(stok)

    # Getter & Setter Kode Produk
    def getKodeProduk(self) -> str:
        return self._kodeProduk

    def setKodeProduk(self, kodeProduk: str) -> None:
        self._kodeProduk = str(kodeProduk)

    # Getter & Setter Nama
    def getNama(self) -> str:
        return self._nama

    def setNama(self, nama: str) -> None:
        self._nama = str(nama)

    # Getter & Setter Harga
    def getHarga(self) -> str:
        return self._harga

    def setHarga(self, harga: str) -> None:
        self._harga = str(harga)

    # Getter & Setter Stok
    def getStok(self) -> int:
        return self._stok

    def setStok(self, stok: int) -> None:
        self._stok = int(stok)
