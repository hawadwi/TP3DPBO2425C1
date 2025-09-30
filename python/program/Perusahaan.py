from InformasiKontak import InformasiKontak

# subclass Perusahaan
class Perusahaan(InformasiKontak):

    def __init__(self, noHp: str, email: str, alamat: str,
                 nama: str, tahunBerdiri: int, bidangUsaha: str):
        # panggil constructor parent
        super().__init__(noHp, email, alamat)
        # atribut khusus Perusahaan
        self._nama = str(nama)
        self._tahunBerdiri = int(tahunBerdiri)
        self._bidangUsaha = str(bidangUsaha)

    # Getter & Setter Nama
    def getNama(self) -> str:
        return self._nama
    
    def setNama(self, nama: str) -> None:
        self._nama = str(nama)

    # Getter & Setter Tahun Berdiri
    def getTahunBerdiri(self) -> int:
        return self._tahunBerdiri
    
    def setTahunBerdiri(self, tahunBerdiri: int) -> None:
        self._tahunBerdiri = int(tahunBerdiri)

    # Getter & Setter Bidang Usaha
    def getBidangUsaha(self) -> str:
        return self._bidangUsaha
    
    def setBidangUsaha(self, bidangUsaha: str) -> None:
        self._bidangUsaha = str(bidangUsaha)
