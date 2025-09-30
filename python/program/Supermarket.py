from Perusahaan import Perusahaan

# subclass Supermarket
class Supermarket(Perusahaan):

    def __init__(self, noHp: str, email: str, alamat: str,
                 nama: str, tahunBerdiri: int, bidangUsaha: str,
                 kodeSupermarket: str, lokasi: str, luasToko: str, jamOperasional: str):
        # panggil constructor parent (Perusahaan)
        super().__init__(noHp, email, alamat, nama, tahunBerdiri, bidangUsaha)
        # atribut khusus Supermarket
        self._kodeSupermarket = str(kodeSupermarket)
        self._lokasi = str(lokasi)
        self._luasToko = str(luasToko)
        self._jamOperasional = str(jamOperasional)

    # Getter & Setter Kode Supermarket
    def getKodeSupermarket(self) -> str:
        return self._kodeSupermarket

    def setKodeSupermarket(self, kodeSupermarket: str) -> None:
        self._kodeSupermarket = str(kodeSupermarket)

    # Getter & Setter Lokasi
    def getLokasi(self) -> str:
        return self._lokasi

    def setLokasi(self, lokasi: str) -> None:
        self._lokasi = str(lokasi)

    # Getter & Setter Luas Toko
    def getLuasToko(self) -> str:
        return self._luasToko

    def setLuasToko(self, luasToko: str) -> None:
        self._luasToko = str(luasToko)

    # Getter & Setter Jam Operasional
    def getJamOperasional(self) -> str:
        return self._jamOperasional

    def setJamOperasional(self, jamOperasional: str) -> None:
        self._jamOperasional = str(jamOperasional)
