from InformasiKontak import InformasiKontak

# subclass Orang
class Orang(InformasiKontak):
    
    def __init__(self, noHp: str, email: str, alamat: str,
                 nama: str, usia: int, tanggalLahir: str):
        # panggil constructor parent
        super().__init__(noHp, email, alamat)
        # atribut khusus Orang
        self._nama = str(nama)
        self._usia = int(usia)
        self._tanggalLahir = str(tanggalLahir)

    # Getter & Setter Nama
    def getNama(self) -> str:
        return self._nama
    
    def setNama(self, nama: str) -> None:
        self._nama = str(nama)

    # Getter & Setter Usia
    def getUsia(self) -> int:
        return self._usia
    
    def setUsia(self, usia: int) -> None:
        self._usia = int(usia)

    # Getter & Setter Tanggal Lahir
    def getTanggalLahir(self) -> str:
        return self._tanggalLahir
    
    def setTanggalLahir(self, tanggalLahir: str) -> None:
        self._tanggalLahir = str(tanggalLahir)
